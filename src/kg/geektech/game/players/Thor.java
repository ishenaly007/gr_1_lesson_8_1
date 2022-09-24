package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero {

    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STUN);

    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean stunChance = RPG_Game.random.nextBoolean();
        if (stunChance) {
            boss.setDamage(0);
            System.out.println("Boss stun------------------------------------");
        } else {
            boss.setDamage(50);
        }
        }
    }
