package com.citrus.initData;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.citrus.initData.repository.AccountRepository;
import com.citrus.initData.repository.MembersRepository;
import com.citrus.model.Account;

@Component
public class Local {
	
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private MembersRepository membersRepository;

	@Profile("local")
	@Bean
	private String initlocal() throws Exception {
		Account account = Account.builder().id(1L).userGid(UUID.randomUUID().toString()).build();
		accountRepository.save(account);
		System.out.println(account);
		return "ok";
	}
	
}
