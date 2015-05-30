package com.aayustark007.minetut7.tabs;

import com.aayustark007.minetut7.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MineTutTab extends CreativeTabs{
	
	String name;
	
	public MineTutTab(int par1, String par2str)
	{
		super(par1, par2str);
		this.name = par2str;
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		if(this.name == "tabMineTut")
		{
			return ModItems.ebonyIngot;
		}
		return null;
	}

}
