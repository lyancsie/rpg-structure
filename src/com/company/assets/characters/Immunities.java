package com.company.assets.characters;

import com.company.assets.enums.ElementType;
import com.company.assets.enums.Status;

import java.util.HashMap;
import java.util.Map;

class Immunities extends HashMap<ElementType, Integer> {

    public Immunities(Map<? extends ElementType, ? extends Integer> map) {
        this.putAll(map);
    }
}
