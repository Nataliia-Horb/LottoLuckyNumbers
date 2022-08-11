package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getCanWalk(true, true);
        canBuy(true, true);
        checkDevice(45, 99);
        findMax();
        analyzeAge(18, 18);
        analyzeYear(2000);
    }

    /**
     * Create two variables isWeekend and isRain. Create the variable canWalk whose
     * value should be true if it's a day off (isWeekend=true) and it's not raining (isRain=false).
     */
    public static boolean getCanWalk(boolean weekend, boolean rein) {
        boolean isWeekend = weekend;
        boolean isRein = rein;
        boolean canWalk;
        canWalk = (isWeekend && !isRein) ? true : false;
        System.out.println(canWalk);
        return canWalk;
    }

    /**
     * Create two variables isEdekaOpen and isReweOpen, the values of which depend on the fact if the stores open or
     * not. Implements a method boolean canBuy, that returns true ** The value of this variable must be true if at
     * least one store is open, otherwise false. Display the string “I can buy the food It’s ……“ and the value.
     */
    public static boolean canBuy(boolean infoEdeka, boolean infoRewe) {
        boolean isEdekaOpen = infoEdeka;
        boolean isReweOpen = infoRewe;
        boolean canBuy;
        if (isEdekaOpen || isReweOpen) {
            canBuy = true;
        } else {
            canBuy = false;
        }
        System.out.println("I can buy the food It’s " + canBuy);
        return canBuy;
    }

    /**
     * Let’s imagine that we have a device, which has two flasks. The device works correct if temperature of the first
     * flask is above 100 degrees and the temperature of the second flask is less than 100 degree. You should write the
     * method that checks this device. Your program has to variables temperature1 and temperature2. As a result it
     * prints the message true or false.
     */
    public static void checkDevice(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    /**
     * Implement the program that ask user to input three integers (use Scanner), and print the maximum of three numbers.
     */
    public static void findMax() {
        int a = checkInt(1);
        int b = checkInt(2);
        int c = checkInt(3);
        if (a >= Math.max(b, c)) {
            System.out.println("Maximum is " + a);
        } else if (b >= Math.max(a, c)) {
            System.out.println("Maximum is " + b);
        } else {
            System.out.println("Maximum is " + c);
        }
    }

    private static int checkInt(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer " + i + ": ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("The input does not match the requirements, please try again");
            System.out.println("Enter the integer " + i + ": ");
        }
        return sc.nextInt();
    }

    /**
     * Imagine, you are writing the program for cinema. The method you should create takes two arguments.
     * The first is the age of the person; the second is an age limit of the film. The method should print if this
     * film allowed for the person or not
     */
    public static void analyzeAge(int age, int norm) {
        if (age >= norm) {
            System.out.println("The film is allowed to watch");
        } else {
            System.out.println("Movie not allowed to watch");
        }
    }

    /**
     * Implement the program that ask user to input the year, and print the is this year leap or no
     */
    public static void analyzeYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This year is not leap");
        }
    }
}