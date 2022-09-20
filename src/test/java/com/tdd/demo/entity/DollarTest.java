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
    public void testFrancMultiplication() {
        //given
        //when
        Money five = franc(5);
        //then
        assertThat(franc(10)).isEqualTo(five.times(2));
        assertThat(franc(15)).isEqualTo(five.times(3));
    }

    @Test
    public void testDifferentClassEquality() {
        //given
        //when
        //then
        assertThat(new Money(10, "CHF")).isEqualTo(new Franc(10, "CHF"));
        assertThat(new Money(10, "USD")).isEqualTo(new Dollar(10, "USD"));
        assertThat(new Money(1, "CHF")).isNotEqualTo(new Dollar(10, "USD"));
        assertThat(new Money(10, "CHF")).isNotEqualTo(new Dollar(10, "USD"));
    }


}