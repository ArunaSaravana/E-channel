package com.niit.modeldaoimple;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.modeldao.Userdao;
import com.niit.modeldto.Product;
import com.niit.modeldto.User;

@Transactional
@Repository("userdao")
public class Userdaoimple implements Userdao {
	@Autowired
	private SessionFactory sessionFactory;

	public void addUser(User user) {
		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		session.persist(user);
		transaction.commit();
		session.close();

	}

	public void updateUser(User user) 
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		session.update(user);
		transaction.commit();
		session.close();

	}

	public void deleteUser(int cust_id) 
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		session.delete(cust_id);
		transaction.commit();
		session.close();
	}

	public User getUserByUserName(String username) {
		Query query=sessionFactory.getCurrentSession().createQuery("from User where cust_name=?");
		query.setString(0, username);
		return (User) query.uniqueResult();
	}

	public List<Product> displayAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

}
