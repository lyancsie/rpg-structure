package com.company.assets.weapons;

import com.company.assets.FactoryTemplate;
import com.company.assets.enums.ElementType;

public class WeaponFactory<T extends ElementType> implements FactoryTemplate<Weapon> {
  @Override
  public Weapon create() {
    return null;
  }

}
