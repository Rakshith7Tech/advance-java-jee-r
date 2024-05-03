package com.xworkz.bankatm.service.impl;

import com.xworkz.bankatm.dto.BankAccountDTO;
import com.xworkz.bankatm.repository.BankAccountAtmCardRepository;
import com.xworkz.bankatm.repository.impl.BankAccountAtmCardRepositoryImpl;
import com.xworkz.bankatm.service.BankAccountAtmCardService;

public class BankAccountAtmCardServiceImpl implements BankAccountAtmCardService {
    BankAccountAtmCardRepository bankAccountAtmCardRepository;
    public BankAccountAtmCardServiceImpl(){
        bankAccountAtmCardRepository=new BankAccountAtmCardRepositoryImpl();
    }
    @Override
    public boolean validateAndAddBankDetails(BankAccountDTO dto) {
        System.out.println("validation service layer");
        if (dto != null) {
            bankAccountAtmCardRepository.addBankAccountDetails(dto);
            return true;
        }
        System.out.println("validation failed");
        return false;
    }
}
