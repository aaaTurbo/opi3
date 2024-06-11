package ru.aaaTurbo;

import org.junit.Test;

import ru.aaaTurbo.entities.Fight;
import ru.aaaTurbo.entities.Monster;
import ru.aaaTurbo.entities.Player;
import ru.aaaTurbo.exceptions.AttackOutOfBoundsExceptions;
import ru.aaaTurbo.exceptions.DamageMaxMinException;
import ru.aaaTurbo.exceptions.DamageUnderZeroException;
import ru.aaaTurbo.exceptions.DefenceOutOfBoundsExceptions;
import ru.aaaTurbo.exceptions.HealthOutOfBoundsExceptions;

public class FightEntityTest {
    @Test
    public void testSuccessFight()
            throws DefenceOutOfBoundsExceptions, AttackOutOfBoundsExceptions, HealthOutOfBoundsExceptions, DamageMaxMinException, DamageUnderZeroException {
        Fight fight = new Fight(
                new Player("Knight", 20, 11, 10, 8, 4),
                new Monster("Monster", 35, 10, 9, 6, 3));
        fight.run();
    }
}
