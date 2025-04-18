package modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Challenge_8 {
    public static void challenge_8() {
        try {
            File myObj = new File("./src/data/data-C8.csv");
            ArrayList<Integer> cardioList = new ArrayList<>();
            ArrayList<Integer> radioList = new ArrayList<>();
            ArrayList<Integer> visitList = new ArrayList<>();
            Scanner myReader = new Scanner(myObj);
            myReader.nextLine();        
            write.writeDay("date,cardiology,radiology,vistors\n");
            write.writeMonth("cardio-total, radio-total, visitors-total\n");

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] cut = data.split(",");
                String date = cut[0].trim();
                int cardio = Integer.parseInt(cut[1].trim());
                int radio = Integer.parseInt(cut[2].trim());
                int visit = Integer.parseInt(cut[3].trim());
                
                cardioList.add(cardio);
                radioList.add(radio);
                visitList.add(visit);

                HopitalClass hosp = new HopitalClass(date, cardio, radio, visit);
                System.out.print(hosp);
                write.writeDay(hosp.toCSV());
            }
            int cardioSum = cardioList.stream().mapToInt(Integer::valueOf).sum();
            int radioSum = radioList.stream().mapToInt(Integer::valueOf).sum();
            int visitSum = visitList.stream().mapToInt(Integer::valueOf).sum();

            String monthTotalValue = cardioSum + "," + radioSum + "," + visitSum + "\n";
            write.writeMonth(monthTotalValue);

            System.out.println(
                    "Total of visits in cardiology: " + cardioSum + "\n" +
                    "Total of visits in radiology: " + radioSum + "\n" +
                    "Total of global visits in hospital: " + visitSum
                );
            myReader.close();
            write.writeMonth("\n");
            write.writeDay("\n");

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }   
    }
}
