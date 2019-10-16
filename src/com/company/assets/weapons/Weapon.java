package com.company.assets.weapons;

import com.company.assets.GameObject;
import com.company.assets.characters.Character;
import com.company.assets.enums.ElementType;

//TODO: T has to extend some kind of element (Fire, Ice, "Nothing"? or etc)
public abstract class Weapon implements GameObject {
  ElementType elementType;
  int damage;

  public Weapon(ElementType elementType, int damage) {
    this.elementType = elementType;
    this.damage = damage;
  }

  public void damage(Character character) {
    System.out.println("character was damaged by " + (damage - (int) (character.getImmunities().get(elementType) / 100. * damage)));
    System.out.println("the damage is:" + damage);
    System.out.println("The damage modifier is: " + (int) (character.getImmunities().get(elementType) / 100. * damage));
    character.setHP(character.getHP() - (damage - (int) (character.getImmunities().get(elementType) / 100. * damage)));
  }
}
