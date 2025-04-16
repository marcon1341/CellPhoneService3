package com.pluralsight1;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //constructor
    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }

    //overload constructors
    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner){
        this.serialNumber =  serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;

    }

    //setting getter method
    public int getSerialNumber() {
        return this.serialNumber;
    }
    public String getModel(){
        return this.model;
    }
    public String getCarrier(){
        return this.carrier;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getOwner(){
        return this.owner;
    }
    //set setter

    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    //dial method

    public void dial(String numberToCall) {
        System.out.println(owner + "'s phone is calling " + numberToCall);
    }
    //dial method for overload
    public void dial(CellPhone phone){
        System.out.println(owner + "'s Phone Is Calling "+ phone.getPhoneNumber());
    }

}
