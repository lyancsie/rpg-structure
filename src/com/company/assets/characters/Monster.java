package com.company.assets.characters;

import com.company.assets.enums.ElementType;

import java.util.function.Supplier;

public abstract class Monster<T extends ElementType> extends Character{

  public Monster(Immunities immunities, int HP) {
    super(immunities, HP);
  }
}
