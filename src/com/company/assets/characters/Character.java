package com.company.assets.characters;

import com.company.assets.GameObject;
import com.company.assets.enums.ElementType;
import com.company.assets.enums.Status;

import java.util.function.Supplier;

//TODO: It could be a Character<T extends Element>
//Do we need that GameObject? Possibly not
public abstract class Character<T extends ElementType> implements GameObject {


    private T t;
    private Immunities immunities;
    private Status status;

    public Status getStatus() {
        return status;
    }


    public Character(Supplier<T> supplier) {
        this.t = supplier.get();
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
