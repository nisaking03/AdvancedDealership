package com.pluralsight;

public class ContractFileManager {
    //Step 1: Create ContractFileManager Class
    //Add a constant for the file path (e.g., "contracts.txt")

    //Step 2: Implement saveContract() Method
    //Accept a Contract parameter
    //Use instanceof to determine contract type
    //Format output based on type:
    //For SalesContract: Include SALES_TAX, RECORDING_FEE, PROCESSING_FEE, FINANCE_OPTION, plus base fields
    //For LeaseContract: Include EXPECTED_ENDING_VALUE, LEASE_FEE, plus base fields
    //APPEND the contract data to the file (not overwrite)
    //Use pipe delimiters (|) to separate fields

    //Step 3: Test File Output
    //Verify contracts are being appended correctly
    //Compare format against the provided example data
}
//ContractFileManager and add a method to save the contract by
//APPENDING it to your contracts file