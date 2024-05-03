package com.xworkz.bankatm.repository;

import com.xworkz.bankatm.dto.BankAccountDTO;

public interface BankAccountAtmCardRepository {
    public boolean addBankAccountDetails(BankAccountDTO dto);
}
