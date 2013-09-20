package net.funshinex.example.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Created with IntelliJ IDEA.
 * User: ron.douglas
 * Date: 9/15/13
 * Time: 10:08 PM
 */
public class Items {

    public static Item wand;
    public static Item card;

    public static void init() {
        wand = new ItemWand(ItemInfo.WAND_ID);
        card = new ItemCard(ItemInfo.CARD_ID);
    }

    public static void addNames() {
        LanguageRegistry.addName(wand, ItemInfo.WAND_NAME);

        for (int i=0; i< ItemInfo.CARD_NAMES.length; i++) {
            LanguageRegistry.addName(new ItemStack(card, 1, i),ItemInfo.CARD_NAMES[i]);
        }
    }

    public static void registerRecipes() {
        GameRegistry.addRecipe(new ItemStack(wand),
                new Object[] {"  X",
                              " / ",
                              "/  ",

                        'X', Item.goldenCarrot,
                        '/', Item.stick
                });
    }
}
