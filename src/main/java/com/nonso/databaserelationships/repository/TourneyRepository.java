package com.nonso.databaserelationships.repository;

import com.nonso.databaserelationships.manytomany.Tourney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourneyRepository extends JpaRepository<Tourney, Integer> {
}
