package modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @see READ: https://www.w3schools.com/java/java_files_read.asp
 */
public class Challenge_5 {
    public static void challenge_5() {
        try {
            File myObj = new File("./src/data/data.txt");
            Scanner myReader = new Scanner(myObj);
            HashMap<String, Integer> counterMap = new HashMap<String, Integer>();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String regex = "[,\\.\\s\\!\\'']";
                String[] myArray = data.split(regex);
                for (String s : myArray) {
                    if (!s.isBlank()) {
                        String word = s.toLowerCase();
                        counterMap.put(word, counterMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
            String mostCount = "";
            int maxCount = 0;

            for (Entry<String, Integer> entry : counterMap.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostCount = entry.getKey();
                }
            }
            System.out.println("All words : " + counterMap);
            System.out.println("\nThe word most count is: \"" + mostCount + "\" (used " +  maxCount + "x)");
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("SCRIPT_ERROR: An error occurred.");
            e.printStackTrace();
        }
    }
}
