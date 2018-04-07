package com.ajay;

import java.util.Date;

import org.hibernate.Session;

import com.ajay.onetoone.Stock;
import com.ajay.onetoone.StockDetail;
import com.ajay.util.HibernateUtil;

public class AppOneToOne {

	public static void main(String[] args) {
		System.out.println("Hibernate one to one (XML mapping)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Stock stock = new Stock();
		stock.setStockId(1);
		stock.setStockCode("4715");
		stock.setStockName("GENM");
		StockDetail stockDetail = new StockDetail();
		stockDetail.setCompName("GENTING Malaysia");
		stockDetail.setCompDesc("Best resort in the world");
		stockDetail.setRemark("Nothing Special");
		stockDetail.setListedDate(new Date());
		stockDetail.setStock(stock);
		stock.setStockDetail(stockDetail);
		session.save(stock);
		session.getTransaction().commit();

		System.out.println("Done");

	}

}
