package com.example.API.REST.Api.Rest.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.API.REST.Api.Rest.model.ProductModel;



public interface ProductRepository extends JpaRepository<ProductModel, UUID>{

}
