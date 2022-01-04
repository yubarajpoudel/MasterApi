package com.yuvi.masterapi.repository;

import com.yuvi.masterapi.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
