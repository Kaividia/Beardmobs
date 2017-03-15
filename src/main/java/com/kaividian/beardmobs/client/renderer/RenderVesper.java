package com.kaividian.beardmobs.client.renderer;

import assets.beardmobs.entities.models.ModelVesperQueen;

import com.kaividian.beardmobs.Beardmobs;
import com.kaividian.beardmobs.entity.creature.EntityVesper;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelEnderman;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderVesper extends RenderLiving{

    protected ResourceLocation texture;

	
	public RenderVesper() {
		super(new ModelVesperQueen(), 0);
        setEntityTexture();     
        this.shadowSize = 1f;

	}
	
	@Override
    protected void preRenderCallback(EntityLivingBase entity, float f)
    {
     //   preRenderCallbackVesper((EntityVesperQueen) entity, f);
    }
	
	protected void preRenderCallbackVesper(EntityVesper entity, float f)
    {
		//EXTRA GL11 STUFF		
		//System.out.println("Hello?");
    }
	 protected void setEntityTexture()
	    {
	        texture = new ResourceLocation(Beardmobs.MODID+":entities/textures/Vesper Queen.png");
	    }

	@Override
	protected ResourceLocation getEntityTexture(Entity e) {
		return texture;
	}

}
