package com.aayustark007.minetut7.init;

import com.aayustark007.minetut7.blocks.BlockTitaniumOre;
import com.aayustark007.minetut7.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block titaniumOre = new BlockTitaniumOre();
	
	public static void init()
	{
		RegisterHelper.registerBlock(titaniumOre);
	}

}
