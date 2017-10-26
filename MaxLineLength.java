import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This program checks for the maximum length of a line, if the line has a length
 * of greater than 60, an error is thrown at that line.
 */
public class MaxLineLength {
    public static void main (String [] args) throws IOException {
        Scanner scanner = new Scanner(new File("Sang_linelength.txt"));
        PrintWriter output = new PrintWriter("MaxLineLengthOutput.txt");
        int lineCounter = 0;

        output.println("\"Style report by Sang Nguyen \n" +
                "\"Test program author: Sang Nguyen.txt\n" +
                " \"Error(s) checked: Check for maximum line length\n" );
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineCounter++;
            if (line.length() > 60) {
                output.println("Error found at line " +lineCounter);
            }
        }
        output.close();
        scanner.close();
    }
}
