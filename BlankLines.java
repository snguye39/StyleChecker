import java.io.*;
import java.util.Scanner;

/**
 * This program checks if there are blank lines after methods and classes.
 * If the opening brace is on the same line it will check the next line if
 * it's blank. If the brace is on the next line, it will check after the
 * brace line to check if it's empty.
 */
public class BlankLines {
        public static void main (String [] args) throws IOException {
            Scanner scanner = new Scanner(new File("ThienNgo_blank_lines.txt"));
            PrintWriter output = new PrintWriter(new FileWriter("BlankLinesOutput.txt", true));
            int lineNum = 0;

            output.println("\"Style report by Sang Nguyen\\n\" \n" +
                    "\"Test program author: ThienNgo \\n\" \n" +
                    " \"Error(s) checked: This program checks for blank " +
                    "lines after methods " +
                    "and classes" + "  \n" );
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNum++;

                if (line.contains("class") && line.contains("{")) {
                    line = scanner.nextLine();
                    lineNum++;
                    if (!(line.isEmpty())) {
                        output.println("Blank line needed at1 line #" + lineNum
                                + "\n");
                    }
                } else if (line.contains("void") && line.contains("{")) {
                    line = scanner.nextLine();
                    lineNum++;
                    if (!(line.isEmpty())) {
                        output.println("Blank line needed at2 line #" + lineNum
                                + "\n");
                    }
                } else if (line.contains("class") || line.contains("void")) {
                    line = scanner.nextLine();
                    lineNum++;
                    if (line.contains("{")) {
                        line = scanner.nextLine();
                        if (!(line.isEmpty())) {
                            output.println("Blank line needed at3 line #:" + lineNum
                                    + "\n");
                        }
                    } break;
                }
            }
            scanner.close();
            output.close();
        }
}
