package com.netsurfingzone.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.netsurfingzone.entity.Book;

public class SpringMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			Long id = 1l;
			Book book = session.get(Book.class, id);
			book.setName("Alchemist");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
}
