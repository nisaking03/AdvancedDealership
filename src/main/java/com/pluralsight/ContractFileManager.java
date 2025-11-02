package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ContractFileManager {
    public void saveContract(Contract contract){

        //If it's a Sales Contract
        if(contract instanceof SalesContract){
            try{
                FileWriter fileWriter = new FileWriter("Contracts.csv" , true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                //Casting our contract
                //Type of Variable _ varible name = (Cast Type) original type
                SalesContract sale = (SalesContract) contract;

                //Write the Sales Contract information
//                String saleContractData=
//                        "SALE"
//                                + "|" + sale.getContractDate()
//                                + "|" + sale.getCustomerName()
//                                + "|" + sale.getCustomerEmail()
//                                + "|" + sale.getVehicleSold().getVin()
//                                + "|" + sale.getVehicleSold().getYear()
//                                + "|" + sale.getVehicleSold().getMake()
//                                + "|" + sale.getVehicleSold().getModel()
//                                + "|" + sale.getVehicleSold().getVehicleType()
//                                + "|" + sale.getVehicleSold().getColor()
//                                + "|" + sale.getVehicleSold().getOdometer()
//                                + "|" + sale.getVehicleSold().getPrice()
//                                + "|" + sale.getSalesTax()
//                                + "|" + sale.getRecordingFee()
//                                + "|" + sale.getProcessingFee()
//                                + "|" + sale.getTotalPrice()
//                                + "|" + sale.isFinance()
//                                + "|" + sale.getMonthlyPayment();
//
//                //Write our contract
//                bufferedWriter.write(saleContractData);

                //Add a new line so it's not clumped together
                bufferedWriter.newLine();
                bufferedWriter.close();

            }catch (Exception e){
                e.printStackTrace();
                System.out.println("Sales contract writer is corrupted");
            }
        }

        //If it's Lease Contract
        if(contract instanceof LeaseContract){
            try{
                FileWriter fileWriter = new FileWriter("Contracts.csv" ,true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                LeaseContract lease = (LeaseContract) contract;
                //Write the Sales Contract information
//                String leaseContractData =
//
////                        "LEASE"
////                                + "|" + lease.getContractDate()
////                                + "|" + lease.getCustomerName()
////                                + "|" + lease.getCustomerEmail()
////                                + "|" + lease.getVehicleSold().getVin()
////                                + "|" + lease.getVehicleSold().getYear()
////                                + "|" + lease.getVehicleSold().getMake()
////                                + "|" + lease.getVehicleSold().getModel()
////                                + "|" + lease.getVehicleSold().getVehicleType()
////                                + "|" + lease.getVehicleSold().getColor()
////                                + "|" + lease.getVehicleSold().getOdometer()
////                                + "|" + lease.getVehicleSold().getPrice()
////                                + "|" + lease.getEndingValue()
////                                + "|" + lease.getLeaseFee()
////                                + "|" + lease.getTotalPrice()
////                                + "|" + lease.getMonthlyPayment();
//
//                bufferedWriter.write(leaseContractData);
                bufferedWriter.newLine();
                bufferedWriter.close();


            }catch (Exception e){
                e.printStackTrace();
                System.out.println("Lease contract writer is corrupted");
            }
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