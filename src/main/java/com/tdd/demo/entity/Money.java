package com.tdd.demo.entity;

import java.util.Objects;

/**
 * 상위의 equals를 사용함
 */

/*
 * 상속일 경우에는 @EqualsAndHashCode 사용을 하지말자
 * 예상치 못한 동작을 할수있다.
 * */

public abstract class Money {

    protected int amount;

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

}
