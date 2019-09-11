package com.company.assets.characters;

import com.company.assets.GameObject;
import com.company.assets.enums.ElementType;

import java.util.function.Supplier;

public class Golem<T extends ElementType> extends Monster implements GameObject, Moving {

  public Golem(Supplier supplier) {
    super(supplier);
  }
}
