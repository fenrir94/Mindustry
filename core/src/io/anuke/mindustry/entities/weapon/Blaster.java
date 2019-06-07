package io.anuke.mindustry.entities.weapon;

import io.anuke.mindustry.content.Bullets;
import io.anuke.mindustry.content.Fx;
import io.anuke.mindustry.type.Weapon;

public class Blaster extends Weapon {
    public Blaster(String name){
        super(name);
        length = 1.5f;
        reload = 14f;
        roundrobin = true;
        ejectEffect = Fx.shellEjectSmall;
        bullet = Bullets.standardMechSmall;
    }
}
