package com.arous.restapi.entities;

import java.io.Serializable;

/**
 * 
 * @author AROUS Med Zied
 *
 */
public class Product implements Serializable {

	private static final long serialVersionUID = 7998097165295688067L;
	private int id;
	private String name;
	private String description;
	private Double price;
	private String currency;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
