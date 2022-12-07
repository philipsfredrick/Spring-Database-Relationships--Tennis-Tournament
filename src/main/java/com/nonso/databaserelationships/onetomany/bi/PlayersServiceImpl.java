package com.nonso.databaserelationships.onetomany.bi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayersServiceImpl implements PlayersService{

    private final PlayersRepository playersRepository;

    private RegistrationsRepository registrationsRepository;

    @Override
    public Players assignRegistration(int id, Registrations registrations) {
        Players players = playersRepository.findById(id).get();
        players.registerPlayer(registrations);
        return playersRepository.save(players);
    }
}
