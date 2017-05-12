package com.niit.modeldaoimple;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.modeldao.Categorydao;
import com.niit.modeldto.Category;
import com.niit.modeldto.Product;
import com.niit.modeldto.User;
@Transactional
@Repository("categorydao")
public class Categorydaoimple implements Categorydao
{
	
	@Autowired
	SessionFactory sessionFactory;
	public void addCategory(Category category) {
		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		session.persist(category);
		transaction.commit();
		session.close();
		
	}
	public void updateCategroy(Category category) {
		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		session.update(category);
		transaction.commit();
		session.close();
		
	}

	public void deleteCategory(int catid) {
		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		session.delete(catid);
		transaction.commit();
		session.close();
		
	}

	public Category getCategoryById(int catid) {
		Session session=sessionFactory.openSession();
		Category category=(Category)session.get(Category.class,catid);
		session.close();
		return category;
	}

	public List<Category> displayAll() 
	{
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Category> list=session.createQuery("from Category").list();
		session.close();
		return list;
	}
	
}
