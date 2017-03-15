package com.kaividian.beardmobs;

import net.minecraftforge.common.MinecraftForge;

import com.kaividian.beardmobs.entity.EntitySpit;
import com.kaividian.beardmobs.entity.creature.EntityVesper;
import com.kaividian.beardmobs.entity.projectile.ProjectileSpit;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.EntityRegistry;

public class CommonProxy {

	public void registerRenderThings(){
		
	}
	
	public void preInit() {
	
		EntityRegistry.registerModEntity(EntitySpit.class, "entityspit", 1, Beardmobs.instance, 64, 1, true);
		EntityRegistry.registerModEntity(ProjectileSpit.class, "projectilespit", 2, Beardmobs.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityVesper.class, "vesper", 3, Beardmobs.instance, 64, 1, true);

		//System.out.println("REGISTERERED");
	}

	public void init() {
		MinecraftForge.EVENT_BUS.register(new EventHandlerCommon());
		EventHandlerCommon handler = new EventHandlerCommon();
		MinecraftForge.EVENT_BUS.register(handler);
		FMLCommonHandler.instance().bus().register(handler);
	}

	public void postInit() {
		
	}
	
	

}
