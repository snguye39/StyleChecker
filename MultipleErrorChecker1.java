/*
*This program checks for multiple errors in a program.
*The  error it will check for is if there optional curly
*braces, another error that it will be checking for spaces around
*binary operators. 
*/

import java.util.Scanner;
import java.io.*;

public class MultipleErrorChecker1 {
    public static void main (String [] args) throws IOException{
        Scanner scanner = new Scanner (new File ("Sang_multiple1.txt"));
        PrintWriter output = new PrintWriter("MultipleOutput1.txt");
        int lineNum = 0;
        output.println("\"Style report by Sang Nguyen\n" +
                "\"Test program author Sang Nguyen\n" +
                " \"Error(s) checked: Check if there are optional braces and" +
                " if there are spaces around operators.\n" );

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineNum++;
            if((line.contains("+")) &&
                    (!(line.contains((" + "))))
                    && (!(line.contains("++"))) ){
                output.println(("Spaces needed around operator(s)"
                        + " at line: "
                        +lineNum + "\n"));
            }
            else if((line.contains("-")) && ((!line.contains(" - ")))
                    && (!(line.contains("--")))){
                output.println(("Spaces needed around operator(s)"
                        + " at line: "
                        +lineNum + "\n"));
            }
            else if(line.contains("*") && (!(line.contains("/*")))
                    && (!line.contains("*/"))
                    && (!line.contains(" * "))
                    && (!(line.contains("import"))))
            {
                output.println(("Spaces needed around operator(s)" +
                        " at line: "
                        +lineNum + "\n"));
            }
            else if (line.contains("%") &&
                    (!(line.contains(" % "))))
            {
                output.println(("Spaces needed around operator(s)" +
                        " at line: "
                        +lineNum + "\n"));
            }
            else if (line.contains("/") &&
                    (!(line.contains(" / ")))
                    && (!line.contains("//"))
                    && (!(line.contains("/*")))
                    && (!(line.contains("*/"))))
            {
                output.println(("Spaces needed around operator(s)" +
                        " at line: "
                        +lineNum + "\n"));
            }
            else if (line.contains("if")
                    && (!(line.contains("System.out.print")))
                    && (!(line.contains("{")))) {
                output.println("Optional braces needed at line: "
                        + lineNum + "\n");
            }
            else if (line.contains("for") &&
                    (!(line.contains("System.out.print")))
                    && (!(line.contains("{"))))
            {
                output.println("Optional braces needed at line: "
                        + lineNum + "\n");
            }
            else if (line.contains("else") &&
                    (!(line.contains("System.out.print")))
                    && (!(line.contains("{"))))
            {
                output.println("Optional braces needed at line: "
                        + lineNum + "\n");
            }
            else if (line.contains("do") &&
                    (!(line.contains("System.out.print")))
                    && (!(line.contains("{"))))
            {
                output.println("Optional braces needed at line: "
                        + lineNum + "\n");
            }
            else if (line.contains("while") &&
                    (!(line.contains("System.out.print")))
                    && (!(line.contains("{"))))
            {
                output.println("Optional braces needed at line: "
                        + lineNum + "\n");
            }
            else if (line.contains("else if") &&
                    (!(line.contains("System.out.print")))
                    && (!(line.contains("{"))))
            {
                output.println("Optional braces needed at line: "
                        + lineNum + "\n");
            }
            else if (line.contains("if") &&
                    (!(line.contains("System.out.print")))) {
                line = scanner.nextLine();
                if (!(line.contains("{")))
                {
                    output.println("Optional braces needed at line: "
                            + lineNum + "\n");
                }
            }
            else if (line.contains("else if") &&
                    (!(line.contains("System.out.print")))) {
                line = scanner.nextLine();
                if (!(line.contains("{")))
                {
                    output.println("Optional braces needed at line: "
                            + lineNum + "\n");
                }
            }
            else if (line.contains("for") &&
                    (!(line.contains("System.out.print"))))
            {
                line = scanner.nextLine();
                if (!(line.contains("{")))
                {
                    output.println("Optional braces needed at line: "
                            + lineNum + "\n");
                }
            }
            else if (line.contains("while") &&
                    (!(line.contains("System.out.print"))))
            {
                line = scanner.nextLine();
                if (!(line.contains("{")))
                {
                    output.println("Optional braces needed at line: " +
                            lineNum + "\n");
                }
            }
            else if (line.contains("do") &&
                    (!(line.contains("System.out.print"))))
            {
                line = scanner.nextLine();
                if (!(line.contains("{")))
                {
                    output.println("Optional braces needed at line: "
                            + lineNum + "\n");
                }
            }
            else if (line.contains("else") &&
                    (!(line.contains("System.out.print"))))
            {
                line = scanner.nextLine();
                if (!(line.contains("{")))
                {
                    output.println("Optional braces needed at line: "
                            + lineNum + "\n");
                }
            }
        }
        scanner.close();
        output.close();
    }
}