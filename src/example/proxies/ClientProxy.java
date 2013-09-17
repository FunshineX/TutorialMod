package example.proxies;

import cpw.mods.fml.client.registry.RenderingRegistry;
import example.client.RenderSpaceship;
import example.entities.EntitySpaceship;

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
