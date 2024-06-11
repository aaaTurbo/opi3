package ru.aaaTurbo.exceptions;

public class AttackOutOfBoundsExceptions extends Exception {

    public AttackOutOfBoundsExceptions() {
        super("Attack of creature is put of bounds! It must be from 1 upto 30!");
    }
}
