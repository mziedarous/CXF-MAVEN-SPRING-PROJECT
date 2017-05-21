package com.arous.restapi.ws.product.impl;

import javax.ws.rs.core.Response;

import com.arous.restapi.dao.ProductDao;
import com.arous.restapi.ws.dto.Product;
import com.arous.restapi.ws.product.ProductWs;

/**
 * 
 * @author AROUS Med Zied
 *
 */
public class ProductWsImpl implements ProductWs {

	private ProductDao dao;

	public Response add(Product product) {
		com.arous.restapi.entities.Product productEntity = mapWsToDao(product);
		dao.create(productEntity);
		return Response.ok().build();
	}

	public Response update(Product product) {
		dao.update(product.getId(), product.getPrice());
		return Response.ok().build();
	}

	public Response delete(int id) {
		dao.delete(id);
		return Response.ok().build();
	}

	public Product find(int id) {
		com.arous.restapi.entities.Product productEntity = dao.find(id);
		Product product = mapDaoToWs(productEntity);
		return product;
	}

	private Product mapDaoToWs(com.arous.restapi.entities.Product productEntity) {
		Product product = new Product();
		product.setId(productEntity.getId());
		product.setName(productEntity.getName());
		product.setDescription(productEntity.getDescription());
		product.setPrice(productEntity.getPrice());
		product.setCurrency(productEntity.getCurrency());
		return product;
	}

	private com.arous.restapi.entities.Product mapWsToDao(Product product) {
		com.arous.restapi.entities.Product productEntity = new com.arous.restapi.entities.Product();
		productEntity.setId(product.getId());
		productEntity.setName(product.getName());
		productEntity.setDescription(product.getDescription());
		productEntity.setPrice(product.getPrice());
		productEntity.setCurrency(product.getCurrency());
		return productEntity;
	}

	public ProductDao getDao() {
		return dao;
	}

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

}
