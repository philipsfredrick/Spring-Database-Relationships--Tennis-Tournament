package com.nonso.databaserelationships.controller;

import com.nonso.databaserelationships.onetoone.Player;
import com.nonso.databaserelationships.onetoone.PlayerProfile;
import com.nonso.databaserelationships.service.PlayerProfileService;
import com.nonso.databaserelationships.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/players")
public class PlayerController {

    private final PlayerService playerService;

    private final PlayerProfileService profileService;

    //GET all players
    // GET player by id
    // POST add player
    // DELETE player by id
    // PUT update player

    @GetMapping("/all")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable("id") int playerId) {
        return playerService.getPlayerById(playerId);
    }

    @PostMapping("/add")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePlayer(@PathVariable("id") int playerId) {
        playerService.deletePlayer(playerId);
    }

    @PutMapping("/{id}/profiles/{profile_id}")
    public Player assignDetails(@PathVariable("id") int id, @PathVariable("profile_id") int profileId) {
        PlayerProfile profile = profileService.getPlayerProfile(profileId);
        System.out.println(profile);
        return playerService.assignProfile(id, profile);
    }
}
