package net.funshinex.example.blocks;

import net.funshinex.example.items.ItemMachine;
import net.funshinex.example.tileentities.TileEntityBomb;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Created with IntelliJ IDEA.
 * User: ron.douglas
 * Date: 9/15/13
 * Time: 11:27 PM
 */
public class Blocks {

    public static Block machine;
    public static Block bomb;

    public static void init() {
        machine = new BlockMachine(BlockInfo.MACHINE_ID);
        GameRegistry.registerBlock(machine, ItemMachine.class, BlockInfo.MACHINE_KEY);

        bomb = new BlockBomb(BlockInfo.BOMB_ID);
        GameRegistry.registerBlock(bomb, BlockInfo.BOMB_KEY);
    }

    public static void addNames() {
        LanguageRegistry.addName(machine,BlockInfo.MACHINE_NAME);
        LanguageRegistry.addName(bomb,BlockInfo.BOMB_NAME);
    }

    public static void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntityBomb.class, BlockInfo.BOMB_TE_KEY);
    }
}
