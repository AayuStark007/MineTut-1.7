package com.github.aayustark007.MineTut.init;

import com.github.aayustark007.MineTut.help.RegisterHelper;
import com.github.aayustark007.MineTut.items.MineTutItem;

import net.minecraft.item.Item;

public class ModItems {
	
	public static Item ebonyIngot = new MineTutItem().setUnlocalizedName("ebonyIngot");
	
	public static void init()
	{
		RegisterHelper.registerItem(ebonyIngot);
	}

}
