package net.funshinex.example;

import net.funshinex.example.blocks.Blocks;
import net.funshinex.example.config.ConfigHandler;
import net.funshinex.example.entities.Entities;
import net.funshinex.example.items.Items;
import net.funshinex.example.network.PacketHandler;
import net.funshinex.example.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

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

    @SidedProxy(clientSide = "net.funshinex.example.proxies.ClientProxy", serverSide = "net.funshinex.example.proxies.CommonProxy")
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
