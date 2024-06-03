package com.example.Student.OrderMapper;

import com.example.Student.DTO.OrderDTO;
import com.example.Student.Entity.Order;

public class OrderMapper {
	public static Order mapToOrder(OrderDTO orderdto) {
		return new Order(orderdto.getOrderId(),
						 orderdto.getOrderName(),
						 orderdto.getOrderQuntity(),
						 orderdto.getDeliveryLocation());
	}
	public static OrderDTO mapToOrderDTO(Order order) {
		return new OrderDTO(order.getOrderId(),
				order.getOrderName(),
				order.getOrderQuntity(),
				order.getDeliveryLocation());
	}

}
