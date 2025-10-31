package com.pluralsight;

public class LeaseContract extends Contract{
    public LeaseContract(String vehicleSold, String customerEmail, String customerName, String date) {
        super(vehicleSold, customerEmail, customerName, date);
    }

    @Override
    public double getTotalPrice() {
        //Calculate as vehicle price + lease fee (7% of price)
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        // Calculate based on 4.0% interest, 36 months
        //Use the formula: (adjusted capitalized cost - residual value) /
        // term + monthly interest charge
        return 0;
    }

}
//• Expected Ending Value  (50% of the original price)
//• Lease Fee (7% of the original price)
//• Monthly payment based on
//• All leases are financed at 4.0% for 36 months
//Methods will include a constructor and getters and setters for all fields except
//total price and monthly payment.  You should provide overrides for
//getTotalPrice() and getMonthlyPayment() that will return computed
//values based on the rules above.