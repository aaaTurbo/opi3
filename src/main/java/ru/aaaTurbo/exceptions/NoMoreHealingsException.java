package ru.aaaTurbo.exceptions;

public class NoMoreHealingsException extends Exception {

    public NoMoreHealingsException(String name) {
        super(name + ", you can not heal any more!");
    }
}
