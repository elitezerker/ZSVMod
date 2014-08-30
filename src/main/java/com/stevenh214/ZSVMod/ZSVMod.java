package com.stevenh214.ZSVMod;

import com.stevenh214.ZSVMod.proxy.IProxy;
import com.stevenh214.ZSVMod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ZSVMod
{

    @Mod.Instance("ZSVMod")
    public static ZSVMod instance;

    @SidedProxy(clientSide = "com.stevenh214.ZSVMod.proxy.ClientProxy", serverSide = "com.stevenh214.ZSVMod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
