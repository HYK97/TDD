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
    public void equeal() {
        //given
        //when
        //then
        assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
        assertThat(new Dollar(10)).isEqualTo(new Dollar(10));
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