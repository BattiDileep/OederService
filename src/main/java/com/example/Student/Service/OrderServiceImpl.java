package com.example.Student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.DTO.OrderDTO;
import com.example.Student.Entity.Order;
import com.example.Student.OrderMapper.OrderMapper;
import com.example.Student.Repo.OrderRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService{
@Autowired
OrderRepo orderrepo;
	@Override
	public OrderDTO createOrder(OrderDTO orderdto) {
		Order order=OrderMapper.mapToOrder(orderdto);
		Order savedorder=orderrepo.save(order);
		return OrderMapper.mapToOrderDTO(savedorder);
	}

}
