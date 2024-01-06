package com.zakaria.inventorymanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

import com.zakaria.inventorymanagement.entity.MovementType;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryMovementDto {
	
	private Integer companyId;
	
	private Integer id;
	
	private Instant movementDate;
	
	private BigDecimal quantity;
	
	private MovementType movementType; // Assuming you have a MovementTypeDto based on your MovementType enumeration.
	
	private ItemDto item;
}
