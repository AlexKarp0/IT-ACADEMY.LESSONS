package by.academy.Homework6;

import java.io.*;

public class Task2 {
    private static final String REPLACED = "[ ]";
    private static final String INPUT_FILE_NAME = "Lorem.txt";
    private static final String OUTPUT_FILE_NAME = "output.txt";

    public static void main(String[] args) throws IOException {

        File lorem = new File(INPUT_FILE_NAME);
        if (!lorem.exists()) {
            lorem.createNewFile();
        }
        File outputFile = new File(OUTPUT_FILE_NAME);
        if (!outputFile.exists()) {
            outputFile.createNewFile();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(lorem));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {
            String str = null;
            //outputFile.
            while ((str = bufferedReader.readLine()) != null) {
                bufferedWriter.write(str.replaceAll(REPLACED, ""));
                bufferedWriter.write("");
            }
        }
    }
}
