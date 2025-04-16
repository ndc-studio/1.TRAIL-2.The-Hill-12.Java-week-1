package modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Challenge_5 {
    public static void challenge_5() {
        try {
            File myObj = new File("./src/data/data.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
