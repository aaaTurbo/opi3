package ru.aaaTurbo.entities.abstracts;

import ru.aaaTurbo.exceptions.AttackOutOfBoundsExceptions;
import ru.aaaTurbo.exceptions.DamageMaxMinException;
import ru.aaaTurbo.exceptions.DamageUnderZeroException;
import ru.aaaTurbo.exceptions.DefenceOutOfBoundsExceptions;
import ru.aaaTurbo.exceptions.HealthOutOfBoundsExceptions;

import java.util.Random;

public abstract class Creature {
    private String name;
    private int health;
    private int attack;
    private int defence;
    private int maxDamage;
    private int minDamage;

    public Creature(String name, int health, int attack, int defence, int maxDamage, int minDamage)
            throws DefenceOutOfBoundsExceptions, AttackOutOfBoundsExceptions, HealthOutOfBoundsExceptions, DamageUnderZeroException, DamageMaxMinException {
        if (defence < 1 || defence > 30) {
            throw new DefenceOutOfBoundsExceptions();
        }
        if (attack < 1 || attack > 30) {
            throw new AttackOutOfBoundsExceptions();
        }
        if (health < 1) {
            throw new HealthOutOfBoundsExceptions();
        }
        if (maxDamage < minDamage) {
            throw new DamageMaxMinException();
        }
        if (minDamage < 0) {
            throw new DamageUnderZeroException();
        }
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defence = defence;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public void attack(Creature creature) {
        Random dices = new Random();
        Random attackRandomizer = new Random();
        int diceHit;
        int attackModifier = this.attack - creature.getDefence() + 1;
        for (int i = 0; i < attackModifier; i++) {
            diceHit = dices.nextInt(6);
            System.out.println(name + " gets " + (diceHit + 1));
            if (diceHit > 3) {
                int damage = (attackRandomizer.nextInt(maxDamage - minDamage + 1) + minDamage);
                creature.setHealth(creature.getHealth() - damage);
                System.out.println(name + " hit " + creature.getName() + " on " + damage + ". "
                        + creature.getName() + "'s " +  "HP = " + creature.getHealth());
                return;
            }
        }
        System.out.println(name + " missed!");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public String getName() {
        return name;
    }

    public abstract boolean isTestClass();
}
