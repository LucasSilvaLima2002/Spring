package com.example.API.REST.Api.Rest.Controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.API.REST.Api.Rest.Repository.ProductRepository;
import com.example.API.REST.Api.Rest.model.ProductModel;

@RestController

public class ProductController {

	@Autowired
	ProductRepository repository;
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductModel>> getAllProducts(){
		 return new
		ResponseEntity<List<ProductModel>>(repository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<ProductModel>
	getOneProduct(@PathVariable(value="id") UUID id){
	 Optional<ProductModel> productO = repository.findById(id);
	 if(productO.isEmpty()) {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 }
	 return new ResponseEntity<ProductModel>(productO.get(),
	HttpStatus.OK);
	}


}
