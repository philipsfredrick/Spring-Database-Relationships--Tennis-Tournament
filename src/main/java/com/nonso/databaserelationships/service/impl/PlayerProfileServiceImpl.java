package com.nonso.databaserelationships.service.impl;

import com.nonso.databaserelationships.onetoone.PlayerProfile;
import com.nonso.databaserelationships.repository.PlayerProfileRepository;
import com.nonso.databaserelationships.service.PlayerProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerProfileServiceImpl implements PlayerProfileService {

    private final PlayerProfileRepository playerProfileRepository;

    @Override
    public List<PlayerProfile> getAllProfiles() {
        return playerProfileRepository.findAll();
    }

    @Override
    public PlayerProfile getPlayerProfile(int id) {
        return playerProfileRepository.findById(id).get();
    }

    @Override
    public PlayerProfile addPlayerProfile(PlayerProfile playerProfile) {
        playerProfile.setId(0);
        return playerProfileRepository.save(playerProfile);
    }

    @Override
    public void deleteProfile(int id) {
        playerProfileRepository.deleteById(id);
    }
}
