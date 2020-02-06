package com.example.addressbookapplication;

import java.util.Scanner;

//Class name.

class Menu

{

//Creating new instance for Scanner class.

    Scanner sobj = new Scanner(System.in);

//Method prompt_FirstName.

    void prompt_FirstName()

    {

//Prompt the user for first name.

        System.out.print("\nEnter first name:");

//Get the first name.

        String fname = sobj.nextLine();

//Display the first name.

        System.out.println("First Name : " +fname);

    }

    void prompt_LastName()

    {

//Prompt the user for last name.

        System.out.print("\nEnter last name:");

//Get the last name.

        String lname = sobj.nextLine();

//Display the last name.

        System.out.println("Last Name : " +lname);

    }

    void prompt_Street()

    {

//Prompt the user for street name.

        System.out.print("\nEnter street name:");

        String stname = sobj.nextLine();

        System.out.println("Street Name : " +stname);

    }

    void prompt_City()

    {

//Prompt the user for city name.

        System.out.print("\nEnter city name:");

//Get the city name.

        String cname = sobj.nextLine();

//Display the street name.

        System.out.println("Street Name : " +cname);

    }

    void prompt_State()

    {

//Prompt the user for state name.

        System.out.print("\nEnter state name:");

//Get the street name.

        String sname = sobj.nextLine();

//Display the state name.

        System.out.println("State Name : " +sname);

    }

    void prompt_Zip()

    {

//Prompt the user for zip code.

        System.out.print("\nEnter ZipCode:");

//Get the zip code.

        int zip = sobj.nextInt();

//Display the zip code.

        System.out.println("ZipCode : " +zip);

    }

    void prompt_Telephone()

    {

//Prompt the user for Telephone number.

        System.out.print("\nEnter Telephone:");

//Get the Telephone number.

        int tel = sobj.nextInt();

//Display the Telephone number.

        System.out.println("Telephone : " +tel);

    }

    void prompt_Email()

    {

//Prompt the user for Email ID.

        System.out.print("\nEnter Email:");

//Get the Email ID.

        String email = sobj.next();

//Display the Email ID.

        System.out.println("EMail : " +email);

    }

}