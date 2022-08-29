package hu.progmasters.exercise;

import java.util.List;

public class UrukHai extends Orc{

    public UrukHai(String name, int age, String color, boolean carnivorous, int hp) {
        super(name, age, color, carnivorous, hp);
        this.setFriendly(false);
    }

    public boolean inNominePatris(Human human) {
        boolean result = false;
        if (human != null && humanList.contains(human)) {
            humanList.remove(human);
            result = true;
        }
        return result;
    }

}
