package com.nonso.databaserelationships.service;

import com.nonso.databaserelationships.onetomany.uni.Registration;
import com.nonso.databaserelationships.onetomany.uni.Tournament;

import java.util.List;

public interface TournamentService {

    List<Tournament> allTournaments();
    Tournament addTour(Tournament tournament);
    Tournament getTour(int id);
    void deleteTour(int id);
    Tournament addRegistration(int id, Registration registration);
    Tournament removeRegistration(int id, Registration registration);
}
