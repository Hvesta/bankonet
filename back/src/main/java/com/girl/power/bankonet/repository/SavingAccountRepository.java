package com.girl.power.bankonet.repository;

import com.girl.power.bankonet.dao.ClientEntity;
import com.girl.power.bankonet.dao.SavingAccountEntity;
import com.girl.power.bankonet.model.SavingAccount;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SavingAccountRepository extends CrudRepository<SavingAccountEntity, Integer> {

    List<SavingAccountEntity> findByClientByClientId(ClientEntity client);
    // void removeByClientByClientId(ClientEntity client);
    void deleteByClientByClientId(ClientEntity clientEntity);
}
