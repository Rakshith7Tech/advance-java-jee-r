package com.xworkz.bankatm;

import com.xworkz.bankatm.dto.AtmCardDTO;
import com.xworkz.bankatm.dto.BankAccountDTO;
import com.xworkz.bankatm.service.BankAccountAtmCardService;
import com.xworkz.bankatm.service.impl.BankAccountAtmCardServiceImpl;

public class Executor {
    public static void main(String[] args) {
        BankAccountAtmCardService bankAtmService = new BankAccountAtmCardServiceImpl();

        // Create a new ATM Card
        AtmCardDTO atmCardDTO = new AtmCardDTO();
        atmCardDTO.setCardNumber("1234-5678-9012-3456");
        atmCardDTO.setExpirationDate("12/25");

        // Create a new Bank Account
        BankAccountDTO bankAccountDTO = new BankAccountDTO();
        bankAccountDTO.setAccountNumber("ACC123456789");
        bankAccountDTO.setAccountHolderName("Raja");
        bankAccountDTO.setBalance(1000.0);

        // Link the ATM Card to the Bank Account
        bankAccountDTO.setAtmCard(atmCardDTO);

        // Validate and add the Bank Account and ATM Card details
        boolean result = bankAtmService.validateAndAddBankDetails(bankAccountDTO);

        if (result) {
            System.out.println("Bank Account and ATM Card details added successfully!");
        } else {
            System.out.println("Adding bank account and ATM card details failed.");
        }
    }
}
