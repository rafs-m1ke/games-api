package com.rafsm1ke.gamelist.services;

import com.rafsm1ke.gamelist.models.Console;
import com.rafsm1ke.gamelist.repositories.ConsoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsoleService {
    private ConsoleRepository repository;

    @Autowired
    public ConsoleService(ConsoleRepository repository) {
        this.repository = repository;
    }

    public Console addConsole(Console console) {
        return repository.save(console);
    }

    public Console findById(String id) {
        return repository.findById(id).get();
    }

    public List<Console> findAll() {
        return repository.findAll();
    }
}
