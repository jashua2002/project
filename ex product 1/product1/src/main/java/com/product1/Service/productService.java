package com.product1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.product1.Respositary.Repositary;
import com.product1.model.Product;

@Service
public class productService {
	
@Autowired
Repositary repo;

	public List<Product> getAllProduct() {
		 
		return repo.findAll();
	}

	public void addProduct(Product product) {
	 repo.save( product);
		
	}

	public Product getbyID(int id) {
       return repo.findById(id).orElse( new Product());
	}

	public void updateProduct(Product product) {
		 repo.save(product );
		
	}

	/*public void addfrontProduct(int id, String name, long price, double rating) {
	 
		Product product=new Product(id,name,price,rating);
		repo.save(product);*/
	}


