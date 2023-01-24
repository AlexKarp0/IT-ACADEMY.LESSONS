package LessonfFile;

import jdk.dynalink.beans.StaticClass;

import java.io.*;

public class Application {
    private   static  final String TEXT = "What is Lorem Ipsum?\n" +
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer " +
            "took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, " +
            "but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s " +
            "with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
            "software like Aldus PageMaker including versions of Lorem Ipsum.";
    private static final String REPLACED = "[ioyuea]";
    private static final String OUTPUT_FILE_NAME = "output.txt";

    public static void main(String[] args) throws IOException {

        File lorem = new File("Lorem.txt");
        if (!lorem.exists()) {
            lorem.createNewFile();
        }
        File outputFile = new File(OUTPUT_FILE_NAME);
        if (!outputFile.exists()) {
            outputFile.createNewFile();
        }
        try(OutputStream output = new FileOutputStream(lorem)){
            for (char c : TEXT.toCharArray()){
                output.write(c);
            }
            output.flush();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(lorem));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
                bufferedWriter.write(str.replaceAll(REPLACED,"!"));
                bufferedWriter.write("");
            }
        }
    }
}
