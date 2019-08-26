package com.stock.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.web.model.Sector;

public interface SectorRepository extends JpaRepository<Sector, Integer> {


	Sector findBySectorName(String sectorName);
}
