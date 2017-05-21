package com.arous.restapi.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.arous.restapi.dao.ProductDao;
import com.arous.restapi.entities.Product;

/**
 * 
 * @author AROUS Med Zied
 *
 */
public class ProductDaoImpl implements ProductDao {

	private JdbcTemplate jdbcTemplate;

	public void create(Product product) {
		jdbcTemplate.update("insert into product value(" + product.getId()
				+ ",'" + product.getName() + "','" + product.getDescription()
				+ "'," + product.getPrice() + ",'" + product.getCurrency()
				+ "'");
	}

	public void update(int id, Double price) {
		jdbcTemplate.update("update product set price=" + price
				+ " where id = " + id);
	}

	public void delete(int id) {
		jdbcTemplate.update("delete product where id = " + id);
	}

	public Product find(int id) {
		Product product = jdbcTemplate.queryForObject(
				"select * from product where id = " + id,
				new ProductRowMapper());
		return product;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
