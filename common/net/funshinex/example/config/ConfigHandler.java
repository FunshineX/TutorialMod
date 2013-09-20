package net.funshinex.example.config;

import java.io.File;

import net.funshinex.example.blocks.BlockInfo;
import net.funshinex.example.items.ItemInfo;
import net.minecraftforge.common.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: ron.douglas
 * Date: 9/15/13
 * Time: 5:00 PM
 */
public class ConfigHandler {

    public static void init(File file) {
        Configuration config = new Configuration(file);
        config.load();

        BlockInfo.MACHINE_ID = config.getBlock(BlockInfo.MACHINE_KEY, BlockInfo.MACHINE_DEFAULT).getInt();
        BlockInfo.BOMB_ID = config.getBlock(BlockInfo.BOMB_KEY, BlockInfo.BOMB_DEFAULT).getInt();

        ItemInfo.WAND_ID = config.getItem(ItemInfo.WAND_KEY, ItemInfo.WAND_DEFAULT).getInt() - 256;
        ItemInfo.CARD_ID = config.getItem(ItemInfo.CARD_KEY, ItemInfo.CARD_DEFAULT).getInt() - 256;

        config.save();
    }
}
