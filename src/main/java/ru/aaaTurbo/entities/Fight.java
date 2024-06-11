package ru.aaaTurbo.entities;

import ru.aaaTurbo.entities.abstracts.Creature;
import ru.aaaTurbo.exceptions.NoMoreHealingsException;

public class Fight {
    private Player player;
    private Monster monster;

    public Fight(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    public void run() {
        while (player.getHealth() > 0 && monster.getHealth() > 0) {
            player.attack(monster);
            if (checkDead(monster)) {
                break;
            }
            monster.attack(player);
            if (checkDead(player)) {
                break;
            }
            if (player.getHealth() < 20) {
                try {
                    System.out.println(player.getName() + " tries to heal.");
                    player.heal();
                    System.out.println(player.getName() + " healed! HP = " + player.getHealth());
                } catch (NoMoreHealingsException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        if (player.getHealth() <= 0) {
            System.out.println(monster.getName() + " wins!");
        } else {
            System.out.println(player.getName() + " wins!");
        }
    }

    private boolean checkDead(Creature creature) {
        return creature.getHealth() <= 0;
    }
}
