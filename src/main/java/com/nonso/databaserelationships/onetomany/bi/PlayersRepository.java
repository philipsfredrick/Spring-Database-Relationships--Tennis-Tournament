package com.nonso.databaserelationships.onetomany.bi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayersRepository extends JpaRepository<Players, Integer> {
}
