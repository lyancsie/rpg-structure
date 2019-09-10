package com.company.assets.tiles;

import com.company.assets.StatusChanger;
import com.company.assets.characters.Character;
import com.company.assets.enums.Status;

class Burning extends Tile implements StatusChanger, Movable {
  public void change(Character character) {
    character.setStatus(Status.BURNT);
  }
}
