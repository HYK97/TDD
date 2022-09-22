package com.tdd.demo.entity;

import java.util.Objects;

/**
 * 상위의 equals를 사용함
 */

/*
 * 상속일 경우에는 @EqualsAndHashCode 사용을 하지말자
 * 예상치 못한 동작을 할수있다.
 * */

public class Money implements Expression {
    protected String currency;

    protected int amount;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Money money = (Money) o;
        return amount == money.amount && Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, amount);
    }

    public Sum plus(Money addend) {
        return new Sum(this, addend);
    }

    @Override
    public Money reduce(String to) {
        return this;
    }
}
