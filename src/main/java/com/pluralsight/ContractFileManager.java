package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ContractFileManager {

    public void saveContract(Contract contract) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("inventory.csv", true))) {

            String line = "";

            // Checking if it is a lease contract or not
            if (contract instanceof LeaseContract) {
                LeaseContract lease = (LeaseContract) contract;

                // then format how the lease contract data should look
                line = String.format("Lease|%s|%s|%s|%s|%.2f|%.2f",
                        lease.getContractDate(),
                        lease.getCustomerName(),
                        lease.getCustomerEmail(),
                        lease.getVehicleSold().getVin(),
                        lease.getTotalPrice(),
                        lease.getMonthlyPayment());

            }
            // Or if it's a Sales contract :
            else if (contract instanceof SalesContract) {

                SalesContract sale = (SalesContract) contract;

                // Format how the sales contract would look like
                line = String.format("Sale|%s|%s|%s|%s|%.2f|%.2f",
                        sale.getContractDate(),
                        sale.getCustomerName(),
                        sale.getCustomerEmail(),
                        sale.getVehicleSold().getVin(),
                        sale.getTotalPrice(),
                        sale.getMonthlyPayment());

            }
            bw.write(line); // writes that line to the file
            bw.newLine();   // moves the cursor to the new line
            bw.close();     // closes the buffered writer

            System.out.println(line);

        } catch (IOException e) {
            System.out.println("There was an Error!");;
        }

    }

}
//ContractFileManager and add a method to save the contract by
//APPENDING it to your contracts file

// Step 1: Create ContractFileManager Class
//    //Add a constant for the file path (e.g., "contracts.txt")

//    //Step 2: Implement saveContract() Method
//    //Accept a Contract parameter
//    //Use instanceof to determine contract type
//    //Format output based on type:
//    //For SalesContract: Include SALES_TAX, RECORDING_FEE, PROCESSING_FEE, FINANCE_OPTION, plus base fields
//    //For LeaseContract: Include EXPECTED_ENDING_VALUE, LEASE_FEE, plus base fields
//    //APPEND the contract data to the file (not overwrite)
//    //Use pipe delimiters (|) to separate fields

//    //Step 3: Test File Output
//    //Verify contracts are being appended correctly
//    //Compare format against the provided example data