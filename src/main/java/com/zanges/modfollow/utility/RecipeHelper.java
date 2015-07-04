package com.zanges.modfollow.utility;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RecipeHelper
{
    public static void addStorageRecipe(ItemStack out, ItemStack in)
    {
        GameRegistry.addRecipe(out, "iii", "iii", "iii", 'i', in);
    }

    public static void addOreStorageRecipe(ItemStack out, String in)
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(out, "iii", "iii", "iii", 'i', in));
    }
}
