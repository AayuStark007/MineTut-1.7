package com.aayustark007.minetut7.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.aayustark007.minetut7.help.Reference;
import com.aayustark007.minetut7.tabs.ModTabs;

public class BlockTitaniumOre extends Block{

	public BlockTitaniumOre() {
		
		super(Material.iron);
		setBlockName("titaniumOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabMineTut);
		setStepSound(soundTypeStone);
		setHardness(2.5F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 3);
	}
	
	

}
