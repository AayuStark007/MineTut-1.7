package com.aayustark007.minetut7.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.aayustark007.minetut7.init.ModBlocks;
import com.aayustark007.minetut7.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void init()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ebonyIngot), new Object[] {"ABA", "ACA", "ABA", 'A', Blocks.log, 'B', Items.coal, 'C', Items.iron_ingot});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.chainmail_boots), new Object[] {new ItemStack(ModItems.ebonyIngot), Items.diamond_boots});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.chainmail_leggings), new Object[] {new ItemStack(ModItems.ebonyIngot), Items.diamond_leggings});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.chainmail_chestplate), new Object[] {new ItemStack(ModItems.ebonyIngot), Items.diamond_chestplate});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.chainmail_helmet), new Object[] {new ItemStack(ModItems.ebonyIngot), Items.diamond_helmet});
		GameRegistry.addSmelting(ModBlocks.titaniumOre, new ItemStack(ModItems.ebonyIngot), 0.8F);
	}

}
