package com.tdd.demo.entity;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Franc {
    private final int amount;

    public Franc(int amount) {
        this.amount = amount;
    }


    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}