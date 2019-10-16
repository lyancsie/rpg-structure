package com.company.assets.launcher;

//TODO: import maven / gradle
public class Main {

  private static GameHandler gameLauncher;

  static {
    gameLauncher = GameHandler.getLauncher();
  }

  public static void main(String[] args) throws InterruptedException {
    Game game = gameLauncher.newGame();
    game.doSomething();
  }
}
