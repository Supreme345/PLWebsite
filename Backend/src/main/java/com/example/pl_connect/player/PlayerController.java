package com.example.pl_connect.player;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PlayerController {

    private final PlayerRepository repository;

    public PlayerController(PlayerRepository repository) {
        this.repository = repository;
    }

    // 1. Get all players
    @GetMapping("/")
    public List<Player> getAllPlayers() {
        return repository.findAll();
    }

    // 2. Get all unique teams
    @GetMapping("/teams")
    public List<String> getAllTeams() {
        return repository.findAllTeams();
    }

    // 3. Filter by team
    @GetMapping("/data")
    public List<Player> getPlayersByTeam(@RequestParam(required = false) String team,
                                         @RequestParam(required = false) String nation,
                                         @RequestParam(required = false) String position) {
        if (team != null) return repository.findByTeam(team);
        if (nation != null) return repository.findByNation(nation);
        if (position != null) return repository.findByPosition(position);
        return repository.findAll();
    }

    // 4. Get all unique nations
    @GetMapping("/nation")
    public List<String> getAllNations() {
        return repository.findAllNations();
    }

    // 5. Get all unique positions
    @GetMapping("/position")
    public List<String> getAllPositions() {
        return repository.findAllPositions();
    }

    // 6. Search by player name
    @GetMapping("/search")
    public List<Player> searchPlayersByName(@RequestParam String name) {
        return repository.searchByName(name);
    }
}