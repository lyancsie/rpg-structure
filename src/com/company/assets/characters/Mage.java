package com.company.assets.characters;

import com.company.assets.enums.ElementType;

import java.util.function.Supplier;

public class Mage<T extends ElementType> extends Monster implements Moving, Teleporting {

    public Mage(Supplier supplier) {
        super(supplier);
    }
}

