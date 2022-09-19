package com.tdd.demo.entity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DollarTest {


    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar dollar = five.times(2);
        assertThat(10).isEqualTo(dollar.amount);
        dollar = five.times(10);
        assertThat(50).isEqualTo(dollar.amount);
    }

    @Test
    public void equeal() {
        //given
        //when
        //then
        assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
        assertThat(new Dollar(10)).isEqualTo(new Dollar(10));
    }


}