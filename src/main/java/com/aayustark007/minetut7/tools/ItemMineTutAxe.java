package com.aayustark007.minetut7.tools;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;

import com.aayustark007.minetut7.help.Reference;
import com.aayustark007.minetut7.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMineTutAxe extends ItemAxe{
	
public final ToolMaterial toolMaterial;
	
	public ItemMineTutAxe(ToolMaterial EnumToolMaterial){
		super(EnumToolMaterial);
		toolMaterial = EnumToolMaterial;
		setCreativeTab(ModTabs.tabMineTut);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}

}
