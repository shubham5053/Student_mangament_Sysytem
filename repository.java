package com.cafe.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cafe.model.user;

@Repository
public interface repository extends JpaRepository<user, Integer> {

	

	

}
