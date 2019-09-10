package com.company.assets.characters;

import com.company.assets.GameObject;
import com.company.assets.enums.ElementType;
import com.company.assets.enums.Status;

//TODO: It could be a Character<T extends Element>
//Do we need that GameObject? Possibly not
public abstract class Character<T extends ElementType> extends GameObject {

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
