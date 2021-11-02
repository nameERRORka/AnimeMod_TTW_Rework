package ru.fcorecode.ttw.AnimeModRework;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ru.fcorecode.ttw.AnimeModRework.proxy.CommonProxy;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, dependencies = "required-after:IC2;")

public class Main {

    public static final String MODID = "animemod_rew";
    public static final String MODNAME = "TikTokWorld | AnimeMod | Rework";
    public static final String VERSION = "1.1.10";
    
    @Instance
    public static Main instance = new Main();

    @SidedProxy(clientSide = "ru.fcorecode.ttw.AnimeModRework.proxy.ClientProxy", serverSide = "ru.fcorecode.ttw.AnimeModRework.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}