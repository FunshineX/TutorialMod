package net.funshinex.example.proxies;

import net.funshinex.example.client.RenderSpaceship;
import net.funshinex.example.entities.EntitySpaceship;
import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Created with IntelliJ IDEA.
 * User: ron.douglas
 * Date: 9/15/13
 * Time: 4:41 PM
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void initSounds() {

    }

    @Override
    public void initRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(EntitySpaceship.class, new RenderSpaceship());
    }
}
