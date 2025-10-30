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
//• Sales Tax Amount (5%)
//• Recording Fee ($100)
//• Processing fee ($295 for vehicles under $10,000 and $495 for all others
//• Whether they want to finance (yes/no)
//• Monthly payment (if financed) based on:
//• All loans are at 4.25% for 48 months if the price is $10,000 or more
//• Otherwise they are at 5.25% for 24 month
//Methods will include a constructor and getters and setters for all fields except
//total price and monthly payment.  You should provide overrides for
//getTotalPrice() and getMonthlyPayment() that will return computed values
//based on the rules above.  It is possible that getMonthlyPayment() would return
//0 if they chose the NO loan option.