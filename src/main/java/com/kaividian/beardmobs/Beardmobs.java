package com.kaividian.beardmobs;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Beardmobs.MODID, version = Beardmobs.VERSION)


public class Beardmobs
{
	@Mod.Instance(Beardmobs.MODID)
	public static Beardmobs instance; 

	
    public static final String MODID = "beardmobs";
    public static final String VERSION = "1.0";
    
    @SidedProxy(clientSide="com.kaividian.beardmobs.ClientProxy",
            serverSide="com.kaividian.beardmobs.ServerProxy")
public static CommonProxy proxy;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
        proxy.registerRenderThings();
    }	

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
    

    
}
