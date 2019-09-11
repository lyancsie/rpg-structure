package com.company.assets.characters;

import com.company.assets.Game;
import com.company.assets.Persistence;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.DateTimeException;
import java.util.Date;

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
    }
}