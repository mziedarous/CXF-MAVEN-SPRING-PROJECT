package com.arous.restapi.dao;

import com.arous.restapi.entities.Product;

/**
 * 
 * @author AROUS Med Zied
 *
 */
public interface ProductDao {

	void create(Product product);

	void update(int id, Double price);

	void delete(int id);

	Product find(int id);
}
