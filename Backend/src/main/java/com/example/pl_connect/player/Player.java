package com.example.pl_connect.player;

import jakarta.persistence.*;

@Entity
@Table(name = "\"player_data\"")
public class Player {
    @Id
    @Column(name = "\"Player\"")
    private String player;

    @Column(name = "\"Nation\"")
    private String nation;

    @Column(name = "\"Pos\"")
    private String position;

    @Column(name = "\"Age\"")
    private Integer age;

    @Column(name = "\"MP\"")
    private Integer matchesPlayed;

    @Column(name = "\"Starts\"")
    private Integer starts;

    @Column(name = "\"Min\"")
    private Double minutes;

    @Column(name = "\"Gls\"")
    private Double goals;

    @Column(name = "\"Ast\"")
    private Double assists;

    @Column(name = "\"PK\"")
    private Double penalties;

    @Column(name = "\"CrdY\"")
    private Double yellowCards;

    @Column(name = "\"CrdR\"")
    private Double redCards;

    @Column(name = "\"xG\"")
    private Double expectedGoals;

    @Column(name = "\"xAG\"")
    private Double expectedAssists;

    @Column(name = "\"Team\"")
    private String team;

    // Constructors
    public Player() {}

    public Player(String player, String nation, String position, Integer age,
                  Integer matchesPlayed, Integer starts, Double minutes,
                  Double goals, Double assists, Double penalties,
                  Double yellowCards, Double redCards,
                  Double expectedGoals, Double expectedAssists, String team) {
        this.player = player;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matchesPlayed = matchesPlayed;
        this.starts = starts;
        this.minutes = minutes;
        this.goals = goals;
        this.assists = assists;
        this.penalties = penalties;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.expectedGoals = expectedGoals;
        this.expectedAssists = expectedAssists;
        this.team = team;
    }

    // Getters and Setters
    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMinutes() {
        return minutes;
    }

    public void setMinutes(Double minutes) {
        this.minutes = minutes;
    }

    public Double getGoals() {
        return goals;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public Double getAssists() {
        return assists;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public Double getPenalties() {
        return penalties;
    }

    public void setPenalties(Double penalties) {
        this.penalties = penalties;
    }

    public Double getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(Double yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Double getRedCards() {
        return redCards;
    }

    public void setRedCards(Double redCards) {
        this.redCards = redCards;
    }

    public Double getExpectedGoals() {
        return expectedGoals;
    }

    public void setExpectedGoals(Double expectedGoals) {
        this.expectedGoals = expectedGoals;
    }

    public Double getExpectedAssists() {
        return expectedAssists;
    }

    public void setExpectedAssists(Double expectedAssists) {
        this.expectedAssists = expectedAssists;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    // toString() for debugging
    @Override
    public String toString() {
        return "Player{" +
                "player='" + player + '\'' +
                ", nation='" + nation + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", matchesPlayed=" + matchesPlayed +
                ", starts=" + starts +
                ", minutes=" + minutes +
                ", goals=" + goals +
                ", assists=" + assists +
                ", penalties=" + penalties +
                ", yellowCards=" + yellowCards +
                ", redCards=" + redCards +
                ", expectedGoals=" + expectedGoals +
                ", expectedAssists=" + expectedAssists +
                ", team='" + team + '\'' +
                '}';
    }
}