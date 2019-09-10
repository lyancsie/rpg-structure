package com.company.assets.characters;

import com.company.assets.GameObject;
import com.company.assets.enums.Status;

import java.util.HashMap;

//TODO: It could be a Character<T extends Element>
public abstract class Character extends GameObject {

  private Immunities immunities;
  private Status status;
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
