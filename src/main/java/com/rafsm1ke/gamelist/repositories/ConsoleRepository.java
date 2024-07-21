package com.rafsm1ke.gamelist.repositories;

import com.rafsm1ke.gamelist.models.Console;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsoleRepository extends JpaRepository<Console, String> {
}
