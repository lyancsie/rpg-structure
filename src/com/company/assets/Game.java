package com.company.assets;

import com.company.assets.enums.Difficulty;

//TODO: use some library to implement JSON toString();
public class Game {

  //TODO: create model
  //TODO: two-player model? --> how?

  private static Game instance;
  private Board board;
  private final Difficulty difficulty;


  public Board getBoard() {
    return board;
  }

  public Difficulty getDifficulty() {
    return difficulty;
  }

  private Game(Difficulty difficulty) {
    this.difficulty = difficulty;
  }

  public static Game newGame(Difficulty difficulty) {
    return (instance == null ? new Game(difficulty) : instance);
  }

  public static Game loadGame() {
    return instance;
  }

  int a = 25;

  String name = "Abc";

  @Override
  public String toString() {
    return "Game{" +
        "a=" + a +
        ", name='" + name + '\'' +
        '}';
  }
}
