package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(withdraw(40)));
//        System.out.println(Arrays.toString(withdraw(60)));
 //       System.out.println(Arrays.toString(withdraw(230)));
//        System.out.println(Arrays.toString(withdraw(250)));
        System.out.println(Arrays.toString(withdraw(260)));
//        System.out.println("********************");
//        System.out.println(withdraw1(40));
//        System.out.println(withdraw1(60));
//        System.out.println(withdraw1(230));
        System.out.println(withdraw1(250));
//        System.out.println(withdraw1(260));
    }

    public static int[] withdraw(int n) {
        // TO DO
        int bill100 = 0, bill50 = 0, bill20 = 0;
        while (n > 0) {
            if (n % 100 == 0) {
                n -= 100;
                bill100++;
            } else if (n % 50 == 0) {
                n -= 50;
                bill50++;
            } else {
                n -= 20;
                bill20++;
            }
        }
        return new int[]{bill100, bill50, bill20};
    }

    public static ArrayList<Integer> withdraw1(int amount) {
        ArrayList<Integer> result = new ArrayList<>();

        int hundredCount = 0;
        int fiftyCount = 0;
        int twentyCount = 0;

        if (amount % 20 == 0) {
            if (amount >= 100) {
                hundredCount = amount / 100;
                amount = amount - (hundredCount * 100);
            }
            twentyCount = amount / 20;
        }

        if (amount % 20 == 10) {
            fiftyCount++;
            amount = amount - 50;
            if (amount >= 100) {
                hundredCount = amount / 100;
                amount = amount - (hundredCount * 100);
            }
            twentyCount = amount / 20;
        }

        result.add(hundredCount);
        result.add(fiftyCount);
        result.add(twentyCount);

        return result;
    }

}