package com.company.assets.weapons;

import com.company.assets.GameObject;
//TODO: T has to extend some kind of element (Fire, Ice, "Nothing"? or etc)
public abstract class Weapon<T> extends GameObject {
  int damage;
}
