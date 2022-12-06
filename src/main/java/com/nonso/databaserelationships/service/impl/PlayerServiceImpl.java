package com.nonso.databaserelationships.service.impl;

import com.nonso.databaserelationships.onetoone.Player;
import com.nonso.databaserelationships.onetoone.PlayerProfile;
import com.nonso.databaserelationships.repository.PlayerRepository;
import com.nonso.databaserelationships.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    // GET all players
    // add a player
    // delete a player
    // get a player by id
    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Player addPlayer(Player player) {
        player.setId(0);
        return playerRepository.save(player);
    }

    @Override
    public Player getPlayerById(int id) {
        return playerRepository.findById(id).get();
    }

    @Override
    public void deletePlayer(int id) {
        playerRepository.deleteById(id);
    }

    @Override
    public Player assignProfile(int id, PlayerProfile profile) {
        Player player = playerRepository.findById(id).get();
        player.setPlayerProfile(profile);
        return playerRepository.save(player);
    }
}
