package example.entities;

import cpw.mods.fml.common.registry.EntityRegistry;
import example.StevesExample;

/**
 * Created with IntelliJ IDEA.
 * User: ron.douglas
 * Date: 9/17/13
 * Time: 10:25 AM
 */
public class Entities {

    public static void init() {
        EntityRegistry.registerModEntity(EntitySpaceship.class, "EntitySpaceship", 0, StevesExample.instance, 80, 3, true);
        EntityRegistry.registerModEntity(EntityBomb.class, "EntityBomb", 1, StevesExample.instance, 80, 3, false);
    }
}
