package com.stock.web.dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.stock.web.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	public int userLogin(User user) throws SQLException {
		// TODO Auto-generated method stub
		int flag = 0;
		SessionFactory sessionfactory = null;
		Session session = null;

		try {
			sessionfactory = HibernateUtil.getSessionFactory();
			session = sessionfactory.openSession();

			User userDetails = new User();

			userDetails.setUsername(user.getUsername());
			userDetails.setPassword(user.getPassword());

			@SuppressWarnings("unchecked")
			List<User> userList = (List<User>) session.createQuery("from user where user_id='" + userDetails.getUsername()
					+ "' and password='" + userDetails.getPassword() + "'").list();

			Iterator<User> iterator = userList.iterator();

			if (iterator.hasNext()) {
				flag = 1;
			}

			else {
				flag = 0;
			}

		} catch (HibernateException he) {
			System.out.println(he);

		}

		finally {
			session.close();
		}

		return flag;

	}

	public int userSignUp(User user) throws SQLException {
		SessionFactory sessionfactory = null;
		Session session = null;
		int userId = 0;

		try {
			sessionfactory = HibernateUtil.getSessionFactory();
			session = sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();

			User newUser = new User();

			newUser.setUsername(user.getUsername());
			newUser.setUsertype(user.getUsertype());
			newUser.setPassword(user.getPassword());
			newUser.setEmail(user.getEmail());
			newUser.setMobileNumber(user.getMobileNumber());
			newUser.setConfirmed(user.getConfirmed());
			session.save(newUser);
			transaction.commit();
			newUser = session.get(User.class, newUser.getUserId());
			userId = newUser.getUserId();

		} catch (HibernateException he) {

			System.out.println(he);
		}

		finally {
			session.close();
		}

		return userId;
	}

}
