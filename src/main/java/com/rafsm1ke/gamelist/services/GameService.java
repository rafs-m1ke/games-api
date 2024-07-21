package com.rafsm1ke.gamelist.services;

import com.rafsm1ke.gamelist.models.Category;
import com.rafsm1ke.gamelist.models.Console;
import com.rafsm1ke.gamelist.models.Game;
import com.rafsm1ke.gamelist.repositories.CategoryRepository;
import com.rafsm1ke.gamelist.repositories.ConsoleRepository;
import com.rafsm1ke.gamelist.repositories.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private GameRepository gameRepository;
    private ConsoleRepository consoleRepository;
    private CategoryRepository categoryRepository;

    public GameService(GameRepository gameRepository, ConsoleRepository consoleRepository, CategoryRepository categoryRepository) {
        this.gameRepository = gameRepository;
        this.consoleRepository = consoleRepository;
        this.categoryRepository = categoryRepository;
    }

    public Game addGame(Game game) {
        Game gameToAdd = new Game(game.getName(), game.getDescription(), game.getImageUrl());
        return gameRepository.save(game);
    }

    public Game findById(String id) {
        return gameRepository.findById(id).orElse(null);
    }

    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    public Game addConsole(String gameId, String consoleId) {
        Game game = gameRepository.findById(gameId).orElse(null);
        Console console = consoleRepository.findById(consoleId).orElse(null);
        if (game == null || console == null) {
            throw new RuntimeException("Game not found");
        }

        game.addConsole(console);
        return gameRepository.save(game);
    }

    public Game addCategory(String gameId, String categoryId) {
        Game game = gameRepository.findById(gameId).orElse(null);
        Category category = categoryRepository.findById(categoryId).orElse(null);
        if (game == null || category == null) {
            throw new RuntimeException("Game not found");
        }

        game.addCategory(category);
        return gameRepository.save(game);
    }

}
