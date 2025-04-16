package modules;

import java.util.ArrayList;

public class Challenge_4 {
    public static void challenge_4() {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            int rand = (int) Math.round(Math.random() * 100);
            numList.add(rand);
        }
        numList.add(0);
        // Debug
        System.out.println(numList);

        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < (numList.size() -1); i++) {
            int num = numList.get(i);
            int num2 = numList.get(i + 1);
            if (i == 0) {
                resultList.add(num / num);
            } else if (num == 0 || num2 == 0) {
                resultList.add(0);
            } else {
                resultList.add(num / num2);
            }
        }
        // Result
        System.out.println(resultList);
    }
}
