package com.nonso.databaserelationships.service;

import com.nonso.databaserelationships.manytomany.Category;

import java.util.List;

public interface CategoryService {

    Category getCategory(int id);

    List<Category> allCategories();

    Category addCategory(Category category);

    void deleteCategory(int id);
}
