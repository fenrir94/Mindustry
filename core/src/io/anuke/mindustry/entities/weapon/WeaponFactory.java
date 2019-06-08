package io.anuke.mindustry.entities.weapon;

import io.anuke.mindustry.type.Weapon;

public class WeaponFactory {
    public Weapon createWeapon(String name)
    {
        Weapon weapon = null;
        switch(name){
            case "blaster": weapon = new BlasterAlpha(name);
            case "shockgun": weapon = new ShockgunDelta(name);
            case "bomber": weapon = new BomberGlaive(name);
            case "missiles": weapon = new MissileJaveline(name);
            case "swarmer": weapon = new SwarmerOmega(name);
            case "heal-blaster": weapon = new HealBlasterTau(name);
        }
        return weapon;
    }
}
