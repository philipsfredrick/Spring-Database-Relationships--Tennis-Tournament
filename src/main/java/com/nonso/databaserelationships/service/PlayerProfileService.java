package com.nonso.databaserelationships.service;

import com.nonso.databaserelationships.onetoone.PlayerProfile;

import java.util.List;

public interface PlayerProfileService {

    // get all player profiles
    // get a particular player profile by id
    // delete a player profile
    // add a player profile
    List<PlayerProfile> getAllProfiles();
    PlayerProfile getPlayerProfile(int id);
    PlayerProfile addPlayerProfile(PlayerProfile playerProfile);
    void deleteProfile(int id);
}
