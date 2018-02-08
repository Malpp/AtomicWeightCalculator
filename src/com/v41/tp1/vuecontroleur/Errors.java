package com.v41.tp1.vuecontroleur;

public enum Errors {
    EMPTY(0),
    STARTS_WITH_NUMBER(1),
    INVALID_ELEMENT(2),
    INVALID_MULTIPLER_POSITION(3),
    MULTIPLIER_TOO_SMALL(4),
    INVALD_MULTIPLIER(5),
    EMPTY_PARENTHESES(6),
    OPEN_PARENTHESES(7),
    CLOSED_PARENTHESES(8),
    INVALID_CHARACTERS(9),
    STARTS_WITH_CLOSED_PARENTHESE(10);
    private final int value;

    private Errors(int value){
        this.value = value;
    }

    public int toInt(){
        return value;
    }
}
