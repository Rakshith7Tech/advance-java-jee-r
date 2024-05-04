package com.xworkz.bankatm.service;

import com.xworkz.bankatm.dto.BankAccountDTO;

public interface BankAccountAtmCardService {
    public boolean validateAndAddBankDetails(BankAccountDTO dto);
}
