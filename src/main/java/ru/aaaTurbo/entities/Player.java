package ru.aaaTurbo.entities;

import ru.aaaTurbo.entities.abstracts.Creature;
import ru.aaaTurbo.exceptions.AttackOutOfBoundsExceptions;
import ru.aaaTurbo.exceptions.DamageMaxMinException;
import ru.aaaTurbo.exceptions.DamageUnderZeroException;
import ru.aaaTurbo.exceptions.DefenceOutOfBoundsExceptions;
import ru.aaaTurbo.exceptions.HealthOutOfBoundsExceptions;
import ru.aaaTurbo.exceptions.NoMoreHealingsException;
import ru.aaaTurbo.interfaces.Healable;

public class Player extends Creature implements Healable {

    private final int healAmount;
    private final int maxHealth;
    private int healingCounter = 0;

    public Player(String name, int health, int attack, int defence, int maxDamage, int minDamage)
            throws DefenceOutOfBoundsExceptions, AttackOutOfBoundsExceptions, HealthOutOfBoundsExceptions, DamageUnderZeroException, DamageMaxMinException {
        super(name, health, attack, defence, maxDamage, minDamage);
        healAmount = Math.toIntExact(Math.round(health * 0.3));
        maxHealth = health;
    }

    public void heal() throws NoMoreHealingsException {
        if (healingCounter < 4) {
            if (getHealth() + healAmount < maxHealth) {
                setHealth(getHealth() + healAmount);
            } else {
                setHealth(maxHealth);
            }
            healingCounter++;
        } else {
            throw new NoMoreHealingsException(getName());
        }
    }

    @Override
    public boolean isTestClass() {
        return false;
    }
}
