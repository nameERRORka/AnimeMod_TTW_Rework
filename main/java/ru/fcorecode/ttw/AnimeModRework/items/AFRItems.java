package ru.fcorecode.ttw.AnimeModRework.items;

import net.minecraft.item.Item;

public final class AFRItems {
	public static Item _goldenCoin;
	public static Item _silverCoin;
	public static Item _cooperCoin;
	public static Item _DaemonicShatter;
	public static Item _BloodyBone;
	public static Item _GoldenLighter;
	public static Item _WoodLighter;
	public static Item _SteamLighter;
	public static Item _OldHearth;
	public static Item _PotionGreatHeal;
	public static Item _PotionGreatPoison;
	public static Item _ScrollSomeone;
	public static Item _ScrollSomeoneOpen;
	

	public static void init() {

		/*_goldenCoin = new Money("GoldenCoin", "items/_goldenCoin", 64);
		GameRegistry.registerItem(_goldenCoin, "GoldenCoin");*/
		
	}
}

//public class AFRItems extends Item
//{
//
//	boolean mode = false;
//
//	public AFRItems(String name, String texture, int maxStackSize)
//	{
//		this.canRepair = false;
//		this.setUnlocalizedName(name);
//		this.setTextureName(Main.MODID + ":" + texture);
//		this.setCreativeTab(ConfigInfo.tabAFRebornAnother);
//		GameRegistry.registerItem(this, name);
//	}
//
//	@SideOnly(Side.CLIENT)
//	public void addInformation(ItemStack stack, EntityPlayer player, List itemDescription, boolean none)
//	{
//		itemDescription.add("" + Rarity._useless.rarityName);
//	}
//
//	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
//	{
//		return false;
//	}
//
//	@Subscribe
//	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
//	{/*
//		    if(player.inventory.hasItem(Main._basepickaxe)) {
//		    	player.addChatMessage(new ChatComponentText("Р‘Р•Р“Р� РЎРЈРљРђ!"));
//		    }else if(player.inventory.hasItem(Main._IceSkana)) {
//		    	player.addChatMessage(new ChatComponentText("РќРµ Р±РµРіРё, СЃСѓРєР°!"));
//		    	player.addChatMessage(new ChatComponentText("РЈС‚РѕРјР»РµРЅРёРµ"));
//
//		    }
//		    */
//		return stack;}
//
//	public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer player, EntityLivingBase Entity)
//	{
//		return false;
//	}
//
//	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5)
//	{
//
//	}
//
//	public void onCreated(ItemStack stack, World world, EntityPlayer player)
//	{
//			/*if (world.isRemote)
//			 * {
//			player.addChatMessage(new ChatComponentText("пїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ!"));
//			}*/
//	}
//
//	public EnumRarity getRarity(ItemStack stack)
//	{
//		return Rarity._useless;
//	}
//}


/*
----------------------------------
        fly
----------------------------------
if (world.isRemote) {

if (!mode) {
	player.addChatMessage(new ChatComponentText("fly on"));
	player.capabilities.allowFlying = true;
	mode = true;
} else {
	player.addChatMessage(new ChatComponentText("fly off"));
	player.capabilities.allowFlying = false;
	mode = false;
}
}
itemStack.damageItem(1, player);
*/

/*
----------------------------------
        message
----------------------------------
player.addChatMessage(new ChatComponentText("пїЅ пїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅ!" + mode));
mode = !mode;
player.capabilities.disableDamage = mode;
*/

/*
----------------------------------
        potion
----------------------------------
super.onUpdate(stack, world, entity, par4, par5);
if (entity instanceof EntityPlayer) {
	EntityPlayer player = (EntityPlayer) entity;
	ItemStack equipped = player.getCurrentEquippedItem();
	if (equipped == stack) {
		player.addPotionEffect(new PotionEffect(Potion.jump.id, 2, 2, true));
		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 2, 1, true));
	}
}*/
