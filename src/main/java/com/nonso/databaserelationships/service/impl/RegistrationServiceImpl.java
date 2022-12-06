package com.nonso.databaserelationships.service.impl;

import com.nonso.databaserelationships.onetomany.uni.Registration;
import com.nonso.databaserelationships.repository.RegistrationRepository;
import com.nonso.databaserelationships.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    private final RegistrationRepository registrationRepository;


    @Override
    public List<Registration> allRegistrations() {
        return registrationRepository.findAll();
    }

    @Override
    public Registration getRegister(int id) {
        return registrationRepository.findById(id).get();
    }

    @Override
    public Registration addRegister(Registration registration) {
        registration.setId(0);
        return registrationRepository.save(registration);
    }

    @Override
    public void deleteRegister(int id) {
        registrationRepository.deleteById(id);
    }
}
