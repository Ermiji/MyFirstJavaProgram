package com.company;

import java.util.Scanner;

public class GettingStoringInput {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first initial: ");
        char firstInitial = scan.next().charAt(0);
        scan.nextLine();

        System.out.println("Enter last name: ");
        String lastName = scan.nextLine();

        System.out.println("Enter house number: ");
        int houseNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter street name: ");
        String streetName = scan.nextLine();

        System.out.println("Enter street type: ");
        String streetType = scan.nextLine();

        System.out.println("Enter city name: ");
        String city = scan.nextLine();

        System.out.println("FirstInitial: " + firstInitial + " " + "LastName: " + lastName + " " + "HouseNumber: " + houseNumber + " ");
        System.out.println("StreetName: " + streetName + " " + "StreetType: " + streetType + " " + "CityName: " + city);


    }
}