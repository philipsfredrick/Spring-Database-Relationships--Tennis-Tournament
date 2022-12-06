package com.nonso.databaserelationships.service.impl;

import com.nonso.databaserelationships.onetomany.uni.Registration;
import com.nonso.databaserelationships.onetomany.uni.Tournament;
import com.nonso.databaserelationships.repository.TournamentRepository;
import com.nonso.databaserelationships.service.TournamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TournamentServiceImpl implements TournamentService {

    private final TournamentRepository tournamentRepository;

    @Override
    public List<Tournament> allTournaments() {
        return tournamentRepository.findAll();
    }

    @Override
    public Tournament addTour(Tournament tournament) {
        tournament.setId(0);
        return tournamentRepository.save(tournament);
    }

    @Override
    public Tournament getTour(int id) {
        return tournamentRepository.findById(id).get();
    }

    @Override
    public void deleteTour(int id) {
        tournamentRepository.deleteById(id);
    }

    @Override
    public Tournament addRegistration(int id, Registration registration) {
        Tournament tournament = tournamentRepository.findById(id).get();
        tournament.addRegistration(registration);
        return tournamentRepository.save(tournament);
    }

    @Override
    public Tournament removeRegistration(int id, Registration registration) {
        Tournament tournament = tournamentRepository.findById(id).get();
        tournament.removeRegistration(registration);
        return tournamentRepository.save(tournament);
    }
}
