package com.zakaria.inventorymanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDto {
	
	private String address1;
	
	private String address2;
	
	private String city;
	
	private String zipCode;
	
	private String country;
}
