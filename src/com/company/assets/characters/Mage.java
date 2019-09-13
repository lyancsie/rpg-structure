package com.company.assets.characters;

import com.company.assets.enums.ElementType;

import java.util.function.Supplier;

public class Mage extends Monster implements Moving, Teleporting {

    public Mage(Immunities immunities, int HP) {
        super(immunities, HP);
    }

}

