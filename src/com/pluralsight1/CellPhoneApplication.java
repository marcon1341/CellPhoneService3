package com.pluralsight1;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CellPhone phone1 = new CellPhone();// new cellphone object

        //asks the information the user
        System.out.println("Enter Information For Phone1: ");
        System.out.println("What is the serial number? ");
        int serialNumber1 = input.nextInt();
        input.nextLine();

        System.out.println("What model is the phone? ");
        String model1 = input.nextLine();

        System.out.println("Who is the carrier? ");
        String carrier1 = input.nextLine();

        System.out.println("What is the phone number? ");
        String phoneNumber1 = input.nextLine();

        System.out.println("Who is the owner of the phone? ");
        String owner1 = input.nextLine();


        //setting data
        phone1.setSerialNumber(serialNumber1);
        phone1.setModel(model1);
        phone1.setCarrier(carrier1);
        phone1.setPhoneNumber(phoneNumber1);
        phone1.setOwner(owner1);

        //second phone

        CellPhone phone2 = new CellPhone();// new cellphone object

        //asks the information the user
        System.out.println("Enter Information For Phone2: ");
        System.out.println("What is the serial number? ");
        int serialNumber2 = input.nextInt();
        input.nextLine();

        System.out.println("What model is the phone? ");
        String model2 = input.nextLine();

        System.out.println("Who is the carrier? ");
        String carrier2 = input.nextLine();

        System.out.println("What is the phone number? ");
        String phoneNumber2 = input.nextLine();

        System.out.println("Who is the owner of the phone? ");
        String owner2 = input.nextLine();

        CellPhone phone3 = new CellPhone(
            2066547656,
            "Samsung ultra 25",
            "T-mobile",
            "206-656-656",
            "Malik"
        );

//        //setting data
//        phone2.setSerialNumber(serialNumber2);
//        phone2.setModel(model2);
//        phone2.setCarrier(carrier2);
//        phone2.setPhoneNumber(phoneNumber2);
//        phone2.setOwner(owner2);


        //displays
        display(phone1);
        display(phone2);
        display(phone3);

        //phone call each other
        System.out.println("\nPhone Calling:");
        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());
        phone2.dial(phone3);
        phone3.dial(phone1);
    }

        //print information/static method to display phone info
        public static void display (CellPhone phone){
            System.out.println("Cell Phone Info: ");
            System.out.println("Serial Number: " + phone.getSerialNumber());
            System.out.println("Model: " + phone.getPhoneNumber());
            System.out.println("Carrier: " + phone.getCarrier());
            System.out.println("Phone Number: " + phone.getPhoneNumber());
            System.out.println("Owner: " + phone.getOwner());

        }
}


