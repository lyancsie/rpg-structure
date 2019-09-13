package com.company.assets.weapons;

import com.company.assets.enums.ElementType;

import java.util.function.Supplier;

public class Sword<T extends ElementType> extends Weapon {
  public Sword(ElementType elementType, int damage) {
    super(elementType, damage);
  }
}
