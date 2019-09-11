package com.company.assets.characters;

import com.company.assets.enums.ElementType;
import com.company.assets.enums.Status;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*TODO:
//not a map of statuses, but a map of elements or some kind of types
//some exception handling needed because all statuses need to be there once*/
public class Immunities extends HashMap<ElementType, Integer> {

  public Immunities(Map<? extends ElementType, ? extends Integer> m) {
    this.putAll(m);
  }
}
