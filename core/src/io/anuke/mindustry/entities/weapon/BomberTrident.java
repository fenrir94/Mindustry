package io.anuke.mindustry.entities.weapon;

import io.anuke.mindustry.content.Fx;
import io.anuke.mindustry.entities.bullet.BombBulletType;
import io.anuke.mindustry.type.Weapon;

public class BomberTrident extends Weapon {
    public BomberTrident(String name){
        super(name);
        length = 0f;
        width = 2f;
        reload = 25f;
        shots = 2;
        shotDelay = 1f;
        shots = 8;
        roundrobin = true;
        ejectEffect = Fx.none;
        velocityRnd = 1f;
        inaccuracy = 20f;
        ignoreRotation = true;
        bullet = new BombBulletType(16f, 25f, "shell"){{
            bulletWidth = 10f;
            bulletHeight = 14f;
            hitEffect = Fx.flakExplosion;
            shootEffect = Fx.none;
            smokeEffect = Fx.none;
        }};
    }
}
