package com.company.assets.characters;

import com.company.assets.GameObject;
import com.company.assets.enums.ElementType;
import com.company.assets.enums.Status;

import javax.print.DocFlavor;

public abstract class Character extends Observable<Character> implements GameObject {

  private ElementType elementType;
  private Immunities immunities;
  private Status status;
  private String name;
  private int HP;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Character(Immunities immunities, int HP) {
    this.immunities = immunities;
    this.HP = HP;
  }

  public ElementType getElementType() {
    return elementType;
  }

  public void setElementType(ElementType elementType) {
    this.elementType = elementType;
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
    if(this.HP == HP){
      return;
    }
    this.HP = HP;
    this.propertyChanged(this, "HP", HP);
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
