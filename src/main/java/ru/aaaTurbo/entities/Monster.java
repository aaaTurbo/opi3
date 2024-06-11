package ru.aaaTurbo.entities;

import ru.aaaTurbo.entities.abstracts.Creature;
import ru.aaaTurbo.exceptions.AttackOutOfBoundsExceptions;
import ru.aaaTurbo.exceptions.DamageMaxMinException;
import ru.aaaTurbo.exceptions.DamageUnderZeroException;
import ru.aaaTurbo.exceptions.DefenceOutOfBoundsExceptions;
import ru.aaaTurbo.exceptions.HealthOutOfBoundsExceptions;

public class Monster extends Creature {

    public Monster(String name, int health, int attack, int defence, int maxDamage, int minDamage)
            throws DefenceOutOfBoundsExceptions, AttackOutOfBoundsExceptions, HealthOutOfBoundsExceptions, DamageUnderZeroException, DamageMaxMinException {
        super(name, health, attack, defence, maxDamage, minDamage);
    }

    @Override
    public boolean isTestClass() {
        return false;
    }
}
