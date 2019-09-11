package com.company.assets.weapons;

import com.company.assets.GameObject;
import com.company.assets.enums.ElementType;

//TODO: T has to extend some kind of element (Fire, Ice, "Nothing"? or etc)
public abstract class Weapon<T extends ElementType> implements GameObject {
  int damage;
}
