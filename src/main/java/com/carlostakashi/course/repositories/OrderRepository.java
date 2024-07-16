package com.carlostakashi.course.repositories;

import com.carlostakashi.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
