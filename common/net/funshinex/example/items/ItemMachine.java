package net.funshinex.example.items;

import net.minecraft.item.ItemBlock;

/**
 * Created with IntelliJ IDEA.
 * User: ron.douglas
 * Date: 9/16/13
 * Time: 12:48 AM
 */
public class ItemMachine extends ItemBlock {
    public ItemMachine(int id) {
        super(id);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int dmg) {
        return dmg;
    }
}
