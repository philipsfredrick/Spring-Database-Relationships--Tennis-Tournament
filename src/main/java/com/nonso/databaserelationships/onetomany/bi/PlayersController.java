package com.nonso.databaserelationships.onetomany.bi;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/players")
@AllArgsConstructor
public class PlayersController {

    private final PlayersService playersService;

    private final RegistrationsService registrationsService;

    @PutMapping("/{id}/registrations/{registrations_id}")
    public Players assignRegistration(@PathVariable("id") int id, @PathVariable("registrations_id") int registerId) {
        Registrations registrations = registrationsService.getRegistrations(registerId);
        return playersService.assignRegistration(id, registrations);
    }
}
