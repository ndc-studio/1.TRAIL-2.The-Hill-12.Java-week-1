package modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Challenge_8 {
    public static void challenge_8() {
        try {
            File myObj = new File("./src/data/data-C8.csv");
            Scanner myReader = new Scanner(myObj);
            myReader.nextLine();

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] cut = data.split(",");
                String date = cut[0].trim();
                int cardio = Integer.parseInt(cut[1].trim());
                int radio = Integer.parseInt(cut[2].trim());
                int visit = Integer.parseInt(cut[3].trim());

                HopitalClass hosp = new HopitalClass(date, cardio, radio, visit);
                System.out.print(hosp);
                WriteFile_C8.writeFile(hosp.toCSV());
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }   
    }
}
