package ru.aaaTurbo.exceptions;

public class HealthOutOfBoundsExceptions extends Exception {

    public HealthOutOfBoundsExceptions() {
        super("Health of creature is put of bounds! It must be more than 0!");
    }
}
