package com.company.assets.weapons;

import com.company.assets.enums.ElementType;

import java.util.function.Supplier;

public class Mace<T extends ElementType> extends Weapon {

  public Mace(ElementType elementType, int damage) {
    super(elementType, damage);
  }
}
