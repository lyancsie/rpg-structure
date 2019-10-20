package com.company.assets;

import com.company.assets.characters.Observable;
import com.company.assets.characters.Observer;
import com.company.assets.characters.PropertyChangedEventArgs;

public class Board implements Observer<Character> {
    int size;

    @Override
    public void handle(PropertyChangedEventArgs<Character> args) {
        System.out.println("Character's " + args.propertyName + " has changed to " + args.newValue);
    }
}
