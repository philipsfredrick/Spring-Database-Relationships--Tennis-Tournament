package com.nonso.databaserelationships.service;

import com.nonso.databaserelationships.onetomany.bi.Players;
import com.nonso.databaserelationships.onetomany.bi.Registrations;
import com.nonso.databaserelationships.onetoone.Player;
import com.nonso.databaserelationships.onetoone.PlayerProfile;

import java.util.List;

public interface PlayerService {

    List<Player> getAllPlayers();
    Player addPlayer(Player player);
    Player getPlayerById(int id);
    void deletePlayer(int id);

    Player assignProfile(int id, PlayerProfile profile);
    Players assignRegistration(int id, Registrations registration);
}
