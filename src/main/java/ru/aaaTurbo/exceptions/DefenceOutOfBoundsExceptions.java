package ru.aaaTurbo.exceptions;

public class DefenceOutOfBoundsExceptions extends Exception {

    public DefenceOutOfBoundsExceptions() {
        super("Defence of creature is put of bounds! It must be from 1 upto 30!");
    }
}
