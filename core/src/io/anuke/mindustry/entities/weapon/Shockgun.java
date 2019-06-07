package io.anuke.mindustry.entities.weapon;

import io.anuke.mindustry.content.Bullets;
import io.anuke.mindustry.content.Fx;
import io.anuke.mindustry.type.Weapon;

public class Shockgun extends Weapon {
    public Shockgun(String name){
        super(name);
        shake = 2f;
        length = 1f;
        reload = 45f;
        shotDelay = 3f;
        roundrobin = true;
        shots = 2;
        inaccuracy = 0f;
        ejectEffect = Fx.none;
        bullet = Bullets.lightning;
    }
}
