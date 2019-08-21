package com.stock.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.web.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
