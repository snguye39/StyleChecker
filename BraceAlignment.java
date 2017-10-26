import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This program checks if loops has a brace around them.
 * It checks for all the loops and nested loops and
 * prints out error report if brace is not found on
 * the same line as the loop.
 */
public class BraceAlignment {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("ThienNgo_align_braces.txt"));

        PrintWriter output = new PrintWriter(new FileWriter("BraceAlignmentOutput.txt", true));
        int lineNum = 0;
        output.println("\"Style report by Sang Nguyen \n" +
                "\"Test program author: ThienNgo \n" +
                " \"Error(s) checked: Check for brace alignment  \n");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineNum++;

            if (line.contains("class") && line.contains("{")) {
                output.println("Optional Brace needed at line " +lineNum +"\n");

            } else if (line.contains("void") && line.contains("{")) {
                output.println("Optional Brace needed at line " +lineNum +"\n");

            } else if ((line.contains("{") || line.contains(";")
                    || line.contains(")")) && line.contains("}")) {
                output.println("Optional Brace needed at line " +lineNum +"\n");

            } else if (line.contains("if") && line.contains("{")) {
                output.println("Optional Brace needed at line " +lineNum +"\n");

            } else if (line.contains("else if") && line.contains("{")) {
                output.println("Optional Brace needed at line " +lineNum +"\n");

            } else if (line.contains("do") && line.contains("{")) {
                output.println("Optional Brace needed at line " +lineNum +"\n");

            } else if (line.contains("while") && line.contains("{")) {
                output.println("Optional Brace needed at line " +lineNum +"\n");

            } else if (line.contains("for") && line.contains("{")) {
                output.println("Optional Brace needed at line " +lineNum +"\n");
            }
        }
        output.close();
    }
}

