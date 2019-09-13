package com.company.assets.characters;

import com.company.assets.GameObject;
import com.company.assets.enums.ElementType;

import java.util.function.Supplier;

public class Golem extends Monster implements GameObject, Moving {

  public Golem(Immunities immunities, int HP) {
    super(immunities, HP);
  }
}
