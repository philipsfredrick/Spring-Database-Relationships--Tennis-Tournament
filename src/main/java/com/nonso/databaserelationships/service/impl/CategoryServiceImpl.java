package com.nonso.databaserelationships.service.impl;

import com.nonso.databaserelationships.manytomany.Category;
import com.nonso.databaserelationships.repository.CategoryRepository;
import com.nonso.databaserelationships.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;


    @Override
    public Category getCategory(int id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public List<Category> allCategories() {
            return categoryRepository.findAll();
    }
    @Override
    public Category addCategory(Category category) {
        category.setId(0);
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(int id) {
        categoryRepository.deleteById(id);
        }
    }

