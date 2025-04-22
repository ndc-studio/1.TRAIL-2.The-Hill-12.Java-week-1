package modules;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Challenge_4 {
    public static void challenge_4() {
        ArrayList<Double> numList = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            double rand = (int) Math.round(Math.random() * 100);
            numList.add(rand);
        }

        numList.add(0.0);
        // Debug
        System.out.println(numList);
        // Create list for results of operations
        ArrayList<String> resultList = new ArrayList<>();
        // Create decimal format 
        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < (numList.size() -1); i++) {
            double num = numList.get(i);
            double num2 = numList.get(i + 1);
            if (i == 0) {
                resultList.add(df.format(num / num));
            }
            
            if (num == 0 || num2 == 0) {
                resultList.add("0.00");
            } else {
                resultList.add(df.format(num / num2));
            }
        }
        // Result
        System.out.println(resultList);
    }
}
