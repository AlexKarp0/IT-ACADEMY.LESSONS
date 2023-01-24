package by.academy.Homework6;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    private static final String OUTPUT_FILE = "Task1.txt";
    private static final String STOP = "STOP";

    public static void main(String[] args) {
        File out_file = new File(OUTPUT_FILE);
        try {

            if (!out_file.exists()) {
                out_file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(System.in);
             BufferedOutputStream  outputStream = new BufferedOutputStream( new FileOutputStream(out_file))) {
            String s = null;
            do { s = scanner.next();
                outputStream.write(s.getBytes());
                outputStream.write("\r\n".getBytes());

            } while (!s.toUpperCase().matches(STOP));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
