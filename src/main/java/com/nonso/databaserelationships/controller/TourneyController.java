package com.nonso.databaserelationships.controller;

import com.nonso.databaserelationships.manytomany.Category;
import com.nonso.databaserelationships.manytomany.Tourney;
import com.nonso.databaserelationships.service.CategoryService;
import com.nonso.databaserelationships.service.TourneyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tourneys")
@AllArgsConstructor
public class TourneyController {

    private final TourneyService tourneyService;

    private final CategoryService categoryService;

    @PutMapping("/{id}/categories/{category_id}")
    public Tourney addCategory(@PathVariable("id") int id, @PathVariable("category_id") int categoryId) {
        Category category = categoryService.getCategory(categoryId);
        return tourneyService.addCategory(id, category);
    }
}
