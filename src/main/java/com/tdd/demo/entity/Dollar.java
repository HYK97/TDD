package com.tdd.demo.entity;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Dollar {
    private final int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }


    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
