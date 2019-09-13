package com.company;

import com.company.assets.Game;
import com.company.assets.Persistence;
import com.company.assets.characters.Hero;
import com.company.assets.characters.Immunities;
import com.company.assets.characters.Mage;
import com.company.assets.enums.ElementType;
import com.company.assets.weapons.Mace;

import java.io.IOException;
import java.util.HashMap;

//TODO: import maven / gradle
public class Main {

  public static void main(String[] args) {

    System.out.println(3 ^ 5);

    //3=011
    //5=101
    //  111
    //  001
    System.out.println(3 | 5);
    System.out.println(3 & 5);

    Persistence persistence = new Persistence();
    String filename = "C:\\BloodAsylum\\file.txt";
    try {
      persistence.save(new Game(), filename, true);
      Runtime.getRuntime().exec("notepad.exe " + filename);
    } catch (IOException e) {
      e.printStackTrace();
    }

    HashMap<ElementType, Integer> map = new HashMap<>();
    map.put(ElementType.FIRE, 20);
    map.put(ElementType.ICE, -15);
    Immunities immunities = new Immunities(map);
    System.out.println(immunities);

    ElementType elementType = ElementType.FIRE;
    //Mage<ElementType> mage = new Mage<ElementType>(() -> ElementType.FIRE);
    //AtomicReference<Mage<ElementType>> mage2 = new AtomicReference<>(new Mage<ElementType>(() -> ElementType.ICE));


    Mace mace = new Mace<>(()->ElementType.FIRE, 100);
    Hero hero = new Hero(immunities, 200);

    mace.damage(hero);

    System.out.println(hero.getHP());
  }
}
