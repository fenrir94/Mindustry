package io.anuke.mindustry.entities.weapon;

import io.anuke.mindustry.content.Bullets;
import io.anuke.mindustry.content.Fx;
import io.anuke.mindustry.type.Weapon;

public class Swarmer extends Weapon {
    public Swarmer(String name){
        super(name);
        length = 1.5f;
        recoil = 4f;
        reload = 45f;
        shots = 4;
        spacing = 8f;
        inaccuracy = 8f;
        roundrobin = true;
        ejectEffect = Fx.none;
        shake = 3f;
        bullet = Bullets.missileSwarm;
    }
}
