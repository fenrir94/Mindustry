package io.anuke.mindustry.entities.weapon;

import io.anuke.mindustry.content.Bullets;
import io.anuke.mindustry.content.Fx;
import io.anuke.mindustry.type.Weapon;

public class BlasterDart extends Weapon {
    public BlasterDart(String name){
        super(name);
        length = 1.5f;
        reload = 15f;
        roundrobin = true;
        ejectEffect = Fx.shellEjectSmall;
        bullet = Bullets.standardCopper;
    }
}
