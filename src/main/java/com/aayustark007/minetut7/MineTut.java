package com.aayustark007.minetut7;


import com.aayustark007.minetut7.crafting.Recipes;
import com.aayustark007.minetut7.generation.MineTutWorldGeneration;
import com.aayustark007.minetut7.help.Reference;
import com.aayustark007.minetut7.init.ModArmory;
import com.aayustark007.minetut7.init.ModBlocks;
import com.aayustark007.minetut7.init.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MineTut {
	
	MineTutWorldGeneration eventWorldGen = new MineTutWorldGeneration();
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
		ModArmory.init();
		GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);

	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		Recipes.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}


}
