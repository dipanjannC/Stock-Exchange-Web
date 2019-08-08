package com.stock.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.stock.web.model.Company;

public class CompanyDaoImpl implements CompanyDao {

	static Connection connection = null;
	static Statement statement = null;

	public int insertCompany(Company company) throws SQLException {

		connection = DBUtil.makeConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into company(clo) value(?,?,?,?)");
			ps.setInt(1, company.getCompanyCode());
			ps.executeUpdate();
			return 1;
		} catch (SQLException e) {
			return 0;
		} finally {
			connection.close();
		}

	}

	@Override
	public Company updateCompany(Company company) throws SQLException {
		connection = DBUtil.makeConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("");
			ps.setInt(1, company.getCompanyCode());
			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e);
			throw e;
		} finally {
			connection.close();
		}
		return null;
	}

	public static void main(String[] args) throws Exception {

	}

	@Override
	public Company getCompanyList() throws SQLException {

		connection = DBUtil.makeConnection();
		List<Company> companyList = new ArrayList<Company>();
		try {
			PreparedStatement ps = connection.prepareStatement("select * from company");
			ResultSet rs = ps.executeQuery();
			Company company = null;
			while (rs.next()) {
				company = new Company();
				int companyId = rs.getInt("company_code");
				company.setCompanyCode(companyId);
				company.setBoardOfDirectors(rs.getString("boardofdirectors"));
				companyList.add(company);
			}
		} catch (SQLException e) {
			System.out.println(e);
			throw e;
		} finally {
			connection.close();
		}
		return (Company) companyList;
	}

}
