package com.stock.web.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.stock.web.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	static Connection connection = null;
	static Statement statement = null;


	public User userLogin(User user) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = DBUtil.makeConnection();
		java.sql.Statement statement = null;
		ResultSet resultSet;
		User userDetails = new User();

		try {
			statement = connection.createStatement();
			// Executing query to fetch the user details from the database
			String query = "select * from user_details where user_name='" + user.getUsername() + "'";
			resultSet = statement.executeQuery(query);

			if (resultSet.next()) {
				// setting data into the User
				int userId=resultSet.getInt("id");
				
				userDetails.setUserId(userId);
				userDetails.setUsername(resultSet.getString("username"));
				userDetails.setPassword(resultSet.getString("password"));
				userDetails.setUserType(resultSet.getString("usertype"));
				userDetails.setEmail(resultSet.getString("email"));
				userDetails.setConfirmed(resultSet.getBoolean("confirmed"));

			}

			if (resultSet != null) {
				resultSet.close();

			}
			statement.close();

		} catch (SQLException e) {
			System.out.println(e);
			throw e;
		}
		return userDetails;

	}

	public int userSignUp(User user) throws SQLException {
		// TODO Auto-generated method stub
		connection = DBUtil.makeConnection();
		int checkSignUp = 0;
		try {
			statement = connection.createStatement();

			String query = "insert into user(username," 
										+ "password,"
										+ "usertype,"
										+ "email,"
										+ "mobilenumber,"
										+ ") values("
										+ user.getUsername() + ","
										+ user.getPassword() + ","
										+ user.getUserType() + ","
										+ user.getEmail() + ","
										+ user.getMobileNumber() + ")";

			checkSignUp = statement.executeUpdate(query);
			
		} catch (SQLException e) {
			System.out.println(e);
			throw e;
		} finally {
			connection.close();
		}

		return checkSignUp;
	}

}
