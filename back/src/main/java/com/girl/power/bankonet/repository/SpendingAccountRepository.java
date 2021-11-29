package com.girl.power.bankonet.repository;

import com.girl.power.bankonet.dao.ClientEntity;
import com.girl.power.bankonet.dao.SpendingAccountEntity;
import org.springframework.data.repository.CrudRepository;

public interface SpendingAccountRepository extends CrudRepository<SpendingAccountEntity, Integer> {

        SpendingAccountEntity findByClientByClientId(ClientEntity client);
        void removeByClientByClientId(ClientEntity client);
}


