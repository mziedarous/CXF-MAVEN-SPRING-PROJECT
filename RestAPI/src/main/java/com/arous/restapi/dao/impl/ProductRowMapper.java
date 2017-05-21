package com.arous.restapi.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.arous.restapi.entities.Product;

/**
 * 
 * @author AROUS Med Zied
 *
 */
public class ProductRowMapper implements RowMapper<Product> {

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

		Product product = new Product();
		product.setId(rs.getInt(1));
		product.setName(rs.getString(2));
		product.setDescription(rs.getString(3));
		product.setPrice(rs.getDouble(4));
		product.setCurrency(rs.getString(5));

		return product;
	}

}
