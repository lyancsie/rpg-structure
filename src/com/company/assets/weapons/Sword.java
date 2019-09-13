package com.company.assets.weapons;

import com.company.assets.enums.ElementType;

import java.util.function.Supplier;

public class Sword<T extends ElementType> extends Weapon {
  public Sword(Supplier supplier, int damage) {
    super(supplier, damage);
  }
}
