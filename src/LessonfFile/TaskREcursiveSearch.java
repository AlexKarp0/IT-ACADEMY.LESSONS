package LessonfFile;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class TaskREcursiveSearch {
    public static void main(String[] args) {
        File academy = new File("./");
        ArrayList<String> files = new ArrayList<>();
        search(academy, files);
        System.out.println(files.size());
        System.out.println(files);
    }

    public static void search(File file, ArrayList<String> fileList) {
        for (File loopFile : file.listFiles()) {
            //System.out.println(loopFile.getName());

            if (loopFile.isFile() && loopFile.getName().endsWith(".java")) {
                fileList.add(file.getName());
            }
            if (loopFile.isDirectory()) { search(loopFile,fileList);}

            }
        }


}
