package io.anuke.mindustry.entities.weapon;

import io.anuke.mindustry.type.Mech;
import io.anuke.mindustry.type.Weapon;

public class WeaponFactory {
    public Weapon createWeapon(String name)
    {
        Weapon weapon = null;
        switch(name){
            case "blaster": weapon = new Blaster(name);
            case "shockgun": weapon = new Shockgun(name);
            case "bomber": weapon = new Bomber(name);
            case "missiles": weapon = new Missile(name);
            case "swarmer": weapon = new Swarmer(name);
            case "heal-blaster": weapon = new HealBlaster(name);
        }
        return weapon;
    }
}
