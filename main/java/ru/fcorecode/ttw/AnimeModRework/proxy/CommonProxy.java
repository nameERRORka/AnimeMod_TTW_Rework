package ru.fcorecode.ttw.AnimeModRework.proxy;

//import ru.fcorecode.arcanereborn.items.tools. //load items registry class
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ru.fcorecode.ttw.AnimeModRework.items.AFRItems;


public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        AFRItems.init();
    }

    public void init(FMLInitializationEvent e) {
    	
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
