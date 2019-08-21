//package com.stock.web.dao;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.stock.web.model.Company;
//
//public class CompanyDaoImpl implements CompanyDao {
//
//	@Autowired
//	public Company newCompany;
//
//	public int insertCompany(Company company) throws SQLException {
//
//		SessionFactory sessionfactory = null;
//		Session session = null;
//		int companyCode = 0;
//
//		try {
//			sessionfactory = HibernateUtil.getSessionFactory();
//			session = sessionfactory.openSession();
//			Transaction transaction = session.beginTransaction();
//
//			newCompany = new Company();
//
//			newCompany.setCompanyName(company.getCompanyName());
//			newCompany.setCeo(company.getCeo());
//			newCompany.setBoardOfDirectors(company.getBoardOfDirectors());
//			newCompany.setSector(company.getSector());
//			newCompany.setStockExchanges(company.getStockExchanges());
//			newCompany.setBrief(company.getBrief());
//			newCompany.setStockCode(company.getStockCode());
//
//			session.save(newCompany);
//			transaction.commit();
//			newCompany= session.get(Company.class, newCompany.getCompanyCode());
//			companyCode = newCompany.getCompanyCode();
//			
//		} catch (HibernateException he) {
//
//			System.out.println(he);
//		}
//
//		finally {
//			session.close();
//		}
//		
//		return companyCode;
//	}
//
//	@Override
//	public Company updateCompany(Company company) throws SQLException {
//
//		return null;
//	}
//
//	public static void main(String[] args) throws Exception {
//
//	}
//
//	@Override
//	public ArrayList<Company> getCompanyList() throws SQLException {
//		
//		ArrayList<Company> companyList = null;
//		SessionFactory sessionfactory = null;
//		Session session = null;
//
//		try {
//			sessionfactory = HibernateUtil.getSessionFactory();
//			session = sessionfactory.openSession();
//
//			List<Company> list = session.createQuery("from Company").list();
//			companyList = new ArrayList<Company>();
//			for (int i = 0; i < list.size(); i++) {
//				Company companyDetails = list.get(i);
//				
//                Company company = new Company();
//				company.setCompanyCode(companyDetails.getCompanyCode());
//				company.setCompanyName(companyDetails.getCompanyName());
//				company.setCeo(companyDetails.getCeo());
//				company.setBoardOfDirectors(companyDetails.getBoardOfDirectors());
//				company.setStockExchanges(companyDetails.getStockExchanges());
//				company.setTurnover(companyDetails.getTurnover());
//				company.setSector(companyDetails.getSector());
//				company.setStockCode(companyDetails.getStockCode());
//				company.setBrief(companyDetails.getBrief());
//				companyList.add(company);
//			}
//
//		} catch (HibernateException he) {
//			System.out.println(he);
//		}
//
//		finally {
//			session.close();
//		}
//
//		return companyList;
//	}
//
//}
