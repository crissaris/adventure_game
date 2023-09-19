package com.example.myprecious.dictionary;

public enum Category {

    GO(1),
    DIRECTION(2),
    TAKE(3),
    DROP(3),
    USE(3),
    EAT(5),
    TALK(7),
    OPEN(9),
    CLOSE(9),
    SHOW(11),
    SHOWING_ITEM(22),
    ITEM(6),
    FOOD(10),
    WEAPON(6),
    OBJECT(14),
    CONTAINER(18),
    ERROR(13),
    ARTICLE(14),
    PREPOSITION(15),
    DETERMINER(16);

    public final int value;

    Category(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
