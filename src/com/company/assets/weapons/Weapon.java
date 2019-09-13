package com.company.assets.weapons;

import com.company.assets.GameObject;
import com.company.assets.characters.Character;
import com.company.assets.enums.ElementType;

import java.util.function.Supplier;

//TODO: T has to extend some kind of element (Fire, Ice, "Nothing"? or etc)
public abstract class Weapon<T extends ElementType> implements GameObject {
  T t;
  int damage;

  public Weapon(Supplier<T> supplier, int damage) {
    t = supplier.get();
    this.damage = damage;
  }

  public void damage(Character character) {
    System.out.println("character was damaged by " + (damage + (int) (character.getImmunities().get(t) / 100. * damage)));
    System.out.println("the damage is:" + damage);
    System.out.println("The damage modifier is: " + (int) (character.getImmunities().get(t) / 100. * damage));
    character.setHP(character.getHP() - (damage - (int) (character.getImmunities().get(t) / 100. * damage)));
  }
}
