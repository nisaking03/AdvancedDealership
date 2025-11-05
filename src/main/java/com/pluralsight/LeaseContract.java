package com.pluralsight;

public class LeaseContract extends Contract{
    private double expectedEndingValue;
    private double leaseFee;

    public LeaseContract(Vehicle vehicleSold, String customerEmail, String customerName,
                         String date, double expectedEndingValue, double leaseFee) {
        super(vehicleSold, customerEmail, customerName, date);

        // Calculate the lease-specific values:
        this.expectedEndingValue = vehicleSold.getPrice() * 0.5; // 50% of the original price
        this.leaseFee = vehicleSold.getPrice() * 0.07;           // 7% lease fee

    }

    public double getExpectedEndingValue() {
        return expectedEndingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    @Override
    public double getTotalPrice() {
        //Calculate as vehicle price + lease fee (7% of price)
        return getVehicleSold().getPrice() + leaseFee;
    }

    @Override
    public double getMonthlyPayment() {
        //Calculate based on 4.0% interest, 36 months
        //Use the formula: (adjusted capitalized cost - residual value) /
        //term + monthly interest charge
        double totalPrice = getTotalPrice();

        double annualRate = 0.04;
        double monthlyRate = annualRate / 12;
        int months = 36;

        double monthlyPayment = (totalPrice / months) + (totalPrice * monthlyRate);
        return monthlyPayment;
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