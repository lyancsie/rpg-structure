package com.company;

import com.company.assets.Game;
import com.company.assets.Persistence;
import com.company.assets.characters.Immunities;
import com.company.assets.characters.Mage;
import com.company.assets.enums.ElementType;

import java.io.IOException;
import java.util.HashMap;

//TODO: import maven / gradle
public class Main {
  public static void main(String[] args) {

    Persistence persistence = new Persistence();
    String filename = "C:\\BloodAsylum\\file.txt";
    try {
      persistence.save(new Game(), filename, true);
      Runtime.getRuntime().exec("notepad.exe " + filename);
    } catch (IOException e) {
      e.printStackTrace();
    }
    HashMap<ElementType, Integer> map = new HashMap<>();
    map.put(ElementType.FIRE, 100);
    map.put(ElementType.ICE, -15);
    Immunities immunities = new Immunities(map);
    System.out.println(immunities);

    ElementType elementType = ElementType.FIRE;
    Mage<ElementType> mage = new Mage<ElementType>(() -> ElementType.FIRE);
    Mage<ElementType> mage2 = new Mage<ElementType>(() -> ElementType.ICE);

  }
}