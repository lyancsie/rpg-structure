package com.company.assets;

//TODO: use some library to implement JSON toString();
public class Game {
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
