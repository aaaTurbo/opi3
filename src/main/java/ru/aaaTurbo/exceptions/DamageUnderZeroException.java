package ru.aaaTurbo.exceptions;

public class DamageUnderZeroException extends Exception {

    public DamageUnderZeroException() {
        super("Damage can not be less than zero!");
    }
}
