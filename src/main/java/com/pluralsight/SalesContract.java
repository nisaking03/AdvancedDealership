package com.pluralsight;

public class SalesContract extends Contract{
    public SalesContract(String vehicleSold, String customerEmail, String customerName, String date) {
        super(vehicleSold, customerEmail, customerName, date);
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }

}
