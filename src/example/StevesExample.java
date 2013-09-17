package example;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import example.blocks.Blocks;
import example.config.ConfigHandler;
import example.entities.Entities;
import example.items.Items;
import example.network.PacketHandler;
import example.proxies.CommonProxy;

/**
 * Created with IntelliJ IDEA.
 * User: ron.douglas
 * Date: 9/15/13
 * Time: 4:28 PM
 */
@Mod(modid = ModInformation.ID, name=ModInformation.NAME, version=ModInformation.VERSION)
@NetworkMod(channels = {ModInformation.CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class StevesExample {

    @Instance(ModInformation.ID)
    public static StevesExample instance;

    @SidedProxy(clientSide = "example.proxies.ClientProxy", serverSide = "example.proxies.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        Items.init();
        Blocks.init();

        proxy.initSounds();
        proxy.initRenderers();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
        Items.addNames();
        Blocks.addNames();

        Items.registerRecipes();

        Blocks.registerTileEntities();

        Entities.init();
    }

    @EventHandler
    public void modsLoaded(FMLPostInitializationEvent event) {

    }
}
