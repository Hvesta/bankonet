package com.girl.power.bankonet.repository;

import com.girl.power.bankonet.dao.ClientEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<ClientEntity, Integer> {

    ClientEntity findByEmail(String email);
    void deleteByEmail(String email);

}

