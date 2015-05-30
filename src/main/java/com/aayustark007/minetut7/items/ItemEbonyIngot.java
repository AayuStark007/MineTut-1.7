package com.aayustark007.minetut7.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import com.aayustark007.minetut7.help.Reference;
import com.aayustark007.minetut7.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEbonyIngot extends Item{
	
	public ItemEbonyIngot(){
		super();
		setCreativeTab(ModTabs.tabMineTut);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}

}
