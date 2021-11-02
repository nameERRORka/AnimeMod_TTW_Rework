package ru.fcorecode.ttw.AnimeModRework.configs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.fcorecode.ttw.AnimeModRework.tabIcons.tabIcons;

public class ConfigInfo
	{
	    public static Item _logoCreativeTabsWeaponAndArmor = new tabIcons("CreativeTabsLogoWaA", "tabIcons/_logoCreativeTabsWeaponAndArmor");
	    public static final CreativeTabs tabAFRebornWaA = new CreativeTabs("tabAFRebornWaA") {
	        @Override
	        public Item getTabIconItem() {
	            return _logoCreativeTabsWeaponAndArmor;
	        }
	    };
	}