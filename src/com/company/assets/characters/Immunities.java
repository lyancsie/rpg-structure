package com.company.assets.characters;

import com.company.assets.enums.Status;
import java.util.HashMap;
import java.util.Map;

/*TODO:
//not a map of statuses, but a map of elements or some kind of types
//some exception handling needed because all statuses need to be there once*/
class Immunities extends HashMap<Status, Integer> {

  void initialize() {

    this.put(Status.BURNT, 0);
    this.put(Status.FROZEN, 0);
    this.put(Status.HEALED, 0);
    this.put(Status.NORMAL, 0);

  }

  public Immunities(Map<? extends Status, ? extends Integer> m) {


  }
}
