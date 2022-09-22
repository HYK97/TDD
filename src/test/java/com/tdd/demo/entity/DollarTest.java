package com.tdd.demo.entity;

import org.junit.jupiter.api.Test;

import static com.tdd.demo.entity.Money.dollar;
import static com.tdd.demo.entity.Money.franc;
import static org.assertj.core.api.Assertions.assertThat;

class DollarTest {


    @Test
    void testMultiplication() {
        Money five = dollar(5);
        assertThat(dollar(10)).isEqualTo(five.times(2));
        assertThat(dollar(50)).isEqualTo(five.times(10));
    }

    @Test
    public void equal() {
        //given
        //when
        //then
        assertThat(dollar(0)).isEqualTo(dollar(0));
        assertThat(dollar(5)).isNotEqualTo(dollar(11));
        assertThat(franc(5)).isEqualTo(franc(5));
        assertThat(franc(10)).isNotEqualTo(franc(11));
        assertThat(franc(10)).isNotEqualTo(dollar(10));
    }

    @Test
    public void testSimpleAddition() {
        //given
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        //when
        //then
        assertThat(reduced).isEqualTo(Money.dollar(10));
    }

    @Test
    public void testPlusReturnSum() {
        //given
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        //when
        //then
        assertThat(sum.augend).isEqualTo(five);
        assertThat(sum.addend).isEqualTo(five);

    }

}