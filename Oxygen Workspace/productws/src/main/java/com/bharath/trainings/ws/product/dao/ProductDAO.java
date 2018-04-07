package com.bharath.trainings.ws.product.dao;

import com.bharath.trainings.ws.product.entity.Product;

public interface ProductDAO {

	void create(Product product);

	void update(int id, int price);

	void delete(int id);

	Product find(int id);

}
