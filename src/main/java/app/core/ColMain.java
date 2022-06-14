package app.core;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ColMain {
    public static void main(String[] args) {
        Random rand = new SecureRandom();
        List<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            myList.add(rand.nextInt(100));
            //System.out.println(myList);

            int result = 0;
            int count = 0;
            for (int j = 0; j < myList.size(); j++){
                int v = myList.get(j);
                //? Filter
                if (0 != (v % 2))
                continue;
                // System.out.printf("for %d \n", myList.get(j));
                result += myList.get(j);
            }
            System.out.println("Result = " + result);

            List<Integer> intList = myList.stream()
            .filter(v -> 0 == (v % 2))
            .map(v -> v + 1)
            .toList();
            System.out.println(intList);


            int sumOfMyList = myList.stream()
            .filter(v -> 0 == (v % 2))
            .map(v -> v + 1)
            .reduce(0, (x, y) -> {
                System.out.printf("x: %d, y: %d \n", x, y);
                return x + y;
            });

            System.out.printf("Sum of my list: ", sumOfMyList);


            // myList.stream()
            // .forEach((value) -> {
            //     System.out.printf("forEach %d \n", value);
            // });
        }
    }
}
