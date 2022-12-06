package com.nonso.databaserelationships.controller;

import com.nonso.databaserelationships.onetomany.uni.Registration;
import com.nonso.databaserelationships.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/registrations")
public class RegistrationController {

    private final RegistrationService registrationService;

    @GetMapping
    public List<Registration> allRegistrations() {
        return registrationService.allRegistrations();
    }

    @GetMapping("/{id}")
    public Registration getRegister(@PathVariable("id") int registerId) {
        return registrationService.getRegister(registerId);
    }

    @PostMapping
    public Registration addRegistration(@RequestBody Registration registration) {
        return registrationService.addRegister(registration);
    }

    @DeleteMapping("/{id}")
    public void deleteRegistration(@PathVariable("id") int deleteRegisterId) {
        registrationService.deleteRegister(deleteRegisterId);
    }
}
