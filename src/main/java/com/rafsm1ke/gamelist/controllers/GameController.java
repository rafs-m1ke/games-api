package com.rafsm1ke.gamelist.controllers;

import com.rafsm1ke.gamelist.models.Game;
import com.rafsm1ke.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping
    public ResponseEntity<Game> createGame(@RequestBody Game game) {
        return ResponseEntity.status(HttpStatus.CREATED).body(gameService.addGame(game));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Game> findById(@PathVariable String id) {
        return ResponseEntity.ok(gameService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Game>> findAll() {
        return ResponseEntity.ok(gameService.findAll());
    }

    @PatchMapping("/{idGame}/console/{idConsole}")
    public ResponseEntity<Game> addConsole(@PathVariable String idGame, @PathVariable String idConsole) {
        return ResponseEntity.ok(gameService.addConsole(idGame, idConsole));
    }

    @PatchMapping("/{idGame}/category/{idCategory}")
    public ResponseEntity<Game> addCategory(@PathVariable String idGame, @PathVariable String idCategory) {
        return ResponseEntity.ok(gameService.addConsole(idGame, idCategory));
    }
}
