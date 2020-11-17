package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        stringFooExercise();

    }

    public static void stringFooExercise() {

        Scanner scanner = new Scanner(System.in);
        String sample = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        String fName, lName, eMail;

        System.out.println("Please enter the customer's first name\t");
        fName = scanner.next();

        System.out.println("Please enter the customer's last name\t");
        lName = scanner.next();

        System.out.println("Please enter the customer's email\t");
        eMail = scanner.next();

        String fNameChange = fName.substring(0,1).toUpperCase() + fName.substring(1).toLowerCase();
        String lNameChange = lName.substring(0,1).toUpperCase() + lName.substring(1).toLowerCase();

        String firstCode = fName.substring(0,1).toLowerCase() + lName.substring(0,1).toLowerCase();
        String secondCode = String.valueOf(fName.length() + lName.length());
        String thirdCode =String.valueOf((sample.indexOf(fNameChange.charAt(0)))+1);
        String fourthCode =String.valueOf((sample.indexOf(lNameChange.charAt(0)))+1);

        String accountCode = String.join("--", firstCode, secondCode, thirdCode, fourthCode);
        String pinNumber = String.join("", thirdCode, fourthCode);

        System.out.printf("Customer's account number is : %s and pin number is %s", accountCode, pinNumber);



    }
}
