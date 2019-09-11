package com.company;

import com.company.assets.Game;
import com.company.assets.Persistence;
import com.company.assets.characters.Mage;
import com.company.assets.enums.ElementType;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ElementType elementType = ElementType.FIRE;
        Mage<ElementType> mage = new Mage<ElementType>(() -> ElementType.FIRE);
        Mage<ElementType> mage2 = new Mage<ElementType>(() -> ElementType.ICE);
        ElementType elementType1 = ElementType.FIRE;

        Persistence persistence = new Persistence();
        String filename = "C:/BloodAsylum/file.txt";
        try {
            persistence.save(new Game(), filename, true);
            Runtime.getRuntime().exec("notepad.exe " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
