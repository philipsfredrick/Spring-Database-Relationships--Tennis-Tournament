package com.nonso.databaserelationships.repository;

import com.nonso.databaserelationships.onetoone.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
