package by.academy.Homework6;

import javax.swing.*;
import java.io.*;
import java.util.Random;

public class Task4 {
    private static final String FOLDER_NAME = "task4";
    private static final String FILE_NAME_TEMPLATE = "FILE_<x>.txt";
    private static final String INPUT_FILE = "lorem.txt";
    private static final String OUTPUT_FILE = "task4.txt";
    private static final int REPEATS = 100;

    public static void main(String[] args) {
        File folder = new File(FOLDER_NAME);
        File inputFile = new File(INPUT_FILE);
        File outputFile = new File(OUTPUT_FILE);
        String content = "";
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            if (!inputFile.exists()) {
                throw new IOException("File " + inputFile.getAbsolutePath() + inputFile.getName() + " does not exists");
            }
            if (!folder.exists()) {
                folder.mkdir();
            }
            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }



            String str;
            while ((str = reader.readLine()) != null) {
                content += str;
            }
            System.out.println(content);
            Random random = new Random();

            for (int i = 0; i < REPEATS; i++) {

                String fileName = FILE_NAME_TEMPLATE.replaceAll("<x>", Integer.toString(i));
                System.out.println(fileName);
                File file = new File(folder, fileName);

                if (!file.exists()) {
                    file.createNewFile();
                }

                BufferedWriter writerFile = new BufferedWriter(new FileWriter(file));
                writerFile.write(content, 0, random.nextInt(content.length()));
                writerFile.close();
                Long size = file.length();
                writer.write("FIle: " + file.getName() + ": size : "+size);
                writer.write("\n");


            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
