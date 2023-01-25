package by.academy.Homework6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        User user1 = new User("Aaron", "Ramsdale", 26);
        User user2 = new User("Kieran", "Tierney", 29);
        User user3 = new User("Ben", "White", 22);
        User user4 = new User("Gabriel", "", 24);
        User user5 = new User("Rob", "Holding", 22);
        User user6 = new User("William", "Saliba", 20);
        User user7 = new User("Cedrci", "Soaresh", 26);
        User user8 = new User("Martin", "Odegaard", 22);
        User user9 = new User("Emile", "Smith-Rowe", 22);
        User user10 = new User("Fabio", "Viera", 22);
        List<User> users = new ArrayList<User>(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10));
        for (User user : users) {
            Function<User,String> getFileName = u -> u.getFirstName() + "_" + u.getSecondName() + ".txt";
            // Get file name using lambda
            File userFIle = new File(getFileName.apply(user));
            try {
                if (!userFIle.exists()) {
                    userFIle.createNewFile();
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

            try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(userFIle)))) {
                oos.writeObject(user);

            }catch(IOException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }

        }


    }
}
