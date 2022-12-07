package com.nonso.databaserelationships.service.impl;

import com.nonso.databaserelationships.manytomany.Category;
import com.nonso.databaserelationships.manytomany.Tourney;
import com.nonso.databaserelationships.repository.TourneyRepository;
import com.nonso.databaserelationships.service.TourneyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TourneyServiceImpl implements TourneyService {

    private final TourneyRepository tourneyRepository;

    @Override
    public Tourney getTourney(int id) {
        return tourneyRepository.findById(id).get();
    }

    @Override
    public Tourney addCategory(int id, Category category) {
        Tourney tourney = tourneyRepository.findById(id).get();
        tourney.addCategory(category);
        return tourneyRepository.save(tourney);
    }

    public Tourney removeCategory(int id, Category category) {
        Tourney tourney = tourneyRepository.findById(id).get();
        tourney.removeCategory(category);
        return tourneyRepository.save(tourney);
    }
}
