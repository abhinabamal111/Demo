package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
	
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO PRODUCT VALUES('1','white','glow','light','30.5')", nativeQuery = true)
	public void insertdata();

}
