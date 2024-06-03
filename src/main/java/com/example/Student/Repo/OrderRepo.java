package com.example.Student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.Entity.Order;

public interface OrderRepo extends JpaRepository<Order,Long>{

}
