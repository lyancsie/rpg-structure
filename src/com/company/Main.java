package com.company;

import com.company.assets.characters.Mage;
import com.company.assets.enums.ElementType;

public class Main {
  public static void main(String[] args) {
    ElementType elementType = ElementType.FIRE;
    Mage<ElementType> mage = new Mage<ElementType>(() -> ElementType.FIRE);
    Mage<ElementType> mage2 = new Mage<ElementType>(() -> ElementType.ICE);
    ElementType elementType1 = ElementType.FIRE;

    
  }
}