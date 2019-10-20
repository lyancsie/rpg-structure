package com.company.assets.characters;

public interface Observer<T> {
    void handle(PropertyChangedEventArgs<T> args);
}
