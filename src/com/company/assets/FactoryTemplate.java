package com.company.assets;

public interface FactoryTemplate<T extends GameObject> {
  T create();
}
