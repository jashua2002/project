package com.product1.Respositary;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.product1.model.Product;

@Repository
public interface Repositary extends JpaRepository< Product,Integer>{

}
