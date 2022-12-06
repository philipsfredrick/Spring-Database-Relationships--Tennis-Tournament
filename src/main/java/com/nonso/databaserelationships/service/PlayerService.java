package com.nonso.databaserelationships.service;

import com.nonso.databaserelationships.onetoone.Player;
import com.nonso.databaserelationships.onetoone.PlayerProfile;

import java.util.List;

public interface PlayerService {

    List<Player> getAllPlayers();
    Player addPlayer(Player player);
    Player getPlayerById(int id);
    void deletePlayer(int id);

    Player assignProfile(int id, PlayerProfile profile);
}
