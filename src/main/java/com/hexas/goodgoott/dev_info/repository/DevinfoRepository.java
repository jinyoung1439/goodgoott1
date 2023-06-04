package com.hexas.goodgoott.dev_info.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexas.goodgoott.dev_info.domain.DevinfoDomain;

public interface DevinfoRepository extends JpaRepository<DevinfoDomain, String>{
	
}
