package modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

/**
 * @see READ: https://www.w3schools.com/java/java_files_read.asp
 */
public class Challenge_5 {
    public static void challenge_5() {
        try {
            File myObj = new File("./src/data/data.txt");
            Scanner myReader = new Scanner(myObj);
            HashMap<String, Integer> counterMap = new HashMap<String, Integer>();
            Integer j = 1;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String regex = "[,\\.\\s\\!\\'']";
                String[] myArray = data.split(regex);
                for (String s : myArray) {
                    if (s.equals(" ") || s.isBlank()) {
                        continue;
                    } else {
                        for (int i = 0; i < myArray.length; i++){
                            if (myArray[i].equalsIgnoreCase(s)) {                   
                                counterMap.put(s.toLowerCase(), (Integer) j);
                                j++;
                            }
                        }
                    }
                }
            }           
            System.out.println(counterMap);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("SCRIPT_ERROR: An error occurred.");
            e.printStackTrace();
        }
    }
}
