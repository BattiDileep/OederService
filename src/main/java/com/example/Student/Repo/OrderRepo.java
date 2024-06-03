package com.example.Student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Student.Entity.Order;
@Repository
public interface OrderRepo extends JpaRepository<Order,Long>{

}
