package com.stock.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.stock.web.model.Company;




public class CompanyDaoImpl implements CompanyDao{
	
	static Connection connection = null;
	static Statement statement = null;
	
	public int insertCompany(Company company) throws SQLException {
		
		connection = DBUtil.makeConnection();
		try {
		PreparedStatement ps =connection.prepareStatement("insert into company(clo) value(?,?,?,?)");
		ps.setInt(1, company.getCompanyCode());
		ps.executeUpdate();
		return 1;
		}catch (SQLException e) {
			return 0;
		}
		finally {
			connection.close();
		}
		
	}
	
	@Override
	public Company updateCompany(Company company) {
		return null;
	}
	
	public static void main(String []args) throws Exception{
		
	}
	
	
	
	
}
