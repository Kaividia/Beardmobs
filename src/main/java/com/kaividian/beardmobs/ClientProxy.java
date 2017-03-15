package com.kaividian.beardmobs;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderBat;
import net.minecraft.client.renderer.entity.RenderEnderman;

import com.kaividian.beardmobs.client.renderer.RenderSpit;
import com.kaividian.beardmobs.client.renderer.RenderVesper;
import com.kaividian.beardmobs.entity.EntitySpit;
import com.kaividian.beardmobs.entity.creature.EntityVesper;
import com.kaividian.beardmobs.entity.projectile.ProjectileSpit;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

	@Override
	public void init(){
		super.init();
		registerRenderThings();
		
	}
	
	public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityVesper.class, new RenderVesper());

		RenderingRegistry.registerEntityRenderingHandler(ProjectileSpit.class, 
			      new RenderSpit());
		RenderingRegistry.registerEntityRenderingHandler(EntitySpit.class, 
			      new RenderSpit());
	
	}
	
	
	
}
