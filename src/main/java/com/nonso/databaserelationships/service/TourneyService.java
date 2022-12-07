package com.nonso.databaserelationships.service;

import com.nonso.databaserelationships.manytomany.Category;
import com.nonso.databaserelationships.manytomany.Tourney;

public interface TourneyService {

    Tourney getTourney(int id);

    Tourney addCategory(int id, Category category);
}
