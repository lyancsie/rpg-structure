package com.company.assets.characters;

import com.company.assets.GameObject;

public class Golem extends Monster implements GameObject, Moving {

  public Golem(Immunities immunities, int HP) {
    super(immunities, HP);
  }
}
