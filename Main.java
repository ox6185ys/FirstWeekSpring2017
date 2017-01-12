package com.Patrick;
import java.util.Scanner;
public class Main {

    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Let's test to determine whether you can upgrade.");
        System.out.println("You need to be running " +
                "Windows 7 or 8.  Example: Windows 7.");
        String currentOS = stringScanner.nextLine();

        System.out.println("Is your CPU 1GHz or more? Enter how many.");
        double cpuSpeed = stringScanner.nextDouble();

        System.out.println("Do you have 2GB of RAM or more? Enter how many.");
        double ramSize = stringScanner.nextDouble();

        if ((currentOS.equalsIgnoreCase("Windows 7") || currentOS.equalsIgnoreCase("Windows 8")) && cpuSpeed >= 10 && ramSize >= 20){
            System.out.println("You can upgrade.");
        } else{
            System.out.println("You can't upgrade.");
        }
/*
        System.out.println("How many miles do you live from MCTC?");
        double distanceFromHome = numberScanner.nextDouble();
        if (distanceFromHome > 10){
            System.out.println("You live more than 10 miles from MCTC.");
        }else if (distanceFromHome == 10){
            System.out.println("You live exactly ten miles from MCTC");
        }else{
            System.out.println("You live closer than 10 miles.");
        }
        System.out.println(String.format("You live " + distanceFromHome*1.6 + " KM from MCTC."));
*/

/*        System.out.println("What is today's date (as a number)?");
        int day = numberScanner.nextInt();

        System.out.println("What is today's forecast high temp?");
        double high = numberScanner.nextDouble();

        System.out.println("What is today's forecast low temp?");
        double low = numberScanner.nextDouble();

        double diff = high - low;

        System.out.println("On " + month + " " + day + " the difference between the forecast high and low temperatures is " + diff + " F");*/

/*        System.out.println("What is the name of the product?");
        String productName = stringScanner.nextLine();

        System.out.println("What does one " + productName + " cost?");
        double price = numberScanner.nextDouble();

        System.out.println("How many " + productName + " to sell?");*/

/*        String college = "MCTC";
        System.out.println(college);
        System.out.println("I am attending " + college + ".");
        int javaCredits = 6;
        System.out.println("Java is " + javaCredits + " credits.");
        double textbookPrice = 45.99;
        System.out.println("The textbook costs $" + textbookPrice);*/


/*        System.out.println("Enter your name. ");
        String name = stringScanner.nextLine();
        System.out.println("Hello " + name + ".");*/

/*        System.out.println("Let's share some M&Ms!");
        System.out.println("How many M&Ms in a packet?");
        double mms = numberScanner.nextDouble();
        System.out.println("How many want to share?");
        int people = numberScanner.nextInt();
        double mmsEach = mms / people;
        System.out.println("Each person will get " + mmsEach + " M&Ms.");*/

        stringScanner.close();
        numberScanner.close();
    }
}