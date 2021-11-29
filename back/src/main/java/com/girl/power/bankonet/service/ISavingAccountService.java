package com.girl.power.bankonet.service;

import com.girl.power.bankonet.exception.ApplicationException;
import com.girl.power.bankonet.model.SavingAccount;

import java.util.List;

public interface ISavingAccountService {

    List<SavingAccount> findAll() throws ApplicationException;
    List<SavingAccount> findAllByClientId(int id) throws ApplicationException;
    SavingAccount findById(int id) throws ApplicationException;
    SavingAccount save(SavingAccount savingAccount) throws ApplicationException;
    boolean removeById(int id) throws ApplicationException;
    boolean removeByClientId(int id) throws ApplicationException;
    SavingAccount updateSavingAccount(int id, SavingAccount savingAccount) throws ApplicationException;
}
