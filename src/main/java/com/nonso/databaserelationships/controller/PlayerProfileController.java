package com.nonso.databaserelationships.controller;

import com.nonso.databaserelationships.onetoone.PlayerProfile;
import com.nonso.databaserelationships.service.PlayerProfileService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/profiles")
public class PlayerProfileController {

    private final PlayerProfileService profileService;

    // GET all profiles
    // GET profile by id
    // POST player profile
    // DELETE player profile

    @GetMapping("/all")
    public List<PlayerProfile> allPlayerProfiles() {
        return profileService.getAllProfiles();
    }

    @GetMapping("/{id}")
    public PlayerProfile getProfile(@PathVariable("id") int profileId) {
        return profileService.getPlayerProfile(profileId);
    }

    @PostMapping("/addProfile")
    public PlayerProfile addPlayerProfile(@RequestBody PlayerProfile profile) {
        profile.setId(0);
        return profileService.addPlayerProfile(profile);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePlayerProfile(@PathVariable int id) {
        profileService.deleteProfile(id);
    }
}
