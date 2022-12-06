package com.nonso.databaserelationships.controller;

import com.nonso.databaserelationships.onetomany.uni.Registration;
import com.nonso.databaserelationships.onetomany.uni.Tournament;
import com.nonso.databaserelationships.service.RegistrationService;
import com.nonso.databaserelationships.service.TournamentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/tournaments")
public class TournamentController {

    private final TournamentService tournamentService;

    private final RegistrationService registrationService;

    @GetMapping
    public List<Tournament> allTournaments() {
        return tournamentService.allTournaments();
    }

    @GetMapping("/{id}")
    public Tournament getTournament(@PathVariable("id") int id) {
        return tournamentService.getTour(id);
    }

    @PostMapping
    public Tournament addTournament(@RequestBody Tournament tournament) {
        return tournamentService.addTour(tournament);
    }

    @PutMapping("/{id}/registrations/{registration_id}")
    public Tournament addRegistration(@PathVariable("id") int id, @PathVariable("registration_id") int registrationId) {
        Registration registration = registrationService.getRegister(registrationId);
        System.out.println(registration);
        return tournamentService.addRegistration(id, registration);
    }

    @PutMapping("/{id}/remove_registrations/{registration_id}")
    public Tournament removeRegistration(@PathVariable("id") int id, @PathVariable("registration_id") int registerId) {
       Registration registration = registrationService.getRegister(registerId);
        System.out.println(registration);
        return tournamentService.removeRegistration(id, registration);
    }

    @DeleteMapping("/{id}")
    public void deleteTournament(@PathVariable("id") int id) {
        tournamentService.deleteTour(id);
    }
}
