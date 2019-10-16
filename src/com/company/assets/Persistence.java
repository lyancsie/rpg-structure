package com.company.assets;

import com.company.assets.launcher.Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistence {
  public void save(Game game, String filename, boolean overwrite) throws FileNotFoundException {
    if (overwrite || new File(filename).exists()) {
      try (PrintStream out = new PrintStream(filename)) {
        out.println(game.toString());
      }
    }
  }

  public Game load(String filename) {
    return null;
  }
}