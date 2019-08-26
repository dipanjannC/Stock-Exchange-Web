package com.stock.web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.stock.web.dao.IPORepository;
import com.stock.web.model.IPODetail;

@Service
public class IPOServiceImpl implements IPOService {

	@Autowired
	public IPORepository ipoRepository;

	@Override
	public IPODetail insetIPO(IPODetail ipo) {
		// TODO Auto-generated method stub
		return ipoRepository.save(ipo);
	}

	@Override
	public IPODetail getIPODetailByCompanyName(String companyName) {
		// TODO Auto-generated method stub
		return ipoRepository.findByCompanyName(companyName);
	}

	@Override
	public ResponseEntity<String> deleteIPO(int ipoId) {
		// TODO Auto-generated method stub
		ipoRepository.deleteById(ipoId);
		return new ResponseEntity<>("IPO has been Deleted", HttpStatus.OK);
	}

	@Override
	public List<IPODetail> getIPODetails() {
		// TODO Auto-generated method stub
		List<IPODetail> ipoDetails = new ArrayList<>();
		ipoRepository.findAll().forEach(ipoDetails::add);

		return ipoDetails;
	}

	@Override
	public ResponseEntity<String> updateIPO(int ipoId, IPODetail ipoDetails) {
		// TODO Auto-generated method stub
		Optional<IPODetail> ipoData = ipoRepository.findById(ipoId);

		if (ipoData.isPresent()) {

			IPODetail _ipo = ipoData.get();
			_ipo.setCompanyName(ipoDetails.getCompanyName());
			_ipo.setIpoRemarks(ipoDetails.getIpoRemarks());
			_ipo.setOpenDateTime(ipoDetails.getOpenDateTime());
			_ipo.setPricePerShare(ipoDetails.getPricePerShare());
			_ipo.setTotalNumberOfShares(ipoDetails.getTotalNumberOfShares());
			_ipo.setStockExchangeId(ipoDetails.getStockExchangeId());
			ipoRepository.save(_ipo);

			return new ResponseEntity<>("IPO Updated Successfully", HttpStatus.OK);
		} else {
		
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
