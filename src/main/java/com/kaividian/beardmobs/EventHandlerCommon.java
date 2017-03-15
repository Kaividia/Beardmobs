package com.kaividian.beardmobs;

import com.kaividian.beardmobs.entity.EntitySpit;
import com.kaividian.beardmobs.entity.creature.EntityVesper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.BlockTorch;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;

public class EventHandlerCommon {

	@SubscribeEvent
	public void slimeClick(PlayerInteractEvent e){
	//	System.out.println("PING!");
		if(!e.entity.worldObj.isRemote && e.entityPlayer.inventory.getCurrentItem() != null && e.entityPlayer.inventory.getCurrentItem().getItem() == Items.slime_ball){
			EntityVesper entity = new EntityVesper(e.entity.worldObj, 0, null);
	        entity.setLocationAndAngles(e.entityPlayer.posX, e.entityPlayer.posY, e.entityPlayer.posZ, 0F, 0.0F);
	        e.entity.worldObj.spawnEntityInWorld(entity);
		}
	}
	@SubscribeEvent
	public void ignition(PlaceEvent e){
		if(!e.world.isRemote&& e.block instanceof BlockTorch)
		{e.world.createExplosion(e.player, e.x, e.y, e.z, 2, true);}		
	} 	
	
}
