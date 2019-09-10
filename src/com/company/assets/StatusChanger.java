package com.company.assets;

import com.company.assets.characters.Character;
import com.company.assets.enums.Status;

public interface StatusChanger {
  default void change(Character character, Status status){
    character.setStatus(status);
  }
}
