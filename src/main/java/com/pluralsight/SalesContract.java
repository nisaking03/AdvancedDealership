package com.pluralsight;

public class SalesContract extends Contract{
    public SalesContract(int monthlyPayment, int totalPrice, String vehicleSold, String customerEmail, String customerName, String date) {
        super(monthlyPayment, totalPrice, vehicleSold, customerEmail, customerName, date);
    }

    @Override
    public int getTotalPrice() {
        return 0;
    }

    @Override
    public void setTotalPrice(int totalPrice) {

    }

    @Override
    public int getMonthlyPayment() {
        return 0;
    }

    @Override
    public void setMonthlyPayment(int monthlyPayment) {

    }
}
