package com.pluralsight1;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CellPhone phone = new CellPhone();// new cellphone object

        //asks the information the user
        System.out.println("What is the serial number? ");
        int serialNumber = input.nextInt();
        input.nextLine();

        System.out.println("What model is the phone? ");
        String model = input.nextLine();

        System.out.println("Who is the carrier? ");
        String carrier = input.nextLine();

        System.out.println("What is the phone number? ");
        String phoneNumber = input.nextLine();

        System.out.println("Who is the owner of the phone? ");
        String owner = input.nextLine();


        //setting data
        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        //print information
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getPhoneNumber());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

    }

}
