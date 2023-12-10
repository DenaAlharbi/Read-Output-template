import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String FILE_NAME = "C:\\Users\\denaa\\JavaProjects231\\practice1\\src\\data.txt",FILE_NAME1 = "C:\\Users\\denaa\\JavaProjects231\\practice1\\src\\output.txt";
        try (Scanner input = new Scanner(new File(FILE_NAME))) {
            while (input.hasNextLine()) {
                ///
            }
        } catch (FileNotFoundException e) {
            System.err.format("File not found: %s%n", FILE_NAME);
        }
        PrintWriter write;
        try {
            new FileWriter(FILE_NAME1, false).close();
            write = new PrintWriter(new FileWriter(FILE_NAME1, true));
            ///
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}