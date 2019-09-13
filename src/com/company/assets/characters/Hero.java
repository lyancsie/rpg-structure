package com.company.assets.characters;

import com.company.assets.enums.Direction;
import com.company.assets.enums.HeroType;
import com.company.assets.weapons.Weapon;

import java.util.function.Supplier;

public class Hero extends Character implements Moving {
  HeroType heroType;
  Weapon weapon;

  public Hero(Immunities immunities, int HP) {
    super(immunities, HP);
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }
}
