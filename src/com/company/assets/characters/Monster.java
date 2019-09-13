package com.company.assets.characters;

import com.company.assets.enums.ElementType;

import java.util.function.Supplier;

public abstract class Monster extends Character {

  public Monster(Immunities immunities, int HP) {
    super(immunities, HP);
  }
}
