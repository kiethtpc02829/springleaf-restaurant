package com.springleaf_restaurant_backend.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springleaf_restaurant_backend.user.model.Category;

public interface DAOCategory extends JpaRepository<Category, Integer>{
    
}
