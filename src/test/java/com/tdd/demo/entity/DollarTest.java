package com.tdd.demo.entity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DollarTest {


    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar dollar = five.times(2);
        assertThat(new Dollar(10)).isEqualTo(dollar);
        dollar = five.times(10);
        assertThat(new Dollar(50)).isEqualTo(dollar);
    }

    @Test
    public void equal() {
        //given
        //when
        //then
        assertThat(new Dollar(0)).isEqualTo(new Dollar(0));
        assertThat(new Dollar(10)).isNotEqualTo(new Dollar(11));
        assertThat(new Franc(5)).isEqualTo(new Franc(5));
        assertThat(new Franc(10)).isNotEqualTo(new Franc(11));
    }

    @Test
    public void testFrancMultiplication() {
        //given
        //when
        Franc five = new Franc(5);
        //then
        assertThat(new Franc(10)).isEqualTo(five.times(2));
        assertThat(new Franc(15)).isEqualTo(five.times(3));
    }


}