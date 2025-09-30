package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //what are my known values?
        double priceOfBasicCarRentalPerDay = 29.99;
        double priceOfOptionTollTag = 3.95;
        double priceOfOptionGPS = 2.95;
        double priceOfOptionRoadsideAssistance = 3.95;
        float percentSurchargeForUnderage = 0.30f;
        int userageLimit = 25;



        //what values do I need to get from the user?
        System.out.println("When do you want to rent the car?");
        String pickupDate;

        System.out.println("How many days do you need it?");
        int numberOfDays;

        System.out.println("Would you like a toll tag?");
        boolean optionTollTag;

        System.out.println("Would you like a GPS?");
        boolean optionGPS;

        System.out.println("Would you like a roadside assistance?");
        boolean optionRoadsideAssistance;

        System.out.println("How old are you?");
        int age;


        //what needs to be calculated?
        double basicCarRentalAmount;
        double optionsAmount;



    }
}
