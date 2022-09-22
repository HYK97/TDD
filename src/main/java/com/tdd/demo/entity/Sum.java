package com.tdd.demo.entity;

public class Sum implements Expression {

    int augend;
    int addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend.amount;
        this.addend = addend.amount;
    }

    public Money reduce(String to) {
        return new Money(this.addend + this.augend, to);
    }
}
