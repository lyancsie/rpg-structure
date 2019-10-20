package com.company.assets.launcher;

import com.company.assets.Board;
import com.company.assets.Persistence;
import com.company.assets.characters.Character;
import com.company.assets.characters.Hero;
import com.company.assets.characters.Immunities;
import com.company.assets.characters.Observer;
import com.company.assets.characters.PropertyChangedEventArgs;
import com.company.assets.enums.Difficulty;
import com.company.assets.enums.ElementType;
import com.company.assets.weapons.Mace;

import java.io.IOException;
import java.util.HashMap;

//TODO: use some library to implement JSON toString();
public class Game implements Observer<com.company.assets.characters.Character> {

  //TODO: create model
  //TODO: two-player model? --> how?

  private static Game instance;

  @Override
  public String toString() {
    return "Game{" +
        "board=" + board +
        ", difficulty=" + difficulty +
        ", gameType=" + gameType +
        ", a=" + a +
        ", name='" + name + '\'' +
        '}';
  }

  private Board board;
  private final Difficulty difficulty;
  private GameType gameType;
  int a = 25;
  String name = "Abc";


  public Board getBoard() {
    return board;
  }

  public Difficulty getDifficulty() {
    return difficulty;
  }

  private Game(Difficulty difficulty) {
    this.difficulty = difficulty;
    this.gameType = GameType.ONE_PLAYER;
  }

  public static Game newGame(Difficulty difficulty) {
    if (instance == null) {
      instance = new Game(Difficulty.EASY);
    }
    return instance;
  }

  public static Game loadGame() {
    return instance;
  }


  public void doSomething() {
    Persistence persistence = new Persistence();
    String filename = "C:\\BloodAsylum\\file.txt";
    try {
      persistence.save(this, filename, true);
      Runtime.getRuntime().exec("notepad.exe " + filename);
    } catch (IOException e) {
      e.printStackTrace();
    }

    HashMap<ElementType, Integer> map = new HashMap<>();
    map.put(ElementType.FIRE, 20);
    map.put(ElementType.ICE, 80);
    Immunities immunities = new Immunities(map);
    System.out.println(immunities);

    Mace mace = new Mace<>(ElementType.ICE, 15);
    Hero hero = new Hero(immunities, 200);
    hero.subscribe(this);
    mace.damage(hero);

    System.out.println(hero.getHP());
  }

  @Override
  public void handle(PropertyChangedEventArgs<Character> args) {
    System.out.println("Character's " + args.propertyName + " has changed to " + args.newValue);
  }
}
