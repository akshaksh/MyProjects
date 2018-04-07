package com.bharath.trainings.ws.product.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bharath.trainings.ws.product.dao.mappers.ProductRowMapper;
import com.bharath.trainings.ws.product.entity.Product;

public class ProductDAOImpl implements ProductDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public void create(Product product) {
		jdbcTemplate.update("insert into product values(" + product.getId() + ",'" + product.getName() + "','"
				+ product.getDescription() + "'," + product.getPrice() + ")");

	}

	@Override
	public void update(int id, int price) {

		jdbcTemplate.update("update product set price=" + price + " where id=" + id);

	}

	@Override
	public void delete(int id) {

		jdbcTemplate.update("delete from product where id=" + id);

	}

	@Override
	public Product find(int id) {

		Product product = jdbcTemplate.queryForObject("select * from product where id=" + id, new ProductRowMapper());
		return product;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
