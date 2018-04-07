package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Customer> getCustomers() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query ...and sort based on lastName
		Query<Customer> theQuery = 
				currentSession.createQuery("from Customer order by lastName desc", Customer.class);
		
		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();
				
		//Record list
		System.out.println("Number of Customer: "+customers.size());
		
		// return the results		
		return customers;
	}

	@Override
	public int addCustomer(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
		return customer.getId();
	}
	
	@Override
	public int updateCustomer(Customer customer) {
		sessionFactory.getCurrentSession().update(customer);
		return customer.getId();
	}

	@Override
	public Customer getCustomer(int id) {
		return sessionFactory.getCurrentSession().get(Customer.class, id);
		}

	@Override
	public void deleteCustomer(Customer customer) {
		sessionFactory.getCurrentSession().delete(customer);
	}
}






