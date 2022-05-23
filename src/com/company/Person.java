package com.company;

import java.util.Scanner;

public class Person {


    Scanner sr = new Scanner(System.in);
    String surnamePathak56458, firstNameManthan56458, street56458, city56458;
    int zipCode56458;

    void InitiShahze(){
        System.out.println("Please enter your Name: ");
        firstNameManthan56458 = sr.nextLine();
        System.out.println("Please enter your Surname: ");
        surnamePathak56458 = sr.nextLine();
        System.out.println("Please enter your Street name: ");
        street56458 = sr.nextLine();
        System.out.println("Please enter your City: ");
        city56458 = sr.nextLine();
        System.out.println("Please enter your Zip Code: ");
        zipCode56458 = sr.nextInt();
    }

    void printData() {
        System.out.println("Name: " + firstNameManthan56458);
        System.out.println("Surname: " + surnamePathak56458);
        System.out.println("Street Name: " + street56458);
        System.out.println("City: " + city56458);
        System.out.println("Zip Code: " + zipCode56458);
    }

}
