package kg.geektech.game.players;

public class Golem extends Hero{
    int damageToHeroes;
    int damageToGolem;



    public Golem(int health, int damage, String name,int damageToHeroes) {
        super(health, damage, name, SuperAbility.DEFENDER);
        this.damageToHeroes=damageToHeroes;

    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {

            if (heroes[i].getHealth() > 0){
                heroes[i].setHealth(heroes[i].getHealth()+(boss.getDamage()/damageToHeroes));
                    setHealth(getHealth()-(boss.getDamage()/damageToHeroes)*heroes.length);
                }
            }

        }
    }
