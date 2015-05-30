package com.aayustark007.minetut7.init;

import com.aayustark007.minetut7.help.RegisterHelper;
import com.aayustark007.minetut7.items.ItemEbonyIngot;

import net.minecraft.item.Item;

public class ModItems {
	
	public static Item ebonyIngot = new ItemEbonyIngot().setUnlocalizedName("ebonyIngot");
	
	public static void init()
	{
		RegisterHelper.registerItem(ebonyIngot);
	}

}
