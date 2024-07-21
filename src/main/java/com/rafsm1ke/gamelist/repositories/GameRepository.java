package com.rafsm1ke.gamelist.repositories;

import com.rafsm1ke.gamelist.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, String> {
}
