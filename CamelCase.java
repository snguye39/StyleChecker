import java.io.*;
import java.util.Scanner;

/**
 * This program is used to check if the first character of the class is uppercase.
 * It checks if the first character of method names is lowercase.
 * It checks if all constant characters are uppercase.
 */
public class CamelCase {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("Input.txt"));
        PrintWriter output = new PrintWriter(new FileWriter ("CamelCaseOutput.txt", true));

        output.println("\"Style report by Sang Nguyen \n" +
                "\"Test program author: Name \n" +
                " \"Error(s) checked: Check for cases in classes, methods," +
                " and constants \n" );
        int count = 0;
        while (scanner.hasNext()) {
            String line = scanner.next();
            count++;
            if (line.contains("class")) {
                line = scanner.next();
                if (Character.isLowerCase(line.charAt(0))) {
                    output.println("Camel Case Error at line " + count+ "\n");
                }
            } else if (line.contains("void")) {
                line = scanner.next();
                if (Character.isUpperCase(line.charAt(0))) {
                    output.println("Camel Case Error at line " + count+ "\n");
                }
            } else if (line.contains("final")) {
                line = scanner.next();
                if (line.contains("int") || line.contains("double")
                        || line.contains("String")) {
                    line = scanner.next();
                    if (!(line.equals(line.toUpperCase()))) {
                        output.println("Camel Case Error at line " +count + "\n");
                    }
                }
            }
        }
        output.close();
        scanner.close();
    }
}



