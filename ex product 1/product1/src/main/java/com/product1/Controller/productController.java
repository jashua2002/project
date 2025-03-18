package com.product1.Controller;
	
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product1.Service.productService;
import com.product1.model.Product;

@RestController
 
public class productController {
@Autowired
productService productservice;
 @GetMapping("products")
 public List<Product>getAllProdut()
 {
	return productservice.getAllProduct();
 }
 @GetMapping("products/{id}")
 public Product getByID(@PathVariable ("id")int id) {
	 return productservice.getbyID(id);
 }
 @PostMapping("/add/products")
 public String addProduct(@RequestBody Product product)
 {
	 productservice.addProduct(product);
	 return "added";
 }
 @PutMapping("/products")
 public String updateProduct(@RequestBody Product product)
 {
	 productservice.updateProduct(product);
	 return "updated";
 }
/* @PostMapping("/add/products")
 public void addfrontProduct(@RequestParam("id")int id,
		 @RequestParam ("name") String name,
		 @RequestParam ("price") long price,
		 @RequestParam ("rating") double rating) {
	 productService productService2 = new productService();
	productService2.addfrontProduct(id, name, price, rating);*/
 }

