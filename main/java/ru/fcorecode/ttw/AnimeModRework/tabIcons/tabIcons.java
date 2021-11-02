package ru.fcorecode.ttw.AnimeModRework.tabIcons;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ru.fcorecode.ttw.AnimeModRework.Main;
import ru.fcorecode.ttw.AnimeModRework.configs.Rarity;


public class tabIcons extends Item {

    public tabIcons(String name, String texture) {
        this.setUnlocalizedName(name);
        this.setTextureName(Main.MODID + ":" + texture);
        this.maxStackSize = 0;
        this.canRepair = false;
        GameRegistry.registerItem(this, name);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List itemDescription, boolean none) {
        itemDescription.add("" + Rarity._useless.rarityName);
    }

    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        return false;
    }
}
