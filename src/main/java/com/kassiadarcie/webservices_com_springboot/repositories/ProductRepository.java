package com.kassiadarcie.webservices_com_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kassiadarcie.webservices_com_springboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
