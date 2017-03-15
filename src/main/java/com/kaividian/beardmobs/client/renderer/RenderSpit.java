package com.kaividian.beardmobs.client.renderer;

import assets.beardmobs.entities.models.ModelVesperQueen;

import com.kaividian.beardmobs.Beardmobs;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelEnderman;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderSpit extends RenderEntity{

    protected ResourceLocation texture;

	
	public RenderSpit() {
		super();
        setEntityTexture();     
        this.shadowSize = 1f;

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
