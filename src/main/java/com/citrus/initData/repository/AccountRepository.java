package com.citrus.initData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citrus.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
