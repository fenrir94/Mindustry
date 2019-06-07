package io.anuke.mindustry.entities.weapon;

import io.anuke.mindustry.content.Bullets;
import io.anuke.mindustry.content.Fx;
import io.anuke.mindustry.type.Weapon;

public class Missile extends Weapon {
    public Missile(String name){
        super(name);
        length = 1.5f;
        reload = 70f;
        shots = 4;
        inaccuracy = 2f;
        roundrobin = true;
        ejectEffect = Fx.none;
        velocityRnd = 0.2f;
        spacing = 1f;
        bullet = Bullets.missileJavelin;
    }
}
