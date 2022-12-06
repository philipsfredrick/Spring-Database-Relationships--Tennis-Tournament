package com.nonso.databaserelationships.service;

import com.nonso.databaserelationships.onetomany.uni.Registration;

import java.util.List;

public interface RegistrationService {

    // Get all registration lists
    // Get a single registration
    // add a registration
    // delete a registration
    // update full or partial details of a registration.

    List<Registration> allRegistrations();
    Registration getRegister(int id);
    Registration addRegister(Registration registration);
    void deleteRegister(int id);

}
