package com.kassiadarcie.webservices_com_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kassiadarcie.webservices_com_springboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
