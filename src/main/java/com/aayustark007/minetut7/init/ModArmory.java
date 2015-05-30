package com.aayustark007.minetut7.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.aayustark007.minetut7.armor.ItemTitaniumArmor;
import com.aayustark007.minetut7.help.RegisterHelper;
import com.aayustark007.minetut7.tools.ItemMineTutPickaxe;
import com.aayustark007.minetut7.tools.ItemMineTutShovel;
import com.aayustark007.minetut7.tools.ItemMineTutSword;

public class ModArmory {
	
	//Materials
	
	static Item.ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 3, 1024, 10.5F, 4.0F, 14);
	static ArmorMaterial ATITANIUM = EnumHelper.addArmorMaterial("ATITANIUM", 35, new int[]{3, 7, 5, 2}, 14);
	
	//Tools
	
	public static Item titaniumSword = new ItemMineTutSword(TITANIUM).setUnlocalizedName("titaniumSword");
	public static Item titaniumPick = new ItemMineTutPickaxe(TITANIUM).setUnlocalizedName("titaniumPick");
	public static Item titaniumShovel = new ItemMineTutShovel(TITANIUM).setUnlocalizedName("titaniumShovel");
	public static Item titaniumAxe = new ItemMineTutSword(TITANIUM).setUnlocalizedName("titaniumAxe");
	
	//Armor
	
	public static Item titaniumHelmet = new ItemTitaniumArmor(ATITANIUM, 0, "titaniumHelmet");
	public static Item titaniumChestplate = new ItemTitaniumArmor(ATITANIUM, 1, "titaniumChestplate");
	public static Item titaniumLeggings = new ItemTitaniumArmor(ATITANIUM, 2, "titaniumLeggings");
	public static Item titaniumBoots = new ItemTitaniumArmor(ATITANIUM, 3, "titaniumBoots");
	
	public static void init(){
		
		RegisterHelper.registerItem(titaniumSword);
		RegisterHelper.registerItem(titaniumPick);
		RegisterHelper.registerItem(titaniumAxe);
		RegisterHelper.registerItem(titaniumShovel);
		
		RegisterHelper.registerItem(titaniumHelmet);
		RegisterHelper.registerItem(titaniumChestplate);
		RegisterHelper.registerItem(titaniumLeggings);
		RegisterHelper.registerItem(titaniumBoots);
	}
	

}
