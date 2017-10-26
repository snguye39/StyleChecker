import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program checks if there are more than one statements per line.
 * The scanner will go through the program and count the number of time
 * the ';' shows up in a line. If more than one shows up, it will throw
 * an error, but if it is an IF loop, and it has more than 2 ';' an
 * error is thrown.
 */
public class MultipleStatements {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("Sang_statements.txt"));
        PrintWriter output = new PrintWriter("MultipleStatementsOutput.txt");
        ArrayList<String> list = new ArrayList<>();
        output.println("\"Style report by Sang Nguyen\n" +
                "\"Test program author Sang Nguyen: Sang_Multiple2.txt\n" +
                " \"Error(s) checked: Check for multiple statements on a line\n" );

        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        scanner.close();

        for(int i = 0; i < list.size(); i++) {
            String singleLine = list.get(i);

            if (singleLine.contains("for") && (countSemiColon(singleLine)> 2)) {
                output.println("Multiple codes at line " + (i + 1));
            }
            else if ((!singleLine.contains("for")) && (countSemiColon(singleLine)> 1)) {
                output.println("Multiple codes at line " + (i + 1));
            }
        }
        scanner.close();
        output.close();
    }

    /**
     * This method is used to count the number of time the char ';' shows up in a line
     * then that counter is sent to the main method to check against the cases.
     * @param line
     * @return
     */


    public static int countSemiColon(String line){
        int count = 0;
        char[] arrayOfLine = line.toCharArray();
        for (int j = 0; j < arrayOfLine.length ; j++) {

            char charCheck = arrayOfLine[j];
            if(charCheck == ';')
            {
                count++;

            }

        }
        return count;
    }

}

