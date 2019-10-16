package com.company.assets.weapons;

import com.company.assets.enums.ElementType;

public class Sword<T extends ElementType> extends Weapon {
  public Sword(ElementType elementType, int damage) {
    super(elementType, damage);
  }
}
