package LessonfFile;

import lesson2.Cat;

import javax.print.attribute.standard.MediaSize;
import java.awt.image.BufferedImageOp;
import java.io.*;

public class AppSerialize {
    private static final String OUT_FILE_NAME = "CATS.TXT";

    public static void main(String[] args) throws IOException {
        Cat cat = new Cat("123");
        cat.setMoney(123);
        Cat cat2 = new Cat("CAT2");
        cat.setMoney(123);

        File outFile = new File(OUT_FILE_NAME);
        if (!outFile.exists()) {
            outFile.createNewFile();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(outFile)))
        ) {
            oos.writeObject(cat);
            oos.writeObject(cat2);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(outFile)))) {
            Cat cat3 =(Cat) ois.readObject();
        } catch (IOException| ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
