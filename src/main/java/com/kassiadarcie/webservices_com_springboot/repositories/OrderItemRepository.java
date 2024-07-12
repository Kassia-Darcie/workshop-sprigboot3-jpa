package com.kassiadarcie.webservices_com_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kassiadarcie.webservices_com_springboot.entities.OrderItem;
import com.kassiadarcie.webservices_com_springboot.entities.pk.OrdemItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrdemItemPK>{

}
