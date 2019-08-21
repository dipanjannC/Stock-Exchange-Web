package com.stock.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.web.model.StockExchange;

public interface StockExchangeRepository extends JpaRepository<StockExchange, Integer> {

}
