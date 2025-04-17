package modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Challenge_7 {
    public static void challenge_7() {
        try {
            File myObj = new File("./src/data/data-C7.csv");
            Scanner myReader = new Scanner(myObj);
            myReader.nextLine();

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                // Debug
                System.out.println(data);
                String[] cut = data.split(",");
                String firstname = cut[0].trim();
                String lastname = cut[1].trim();
                int age = Integer.parseInt(cut[2].trim());

                PersonClass person = new PersonClass(firstname, lastname, age);
                System.out.print(person);

            }
          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    }
}

