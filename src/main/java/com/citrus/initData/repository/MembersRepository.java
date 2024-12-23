package com.citrus.initData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citrus.model.Members;

public interface MembersRepository extends JpaRepository<Members, Long> {

}
