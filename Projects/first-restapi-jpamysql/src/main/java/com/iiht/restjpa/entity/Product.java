package com.iiht.restjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Product {

	@Id
	private long productid;
	private String name;
	private double price;
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", name=" + name + ", price=" + price + "]";
	}	
	
	
	
}
