package com.tdd.demo.entity;

public class Bank {


    public Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
