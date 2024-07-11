package com.kassiadarcie.webservices_com_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kassiadarcie.webservices_com_springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
