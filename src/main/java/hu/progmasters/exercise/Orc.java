package hu.progmasters.exercise;

import java.util.ArrayList;
import java.util.List;

public class Orc extends Monster{

    private boolean friendly;
    List<Human> humanList;
    private List<Weapon> weaponList;

    public Orc(String name, int age, String color, boolean carnivorous, int hp) {
        super(name, age, color, carnivorous, hp);
        humanList = new ArrayList<>();
    }

    public boolean captureHuman(Human human) {
        boolean result = false;
        if (human != null) {
            this.humanList.add(human);
            result = true;
        }
        return result;
    }

    public void hurtEnemy(Monster monster, Weapon weapon) {
        if (monster != null && monster.getHp() > 0) {
            monster.setHp(monster.getHp() - weapon.getDamage());
        }
    }

    public boolean isFriendly() {
        return friendly;
    }

    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }

    public List<Human> getHumans() {
        return humanList;
    }

    public void setHumanList(List<Human> humanList) {
        this.humanList = humanList;
    }

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<Weapon> weaponList) {
        this.weaponList = weaponList;
    }
}
