/*
*This program checks for multiple errors in a program.
*The  error it will check for is brace alignment
*and another error that it will be checking for is 
*max line length.
*/
import java.util.*;
import java.util.Scanner;
import java.io.*;

public class MultipleErrorChecker2 {
    public static void main (String [] args) throws IOException {
        Scanner scanner = new Scanner(new File("Sang_multiple2.txt"));
        PrintWriter output = new PrintWriter("MultipleErrorsChecker2Output.txt");
        int lineNum = 1;
        output.println("\"Style report by Sang Nguyen\n" +
                "\"Test program author : Sang Nguyen\n" +
                " \"Error(s) checked: Check for brace alignment and" +
                " checks for max line length.\n");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineNum++;

            if ((line.contains("class") || line.contains("void"))
                    && line.contains("{")){
                line = scanner.nextLine();
                if (!(line.isEmpty())){
                    output.println("Blank line needed at line #: "
                            +lineNum);
                }
            } else if (line.contains("class") || line.contains("void")) {
                line = scanner.nextLine();
                lineNum++;
                if (line.contains("{")) {
                    line = scanner.nextLine();
                    if (!(line.isEmpty())) {
                        output.println("Blank line needed at3 line #:"
                                + lineNum);
                    }
                }
            }
            else if (line.length() > 60) {
                output.println("Line too long at line #: " +lineNum);
            }
        }
        output.close();
        scanner.close();
    }
}
                            
    