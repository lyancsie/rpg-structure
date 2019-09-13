package com.company.assets.characters;

import com.company.assets.GameObject;
import com.company.assets.enums.ElementType;
import com.company.assets.enums.Status;

//TODO: It could be a Character<T extends Element>
public abstract class Character<T extends ElementType> implements GameObject {

  private T t;
  private Immunities immunities;
  private Status status;
  private int HP;

  public Character(Immunities immunities, int HP) {
    this.immunities = immunities;
    this.HP = HP;
  }

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public Immunities getImmunities() {
    return immunities;
  }

  public void setImmunities(Immunities immunities) {
    this.immunities = immunities;
  }

  public int getHP() {
    return HP;
  }

  public void setHP(int HP) {
    this.HP = HP;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return super.toString();
  }

}
