package com.hibernate.app;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="food_table")

public class FoodDTO implements Serializable
{

	//private data member 
	@Column(name="f_type")
	private String type;
	@Column(name="f_name")
	private String name;

	//public getter and setter method
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Column(name="f_price")
	private int price;
	@Id
	@Column(name="f_quantity")
	private int quantity;
	@Column(name="f_isavailable")
	private boolean isAvailable;


	//public constructor
	public FoodDTO()
	{

	}

}
