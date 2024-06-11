package ru.aaaTurbo.exceptions;

public class DamageMaxMinException extends Exception {

    public DamageMaxMinException() {
        super("Max damage can not be less than min!");
    }
}
