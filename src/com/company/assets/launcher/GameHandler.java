package com.company.assets.launcher;

import com.company.assets.enums.Difficulty;

import java.util.Scanner;

public class GameHandler {

  static {
    scanner = new Scanner(System.in);
  }

  private static GameHandler instance;
  private static Scanner scanner;

  private GameHandler() {
    System.out.println("GameHandler initialized");
  }

  public static GameHandler getLauncher() {
    if (instance == null) {
      instance = new GameHandler();
    }
    System.out.println(instance.toString());
    return instance;
  }

  Game newGame() throws InterruptedException {
    Game game;
    int a = scanner.nextInt();
    switch (a) {
      case 1:
        game = Game.newGame(Difficulty.EASY);
        System.out.println("New game");
        return game;
      case 2:
        game = Game.loadGame();
        System.out.println("Game loaded");
        return game;
      default:
        throw new IllegalStateException("Unexpected value: " + a);
    }
  }
}
