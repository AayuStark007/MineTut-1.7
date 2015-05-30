package com.aayustark007.minetut7.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.aayustark007.minetut7.help.Reference;
import com.aayustark007.minetut7.init.ModArmory;
import com.aayustark007.minetut7.tabs.ModTabs;

public class ItemTitaniumArmor extends ItemArmor{
	
	public ItemTitaniumArmor(ArmorMaterial material, int ArmorType, String name)
	{
		super(material, 0, ArmorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabMineTut);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ModArmory.titaniumHelmet || stack.getItem() == ModArmory.titaniumChestplate || stack.getItem() == ModArmory.titaniumBoots)
		{
			return Reference.MODID + ":models/armor/titaniumLayer1.png";
		}
		else if(stack.getItem() == ModArmory.titaniumLeggings)
		{
			return Reference.MODID + ":models/armor/titaniumLayer2.png";
		}
		else
		{
			return null;
		}
	}

}
