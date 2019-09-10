package com.company.assets;

import java.util.Enumeration;

public interface FactoryTemplate<T extends GameObject> {
  T create();
}
