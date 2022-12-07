package com.nonso.databaserelationships.repository;

import com.nonso.databaserelationships.manytomany.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
