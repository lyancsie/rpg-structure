package com.company.assets;

//TODO: use some library to implement JSON toString();
public class Game {
    //TODO: create model
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
