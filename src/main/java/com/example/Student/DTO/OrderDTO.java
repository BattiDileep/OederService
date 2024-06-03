package com.example.Student.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class OrderDTO {
	private Long orderId;
	private String orderName;
	private String orderQuntity;
	private String deliveryLocation;
	
}
