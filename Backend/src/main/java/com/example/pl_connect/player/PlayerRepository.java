package com.example.pl_connect.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, String> {

    // Get all unique teams
    @Query("SELECT DISTINCT p.team FROM Player p ORDER BY p.team")
    List<String> findAllTeams();

    // Get all unique nations
    @Query("SELECT DISTINCT p.nation FROM Player p ORDER BY p.nation")
    List<String> findAllNations();

    // Get all unique positions
    @Query("SELECT DISTINCT p.position FROM Player p ORDER BY p.position")
    List<String> findAllPositions();

    // Filter by team
    List<Player> findByTeam(String team);

    // Filter by nation
    List<Player> findByNation(String nation);

    // Filter by position
    List<Player> findByPosition(String position);

    // Search by player name (case-insensitive)
    @Query("SELECT p FROM Player p WHERE LOWER(p.player) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Player> searchByName(@Param("name") String name);
}