package com.company;

import com.company.assets.Game;
import com.company.assets.Persistence;
import com.company.assets.characters.Hero;
import com.company.assets.characters.Immunities;
import com.company.assets.enums.ElementType;
import com.company.assets.weapons.Mace;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

//TODO: import maven / gradle
public class Main {

  private static Scanner scanner = new Scanner(System.in);
  private static Game game;

  public static void main(String[] args) throws InterruptedException {

    switch (scanner.nextInt()) {
      case 1:
        game = Game.newGame();
        System.out.println("new game");
        break;
      case 2:
        game = Game.loadGame();
        break;
      default:
        System.out.println("Bye");
        Thread.sleep(2000);
        System.exit(0);
    }

    Persistence persistence = new Persistence();
    String filename = "C:\\BloodAsylum\\file.txt";
    try {
      persistence.save(new Game(), filename, true);
      Runtime.getRuntime().exec("notepad.exe " + filename);
    } catch (IOException e) {
      e.printStackTrace();
    }

    HashMap<ElementType, Integer> map = new HashMap<>();
    map.put(ElementType.FIRE, -20);
    map.put(ElementType.ICE, 15);
    Immunities immunities = new Immunities(map);
    System.out.println(immunities);

    Mace mace = new Mace<>(ElementType.ICE, 15);
    Hero hero = new Hero(immunities, 200);

    mace.damage(hero);

    System.out.println(hero.getHP());
  }
}
