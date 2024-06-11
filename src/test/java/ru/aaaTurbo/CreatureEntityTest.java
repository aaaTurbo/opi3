package ru.aaaTurbo;

import org.junit.Test;
import static org.junit.Assert.*;

import ru.aaaTurbo.entities.abstracts.Creature;

import ru.aaaTurbo.exceptions.AttackOutOfBoundsExceptions;
import ru.aaaTurbo.exceptions.DamageMaxMinException;
import ru.aaaTurbo.exceptions.DamageUnderZeroException;
import ru.aaaTurbo.exceptions.DefenceOutOfBoundsExceptions;
import ru.aaaTurbo.exceptions.HealthOutOfBoundsExceptions;

public class CreatureEntityTest {

    @Test(expected = AttackOutOfBoundsExceptions.class)
    public void testAttackOutOfBoundsExceptionU30()
            throws DefenceOutOfBoundsExceptions, AttackOutOfBoundsExceptions, HealthOutOfBoundsExceptions, DamageMaxMinException, DamageUnderZeroException {
        new Creature("test", 10, 31, 10, 10, 10) {
            public boolean isTestClass() {
                return true;
            }
        };
    }

    @Test(expected = AttackOutOfBoundsExceptions.class)
    public void testAttackOutOfBoundsExceptionU1()
            throws DefenceOutOfBoundsExceptions, AttackOutOfBoundsExceptions, HealthOutOfBoundsExceptions, DamageMaxMinException, DamageUnderZeroException {
        new Creature("test", 10, 0, 10, 10, 10) {
            public boolean isTestClass() {
                return true;
            }
        };
    }

    @Test(expected = DamageUnderZeroException.class)
    public void testDamageUnderZeroException()
            throws DefenceOutOfBoundsExceptions, AttackOutOfBoundsExceptions, HealthOutOfBoundsExceptions, DamageMaxMinException, DamageUnderZeroException {
        new Creature("test", 10, 10, 10, 10, -1) {
            public boolean isTestClass() {
                return true;
            }
        };
    }

    @Test(expected = DamageMaxMinException.class)
    public void testDamageMaxMinException()
            throws DefenceOutOfBoundsExceptions, AttackOutOfBoundsExceptions, HealthOutOfBoundsExceptions, DamageMaxMinException, DamageUnderZeroException {
        new Creature("test", 10, 10, 10, 9, 10) {
            public boolean isTestClass() {
                return true;
            }
        };
    }

    @Test(expected = DefenceOutOfBoundsExceptions.class)
    public void testDefenceOutOfBoundsExceptionsU30()
            throws DefenceOutOfBoundsExceptions, AttackOutOfBoundsExceptions, HealthOutOfBoundsExceptions, DamageMaxMinException, DamageUnderZeroException {
        new Creature("test", 10, 10, 31, 10, 10) {
            public boolean isTestClass() {
                return true;
            }
        };
    }

    @Test(expected = HealthOutOfBoundsExceptions.class)
    public void testHealthOutOfBoundsExceptions()
            throws DefenceOutOfBoundsExceptions, AttackOutOfBoundsExceptions, HealthOutOfBoundsExceptions, DamageMaxMinException, DamageUnderZeroException {
        new Creature("test", 0, 10, 10, 10, 10) {
            public boolean isTestClass() {
                return true;
            }
        };
    }

    @Test
    public void testSuccessCreature()
            throws DefenceOutOfBoundsExceptions, AttackOutOfBoundsExceptions, HealthOutOfBoundsExceptions, DamageMaxMinException, DamageUnderZeroException {
        Creature test = new Creature("test", 10, 10, 10, 10, 10) {
            public boolean isTestClass() {
                return true;
            }
        };
        assertTrue(test.isTestClass());
    }

}