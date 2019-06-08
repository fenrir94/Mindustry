package io.anuke.mindustry.entities.weapon;

import io.anuke.mindustry.content.Bullets;
import io.anuke.mindustry.content.Fx;
import io.anuke.mindustry.type.Weapon;

public class HealBlasterTau extends Weapon {
    public HealBlasterTau(String name){
        super(name);
        length = 1.5f;
        reload = 24f;
        roundrobin = false;
        ejectEffect = Fx.none;
        recoil = 2f;
        bullet = Bullets.healBullet;
    }
}
