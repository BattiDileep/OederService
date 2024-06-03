package com.example.Student.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.DTO.OrderDTO;
import com.example.Student.Service.OrderService;

import lombok.AllArgsConstructor;
@RestController
@AllArgsConstructor
@RequestMapping("/API/Order")
public class OrderRest {
	@Autowired
	OrderService ordersrvc;
	
	@PostMapping
	public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO orderdto) {
		OrderDTO savedorderdto=ordersrvc.createOrder(orderdto);
	return new  ResponseEntity<OrderDTO>(savedorderdto,HttpStatus.CREATED);

	}

}
