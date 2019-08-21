package com.stock.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.web.model.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Integer> {

}
