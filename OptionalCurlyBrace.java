import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This program checks if loops have curly braces around them.
 * If there is a loop, it checks if there is a curly brace after the loop,
 * or if there is a curly brace in the next line.
 * If neither are present, an error is thrown.
 */
public class OptionalCurlyBrace {
    public static void main (String [] args) throws IOException {
        Scanner scanner = new Scanner(new File("zachary_opt_braces.txt"));
        PrintWriter output = new PrintWriter(new FileWriter
                ("OptionalBracesOutput.txt",true));

        int lineNum = 0;
        output.println("\"Style report by Sang Nguyen\n" +
                "\"Test program author: Zachary\n" +
                " \"Error(s) checked: Check if there are braces around loops\n" );

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineNum++;
            if (line.contains("if") && (!(line.contains("System.out.print")))
                    && (!(line.contains("{"))))
            {
                output.println("Error at line: " + lineNum + "\n");
            }
            else if (line.contains("for") && (!(line.contains("System.out.print")))
                    && (!(line.contains("{"))))
            {
                output.println("Error at line: " + lineNum+ "\n");
            }
            else if (line.contains("else") && (!(line.contains("System.out.print")))
                    && (!(line.contains("{"))))
            {
                output.println("Error at line: " + lineNum+ "\n");
            }
            else if (line.contains("do") && (!(line.contains("System.out.print")))
                    && (!(line.contains("{"))))
            {
                output.println("Error at line: " + lineNum+ "\n");
            }
            else if (line.contains("while") && (!(line.contains("System.out.print")))
                    && (!(line.contains("{"))))
            {
                output.println("Error at line: " + lineNum+ "\n");
            }
            else if (line.contains("else if") && (!(line.contains("System.out.print")))
                    && (!(line.contains("{"))))
            {
                output.println("Error at line: " + lineNum+ "\n");
            }
            else if (line.contains("if") && (!(line.contains("System.out.print"))))
            {
                line = scanner.nextLine();
                if (!(line.contains("{")))
                {
                    output.println("Error at line: " + lineNum+ "\n");
                }
            }
            else if (line.contains("else if") && (!(line.contains("System.out.print"))))
            {
                line = scanner.nextLine();
                if (!(line.contains("{")))
                {
                    output.println("Error at line: " + lineNum+ "\n");
                }
            }
            else if (line.contains("for") && (!(line.contains("System.out.print"))))
            {
                line = scanner.nextLine();
                if (!(line.contains("{")))
                {
                    output.println("Error at line: " + lineNum+ "\n");
                }
            }
            else if (line.contains("while") && (!(line.contains("System.out.print"))))
            {
                line = scanner.nextLine();
                if (!(line.contains("{")))
                {
                    output.println("Error at line: " + lineNum+ "\n");
                }
            }
            else if (line.contains("do") && (!(line.contains("System.out.print"))))
            {
                line = scanner.nextLine();
                if (!(line.contains("{")))
                {
                    output.println("Error at line: " + lineNum+ "\n");
                }
            }
            else if (line.contains("else") && (!(line.contains("System.out.print"))))
            {
                line = scanner.nextLine();
                if (!(line.contains("{")))
                {
                    output.println("Error at line: " + lineNum+ "\n");
                }
            }
        }
        scanner.close();
        output.close();
    }
}
