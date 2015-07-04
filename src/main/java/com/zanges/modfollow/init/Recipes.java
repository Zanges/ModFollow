package com.zanges.modfollow.init;

import com.zanges.modfollow.utility.RecipeHelper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        RecipeHelper.addOreStorageRecipe(new ItemStack(ModItems.mapleLeaf), "stickWood");
        RecipeHelper.addStorageRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf));
    }
}
