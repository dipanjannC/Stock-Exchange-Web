package com.stock.web.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.stock.web.dao.CompanyRepository;
import com.stock.web.dao.StockPriceRepository;
import com.stock.web.model.Company;
import com.stock.web.model.StockPrice;

@Service
public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	public StockPriceRepository stockPriceRepository;
	
	@Autowired
	public CompanyRepository companyRepository;
	
	
	@Override
	public StockPrice insertStockPrice(StockPrice stockPrice) throws SQLException {
		// TODO Auto-generated method stub
		return stockPriceRepository.save(stockPrice);
	}
	

	@Override
	public ResponseEntity<String> updateStockPrice(int stockPriceId,StockPrice stockPrice) {
		// TODO Auto-generated method stub
		Optional<StockPrice> stockPriceData = stockPriceRepository.findById(stockPriceId);

		if (stockPriceData.isPresent()) {

			StockPrice _stockPrice = stockPriceData.get();
			_stockPrice.setStockExchangeName(stockPrice.getStockExchangeName());
			_stockPrice.setPrice(stockPrice.getPrice());
			_stockPrice.setDate(stockPrice.getDate());
			_stockPrice.setTime(stockPrice.getTime());
			return new ResponseEntity<>("Stock Price Updated successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public List<StockPrice> getStockPriceList() throws SQLException {
		// TODO Auto-generated method stub
		List<StockPrice> stockPrices = new ArrayList<>();
		stockPriceRepository.findAll().forEach(stockPrices::add);

		return stockPrices;
	}

	@Override
	public ResponseEntity<String> deleteStcokPrice(int stockPriceId) {
		// TODO Auto-generated method stub
		stockPriceRepository.deleteById(stockPriceId);
		return new ResponseEntity<>("Stock Price has been Deleted",HttpStatus.OK);
	}

	@Override
	public List<StockPrice> getStockPriceByCompany(String companyName) throws Exception {
		// TODO Auto-generated method stub
		Company company=companyRepository.findByCompanyName(companyName);
		return stockPriceRepository.findByCompanyCode(company.getCompanyCode());
	}

	@Override
	public List<StockPrice> getStockPriceBetween(int companyCode, Date fromDate, Date toDate) throws Exception{
		// TODO Auto-generated method stub
		return stockPriceRepository.getStockPrice(companyCode, fromDate, toDate);
	}


	@Override
	public void exportExcel(MultipartFile file) {
		// TODO Auto-generated method stub
		try {

			List<StockPrice> stockList = new ArrayList<>();
			XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());
			XSSFSheet worksheet = workbook.getSheetAt(0);

			for (int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++) {
				StockPrice stock = new StockPrice();

				XSSFRow row = worksheet.getRow(i);

				stock.setCompanyCode((int) row.getCell(1).getNumericCellValue());
				stock.setPrice((float) row.getCell(2).getNumericCellValue());
				stock.setStockExchangeName((String) row.getCell(3).getStringCellValue());
				stock.setDate((String) row.getCell(4).getStringCellValue());
				stock.setTime((String) row.getCell(5).getStringCellValue());

				stockList.add(stock);

				stockPriceRepository.save(stock);
			}
			System.out.println(stockList);
			workbook.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}


	@Override
	public List<StockPrice> getStockPricesComparison(int companyId, String periodicity) {
		// TODO Auto-generated method stub
		List<StockPrice> stocks = new ArrayList<>();
		List<String[]> dates = new ArrayList<>();
		List<String[]> times = new ArrayList<>();
		List<String> day = new ArrayList<>();
		List<String> month = new ArrayList<>();
		List<String> year = new ArrayList<>();
		List<String> hour = new ArrayList<>();

		stocks = stockPriceRepository.findByCompanyCode(companyId);

		for (StockPrice stock : stocks) {
			dates.add(stock.getDate().split("/"));
			times.add(stock.getTime().split(":"));
		}

		for (String[] s : dates) {
			day.add(s[0]);
			month.add(s[1]);
			year.add(s[2]);
		}
		
		for (String[] s : times) {
			hour.add(s[0]);
		}
		
		return stocks;
	}

	
}
