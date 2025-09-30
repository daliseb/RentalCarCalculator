package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);

        //what are my known values?
        double priceOfBasicCarRentalPerDay = 29.99;
        double priceOfOptionTollTag = 3.95;
        double priceOfOptionGPS = 2.95;
        double priceOfOptionRoadsideAssistance = 3.95;
        float percentSurchargeForUnderage = 0.30f;
        int userageLimit = 25;



        //what values do I need to get from the user?
        System.out.println("When do you want to rent the car?");
        String pickupDate = scanner.nextLine();

        System.out.println("How many days do you need it?");
        int numberOfDays = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Would you like a toll tag?");
        boolean optionTollTag = scanner.nextLine().equalsIgnoreCase("Y");

        System.out.println("Would you like a GPS?");
        boolean optionGPS =  scanner.nextLine().equalsIgnoreCase("Y");

        System.out.println("Would you like a roadside assistance?");
        boolean optionRoadsideAssistance = scanner.nextLine().equalsIgnoreCase("Y");

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();


        //what needs to be calculated?
        double basicCarRentalAmount = 0;
        double optionsAmount = 0;
        double underageSurcharge = 0;
        double totalCost = 0;

        //display the results.

        System.out.println("Here is the quote for your rental! : ");
        System.out.printf("Basic Car Rental:     $.2f\n",basicCarRentalAmount);
        System.out.printf("Options:              $.2f\n",optionsAmount);
        System.out.printf("Underage Surcharge:   $.2f\n",underageSurcharge);
        System.out.printf("Total Cost:          $.2f\n",totalCost);



    }
}
