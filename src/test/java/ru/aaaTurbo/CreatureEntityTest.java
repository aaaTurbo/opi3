package ru.aaaTurbo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ru.aaaTurbo.entities.abstracts.Creature;

import ru.aaaTurbo.exceptions.AttackOutOfBoundsExceptions;
import ru.aaaTurbo.exceptions.DamageMaxMinException;
import ru.aaaTurbo.exceptions.DamageUnderZeroException;
import ru.aaaTurbo.exceptions.DefenceOutOfBoundsExceptions;
import ru.aaaTurbo.exceptions.HealthOutOfBoundsExceptions;

public class CreatureEntityTest {

    @Test
    public void testAttackOutOfBoundsExceptionU30() {
        AttackOutOfBoundsExceptions thrown = assertThrows(
                AttackOutOfBoundsExceptions.class,
                () -> {
                    new Creature("test", 10, 31, 10, 10, 10) {
                        public boolean isTestClass() {
                            return true;
                        }
                    };
                },
                "Expected Creature to throw AttackOutOfBoundsExceptions, but it didn't...");
    }

    @Test()
    public void testAttackOutOfBoundsExceptionU1() {
        AttackOutOfBoundsExceptions thrown = assertThrows(
                AttackOutOfBoundsExceptions.class,
                () -> {
                    new Creature("test", 10, 0, 10, 10, 10) {
                        public boolean isTestClass() {
                            return true;
                        }
                    };
                },
                "Expected Creature to throw AttackOutOfBoundsExceptions, but it didn't...");
    }

    @Test
    public void testDamageUnderZeroException() {
        DamageUnderZeroException thrown = assertThrows(
                DamageUnderZeroException.class,
                () -> {
                    new Creature("test", 10, 10, 10, 10, -1) {
                        public boolean isTestClass() {
                            return true;
                        }
                    };
                },
                "Expected Creature to throw DamageUnderZeroException, but it didn't...");
    }

    @Test()
    public void testDamageMaxMinException() {
        DamageMaxMinException thrown = assertThrows(
                DamageMaxMinException.class,
                () -> {
                    new Creature("test", 10, 10, 10, 9, 10) {
                        public boolean isTestClass() {
                            return true;
                        }
                    };
                },
                "Expected Creature to throw DamageMaxMinException, but it didn't...");
    }

    @Test()
    public void testDefenceOutOfBoundsExceptionsU30() {
        DefenceOutOfBoundsExceptions thrown = assertThrows(
                DefenceOutOfBoundsExceptions.class,
                () -> {
                    new Creature("test", 10, 10, 31, 10, 10) {
                        public boolean isTestClass() {
                            return true;
                        }
                    };
                },
                "Expected Creature to throw DefenceOutOfBoundsExceptions, but it didn't...");

    }

    @Test
    public void testHealthOutOfBoundsExceptions() {
        HealthOutOfBoundsExceptions thrown = assertThrows(
                HealthOutOfBoundsExceptions.class,
                () -> {
                    new Creature("test", 0, 10, 10, 10, 10) {
                        public boolean isTestClass() {
                            return true;
                        }
                    };
                },
                "Expected Creature to throw HealthOutOfBoundsExceptions, but it didn't...");

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