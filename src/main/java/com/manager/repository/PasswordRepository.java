package com.manager.repository;

import com.manager.model.PasswordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PasswordRepository extends JpaRepository<PasswordEntity, Integer> {

    List<PasswordEntity> findAll();
    PasswordEntity findByName(String string);


}