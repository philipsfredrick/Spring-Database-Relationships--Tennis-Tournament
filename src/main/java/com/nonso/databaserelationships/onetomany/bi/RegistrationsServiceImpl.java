package com.nonso.databaserelationships.onetomany.bi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistrationsServiceImpl implements RegistrationsService {

    private final RegistrationsRepository registrationsRepository;

    @Override
    public Registrations getRegistrations(int id) {
        return registrationsRepository.findById(id).get();
    }
}
