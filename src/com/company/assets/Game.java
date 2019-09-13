package com.company.assets;

//TODO: use some library to implement JSON toString();
public class Game {
  //TODO: create model
  int a = 25;
  String name = "Abc";

  public static Game newGame() {
    return new Game();
  }

  public static Game loadGame() {
    return new Game();
  }

  @Override
  public String toString() {
    return "Game{" +
        "a=" + a +
        ", name='" + name + '\'' +
        '}';
  }
}
