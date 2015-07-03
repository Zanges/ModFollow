package com.zanges.modfollow;

import com.zanges.modfollow.handler.ConfigurationHandler;
import com.zanges.modfollow.init.ModBlocks;
import com.zanges.modfollow.init.ModItems;
import com.zanges.modfollow.proxy.IProxy;
import com.zanges.modfollow.reference.Reference;
import com.zanges.modfollow.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = Reference.MOD_ID,
        name = Reference.MOD_NAME,
        version = Reference.VERSION,
        guiFactory = Reference.GUI_FACTORY_CLASS
)

public class ModFollow
{
    @Mod.Instance(Reference.MOD_ID)
    public static ModFollow instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,
                serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    // ===== PRE-INIT ======
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();

        ModBlocks.init();

        LogHelper.info("PreInit Complete!");
    }
    // =====================

    // ===== INIT ======
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Init Complete!");
    }
    // =================

    // ===== POST-INIT ======
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("PostInit Complete!");
    }
    // ======================
}
