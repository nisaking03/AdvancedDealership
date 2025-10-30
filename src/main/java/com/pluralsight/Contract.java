package com.pluralsight;

public abstract class Contract {
    String Date; //(as string) of contract
    String customerName;
    String customerEmail;
    String vehicleSold;
    int totalPrice;
    int monthlyPayment;

    public Contract(int monthlyPayment, int totalPrice, String vehicleSold, String customerEmail, String customerName, String date) {
        this.monthlyPayment = monthlyPayment;
        this.totalPrice = totalPrice;
        this.vehicleSold = vehicleSold;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        Date = date;
    }

    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getVehicleSold() {
        return vehicleSold;
    }
    public void setVehicleSold(String vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    // will return computed values based on contract type
    public abstract int getTotalPrice();
    public abstract void setTotalPrice(int totalPrice);

    public abstract int getMonthlyPayment();
    public abstract void setMonthlyPayment(int monthlyPayment);
}
