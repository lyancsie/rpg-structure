package com.company.assets.characters;

import com.company.assets.enums.Status;
import com.company.assets.enums.Direction;

public class IceGolem extends Monster implements Moving{
  @Override
  public void setStatus(Status status) {
    if (Status.FROZEN.equals(status)) {
      throw new IllegalArgumentException("IceGolem can't be frozen!");
    }
    super.setStatus(status);
  }

}
