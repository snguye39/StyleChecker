import java.util.Scanner;
import java.io.*;

/**
 *This program checks if the braces are on it's own line or not.
 * If a brace is not on it's own line, an error is thrown.
 * This program finds any { } that is not on it's own line. Then
 * an error will be thrown.
 */
public class BinaryOperators {
    public static void main (String [] args) throws IOException {
        Scanner scanner = new Scanner(new File("Mark_operators.txt"));

        PrintWriter output = new PrintWriter(new FileWriter("BinaryOperatorsOutput.txt", true));
        int lineNum = 0;
        output.println("\"Style report by Sang Nguyen\\n\"\n" +
                "\"Test program author : Mark_operators\\n\" \n" +
                " \"Error(s) checked: Check for Binary operator spaces \n" );
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineNum++;
            if((line.contains("+")) && (!(line.contains((" + "))))
                    && (!(line.contains("++"))) ){
                output.println(("Spaces needed around operator(s) at line: "
                        +lineNum +"\n"));
            }
            else if((line.contains("-")) && ((!line.contains(" - ")))
                    && (!(line.contains("--")))){
                output.println(("Spaces needed around operator(s) at line: "
                        +lineNum+"\n"));
            }
            else if(line.contains("*") && (!(line.contains("/*")))
                    && (!line.contains("*/")) && (!line.contains(" * "))
                    && (!(line.contains("import")))){
                output.println(("Spaces needed around operator(s) at line: "
                        +lineNum+"\n"));
            }
            else if (line.contains("%") && (!(line.contains(" % ")))){
                output.println(("Spaces needed around operator(s) at line: "
                        +lineNum+"\n"));
            }
            else if (line.contains("/") && (!(line.contains(" / ")))
                    && (!line.contains("//")) && (!(line.contains("/*")))
                    && (!(line.contains("*/")))){
                output.println(("Spaces needed around operator(s) at line: "
                        +lineNum+"\n"));
            }
        }
        output.close();
    }
}
