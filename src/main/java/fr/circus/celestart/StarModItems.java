package fr.circus.celestart;

import fr.circus.celestart.Armor.AzuriteArmor;
import fr.circus.celestart.Armor.EuphoriteArmor;
import fr.circus.celestart.Armor.LuminatArmor;
import fr.circus.celestart.Armor.TitaneArmor;
import fr.circus.celestart.Armor.XenoStarArmor;
import fr.circus.celestart.Items.ItemsMod;
import fr.circus.celestart.Tool.StarModAxe;
import fr.circus.celestart.Tool.StarModHammer;
import fr.circus.celestart.Tool.StarModPickaxe;
import fr.circus.celestart.Tool.StarModShovel;
import fr.circus.celestart.Tool.StarModSword;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber(value = Side.CLIENT, modid = Reference.MOD_ID)
public class StarModItems {
	
	
	//MaterialTools//
	public static ToolMaterial XenoStarToolMaterial = EnumHelper.addToolMaterial("XenoStarToolMaterial", 3, 7504, 30.0F, 12F, 50);
	public static ToolMaterial EuphoriteToolMaterial = EnumHelper.addToolMaterial("EuphoriteToolMaterial", 3, 5008, 25.0F, 10F, 50);
	public static ToolMaterial AzuriteToolMaterial = EnumHelper.addToolMaterial("AzuriteToolMaterial", 3, 3008, 20.0F, 8F, 50);
	public static ToolMaterial LuminatToolMaterial = EnumHelper.addToolMaterial("LuminatToolMaterial", 3, 1700, 15.0F, 3F, 50);
	public static ToolMaterial TitaneToolMaterial = EnumHelper.addToolMaterial("TitaneToolMaterial", 3, 2496, 20.0F, 6F, 50);
	//HammerMaterial//
	public static ToolMaterial XenoStarHammerMaterial = EnumHelper.addToolMaterial("XenoStarHammerMaterial", 3, -1, 50.0F, 8, 50);
	public static ToolMaterial EuphoriteHammerMaterial = EnumHelper.addToolMaterial("EuphoriteHammerMaterial", 3, 10000,2.0F, 8, 50);
	public static ToolMaterial AzuriteHammerMaterial = EnumHelper.addToolMaterial("AzuriteHammerMaterial", 4, 10000,2.0F, 8, 50);
	//Item//
	public static final Item XENOSTAR_INGOT= new ItemsMod("xenostar_ingot").setRegistryName("xenostar_ingot").setUnlocalizedName("xenostar_ingot");
	public static final Item EuphoriteIngot = new ItemsMod("EuphoriteIngot").setRegistryName("EuphoriteIngot").setUnlocalizedName("EuphoriteIngot");
	public static final Item AzuriteFragment = new ItemsMod("AzuriteFragment").setRegistryName("AzuriteFragment").setUnlocalizedName("AzuriteFragment");
	public static final Item LuminatFragment = new ItemsMod("LuminatFragment").setRegistryName("LuminatFragment").setUnlocalizedName("LuminatFragment");
	public static final Item TitaneIngot = new ItemsMod("TitaneIngot").setRegistryName("TitaneIngot").setUnlocalizedName("TitaneIngot");
	//XenoStarArmor//
	public static final Item XENOSTAR_HELMET = new XenoStarArmor(EntityEquipmentSlot.HEAD).setRegistryName("xenostar_helmet").setUnlocalizedName("xenostar_helmet").setCreativeTab(StarMod.TabStarMod);
	public static final Item XenoStarChestPlate = new XenoStarArmor(EntityEquipmentSlot.CHEST).setRegistryName("XenoStarChestPlate").setUnlocalizedName("XenoStarChestPlate").setCreativeTab(StarMod.TabStarMod);
	public static final Item XenoStarLeggings = new XenoStarArmor(EntityEquipmentSlot.LEGS).setRegistryName("XenoStarLeggings").setUnlocalizedName("XenoStarLeggings").setCreativeTab(StarMod.TabStarMod);
	public static final Item XenoStarBoots = new XenoStarArmor(EntityEquipmentSlot.FEET).setRegistryName("XenoStarBoots").setUnlocalizedName("XenoStarBoots").setCreativeTab(StarMod.TabStarMod);
	//EuphoriteArmor//
	public static final Item EuphoriteHelmet = new EuphoriteArmor(EntityEquipmentSlot.HEAD).setRegistryName("EuphoriteHelmet").setUnlocalizedName("EuphoriteHelmet").setCreativeTab(StarMod.TabStarMod);
	public static final Item EuphoriteChestPlate = new EuphoriteArmor(EntityEquipmentSlot.CHEST).setRegistryName("EuphoriteChestPlate").setUnlocalizedName("EuphoriteChestPlate").setCreativeTab(StarMod.TabStarMod);
	public static final Item EuphoriteLeggings = new EuphoriteArmor(EntityEquipmentSlot.LEGS).setRegistryName("EuphoriteLeggings").setUnlocalizedName("EuphoriteLeggings").setCreativeTab(StarMod.TabStarMod);
	public static final Item EuphoriteBoots = new EuphoriteArmor(EntityEquipmentSlot.FEET).setRegistryName("EuphoriteBoots").setUnlocalizedName("EuphoriteBoots").setCreativeTab(StarMod.TabStarMod);
	//AzuriteArmor//
	public static final Item AzuriteHelmet = new AzuriteArmor(EntityEquipmentSlot.HEAD).setRegistryName("AzuriteHelmet").setUnlocalizedName("AzuriteHelmet").setCreativeTab(StarMod.TabStarMod);
	public static final Item AzuriteChestPlate = new AzuriteArmor(EntityEquipmentSlot.CHEST).setRegistryName("AzuriteChestPlate").setUnlocalizedName("AzuriteChestPlate").setCreativeTab(StarMod.TabStarMod);
	public static final Item AzuriteLeggings = new AzuriteArmor(EntityEquipmentSlot.LEGS).setRegistryName("AzuriteLeggings").setUnlocalizedName("AzuriteLeggings").setCreativeTab(StarMod.TabStarMod);
	public static final Item AzuriteBoots = new AzuriteArmor(EntityEquipmentSlot.FEET).setRegistryName("AzuriteBoots").setUnlocalizedName("AzuriteBoots").setCreativeTab(StarMod.TabStarMod);
	//LuminatArmor//
	public static final Item LuminatHelmet = new LuminatArmor(EntityEquipmentSlot.HEAD).setRegistryName("LuminatHelmet").setUnlocalizedName("LuminatHelmet").setCreativeTab(StarMod.TabStarMod);
	public static final Item LuminatChestPlate = new LuminatArmor(EntityEquipmentSlot.CHEST).setRegistryName("LuminatChestPlate").setUnlocalizedName("LuminatChestPlate").setCreativeTab(StarMod.TabStarMod);
	public static final Item LuminatLeggings = new LuminatArmor(EntityEquipmentSlot.LEGS).setRegistryName("LuminatLeggings").setUnlocalizedName("LuminatLeggings").setCreativeTab(StarMod.TabStarMod);
	public static final Item LuminatBoots = new LuminatArmor(EntityEquipmentSlot.FEET).setRegistryName("LuminatBoots").setUnlocalizedName("LuminatBoots").setCreativeTab(StarMod.TabStarMod);
	//TitaneArmor//
	public static final Item TitaneHelmet = new TitaneArmor(EntityEquipmentSlot.HEAD).setRegistryName("TitaneHelmet").setUnlocalizedName("TitaneHelmet").setCreativeTab(StarMod.TabStarMod);
	public static final Item TitaneChestPlate = new TitaneArmor(EntityEquipmentSlot.CHEST).setRegistryName("TitaneChestPlate").setUnlocalizedName("TitaneChestPlate").setCreativeTab(StarMod.TabStarMod);
	public static final Item TitaneLeggings = new TitaneArmor(EntityEquipmentSlot.LEGS).setRegistryName("TitaneLeggings").setUnlocalizedName("TitaneLeggings").setCreativeTab(StarMod.TabStarMod);
	public static final Item TitaneBoots = new TitaneArmor(EntityEquipmentSlot.FEET).setRegistryName("TitaneBoots").setUnlocalizedName("TitaneBoots").setCreativeTab(StarMod.TabStarMod);
	//XenoStarTool//
	public static final Item XenoStarSword = new StarModSword(XenoStarToolMaterial).setRegistryName("XenoStarSword").setUnlocalizedName("XenoStarSword").setCreativeTab(StarMod.TabStarMod);
	public static final Item XenoStarPickaxe = new StarModPickaxe(XenoStarToolMaterial).setRegistryName("XenoStarPickaxe").setUnlocalizedName("XenoStarPickaxe").setCreativeTab(StarMod.TabStarMod);
	public static final Item XenoStarAxe = new StarModAxe(XenoStarToolMaterial, 30.0F, 12F).setRegistryName("XenoStarAxe").setUnlocalizedName("XenoStarAxe").setCreativeTab(StarMod.TabStarMod);
	public static final Item XenoStarShovel = new StarModShovel(XenoStarToolMaterial).setRegistryName("XenoStarShovel").setUnlocalizedName("XenoStarShovel").setCreativeTab(StarMod.TabStarMod);
	//EuphoriteTool//
	public static final Item EuphoriteSword = new StarModSword(EuphoriteToolMaterial).setRegistryName("EuphoriteSword").setUnlocalizedName("EuphoriteSword").setCreativeTab(StarMod.TabStarMod);
	public static final Item EuphoritePickaxe = new StarModPickaxe(EuphoriteToolMaterial).setRegistryName("EuphoritePickaxe").setUnlocalizedName("EuphoritePickaxe").setCreativeTab(StarMod.TabStarMod);
	public static final Item EuphoriteAxe = new StarModAxe(EuphoriteToolMaterial, 25.0F, 10F).setRegistryName("EuphoriteAxe").setUnlocalizedName("EuphoriteAxe").setCreativeTab(StarMod.TabStarMod);
	public static final Item EuphoriteShovel = new StarModShovel(EuphoriteToolMaterial).setRegistryName("EuphoriteShovel").setUnlocalizedName("EuphoriteShovel").setCreativeTab(StarMod.TabStarMod);
	//AzuriteTool//
	public static final Item AzuriteSword = new StarModSword(AzuriteToolMaterial).setRegistryName("AzuriteSword").setUnlocalizedName("AzuriteSword").setCreativeTab(StarMod.TabStarMod);
	public static final Item AzuritePickaxe = new StarModPickaxe(AzuriteToolMaterial).setRegistryName("AzuritePickaxe").setUnlocalizedName("AzuritePickaxe").setCreativeTab(StarMod.TabStarMod);
	public static final Item AzuriteAxe = new StarModAxe(AzuriteToolMaterial, 20.0F, 8F).setRegistryName("AzuriteAxe").setUnlocalizedName("AzuriteAxe").setCreativeTab(StarMod.TabStarMod);
	public static final Item AzuriteShovel = new StarModShovel(AzuriteToolMaterial).setRegistryName("AzuriteShovel").setUnlocalizedName("AzuriteShovel").setCreativeTab(StarMod.TabStarMod);
	//LuminatTool//
	public static final Item LuminatSword = new StarModSword(LuminatToolMaterial).setRegistryName("LuminatSword").setUnlocalizedName("LuminatSword").setCreativeTab(StarMod.TabStarMod);
	public static final Item LuminatPickaxe = new StarModPickaxe(LuminatToolMaterial).setRegistryName("LuminatPickaxe").setUnlocalizedName("LuminatPickaxe").setCreativeTab(StarMod.TabStarMod);
	public static final Item LuminatAxe = new StarModAxe(LuminatToolMaterial, 15.0F, 3F).setRegistryName("LuminatAxe").setUnlocalizedName("LuminatAxe").setCreativeTab(StarMod.TabStarMod);
	public static final Item LuminatShovel = new StarModShovel(LuminatToolMaterial).setRegistryName("LuminatShovel").setUnlocalizedName("LuminatShovel").setCreativeTab(StarMod.TabStarMod);
	//TitaneTool//
	public static final Item TitaneSword = new StarModSword(TitaneToolMaterial).setRegistryName("TitaneSword").setUnlocalizedName("TitaneSword").setCreativeTab(StarMod.TabStarMod);
	public static final Item TitanePickaxe = new StarModPickaxe(TitaneToolMaterial).setRegistryName("TitanePickaxe").setUnlocalizedName("TitanePickaxe").setCreativeTab(StarMod.TabStarMod);
	public static final Item TitaneAxe = new StarModAxe(TitaneToolMaterial, 20.0F, 6F).setRegistryName("TitaneAxe").setUnlocalizedName("TitaneAxe").setCreativeTab(StarMod.TabStarMod);
	public static final Item TitaneShovel = new StarModShovel(TitaneToolMaterial).setRegistryName("TitaneShovel").setUnlocalizedName("TitaneShovel").setCreativeTab(StarMod.TabStarMod);
	//BlockItem//
	public static final Item XenoStarBlockItem = new ItemBlock(StarModBlocks.XenoStarBlock).setRegistryName(StarModBlocks.XenoStarBlock.getRegistryName());
	public static final Item EuphoriteBlockItem = new ItemBlock(StarModBlocks.EuphoriteBlock).setRegistryName(StarModBlocks.EuphoriteBlock.getRegistryName());
	public static final Item AzuriteBlockItem = new ItemBlock(StarModBlocks.AzuriteBlock).setRegistryName(StarModBlocks.AzuriteBlock.getRegistryName());
	public static final Item LuminatBlockItem = new ItemBlock(StarModBlocks.LuminatBlock).setRegistryName(StarModBlocks.LuminatBlock.getRegistryName());
	public static final Item TitaneBlockItem = new ItemBlock(StarModBlocks.TitaneBlock).setRegistryName(StarModBlocks.TitaneBlock.getRegistryName());
	//OreItem//
	public static final Item XenoStarOreItem = new ItemBlock(StarModBlocks.XenoStarOre).setRegistryName(StarModBlocks.XenoStarOre.getRegistryName());
	public static final Item EuphoriteOreItem = new ItemBlock(StarModBlocks.EuphoriteOre).setRegistryName(StarModBlocks.EuphoriteOre.getRegistryName());
	public static final Item AzuriteOreItem = new ItemBlock(StarModBlocks.AzuriteOre).setRegistryName(StarModBlocks.AzuriteOre.getRegistryName());
	public static final Item LuminatOreItem = new ItemBlock(StarModBlocks.LuminatOre).setRegistryName(StarModBlocks.LuminatOre.getRegistryName());
	public static final Item TitaneOreItem = new ItemBlock(StarModBlocks.TitaneOre).setRegistryName(StarModBlocks.TitaneOre.getRegistryName());
	//Hammer//
	public static final Item XenoStarHammer = new StarModHammer(XenoStarHammerMaterial).setRegistryName("XenoStarHammer").setUnlocalizedName("XenoStarHammer").setCreativeTab(StarMod.TabStarMod);
	public static final Item EuphoriteHammer = new StarModHammer(EuphoriteHammerMaterial).setRegistryName("EuphoriteHammer").setUnlocalizedName("EuphoriteHammer").setCreativeTab(StarMod.TabStarMod);
	public static final Item AzuriteHammer = new StarModHammer(AzuriteHammerMaterial).setRegistryName("AzuriteHammer").setUnlocalizedName("AzuriteHammer").setCreativeTab(StarMod.TabStarMod);
	
	public static void setItemName(Item item, String name) {
		
		item.setRegistryName(Reference.MOD_ID, name).setUnlocalizedName(name);

	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerItemModels(ModelRegistryEvent event) {
		
		//Item//
		registerModel(XENOSTAR_INGOT, 0);
		registerModel(EuphoriteIngot, 0);
		registerModel(AzuriteFragment, 0);
		registerModel(LuminatFragment, 0);
		registerModel(TitaneIngot, 0);
		//ItemBlock//
		registerModel(XenoStarBlockItem, 0);
		registerModel(EuphoriteBlockItem, 0);
		registerModel(AzuriteBlockItem, 0);
		registerModel(LuminatBlockItem, 0);
		registerModel(TitaneBlockItem, 0);
		//ItemOre//
		registerModel(XenoStarOreItem, 0);
		registerModel(EuphoriteOreItem, 0);
		registerModel(AzuriteOreItem, 0);
		registerModel(LuminatOreItem, 0);
		registerModel(TitaneOreItem, 0);
		//XenoStarArmor//
		registerModel(XENOSTAR_HELMET, 0);
		registerModel(XenoStarChestPlate, 0);
		registerModel(XenoStarLeggings, 0);
		registerModel(XenoStarBoots, 0);
		//EuphoriteArmor//
		registerModel(EuphoriteHelmet, 0);
		registerModel(EuphoriteChestPlate, 0);
		registerModel(EuphoriteLeggings, 0);
		registerModel(EuphoriteBoots, 0);
		//AzuriteArmor//
		registerModel(AzuriteHelmet, 0);
		registerModel(AzuriteChestPlate, 0);
		registerModel(AzuriteLeggings, 0);
		registerModel(AzuriteBoots, 0);
		//LuminatArmor//
		registerModel(LuminatHelmet, 0);
		registerModel(LuminatChestPlate, 0);
		registerModel(LuminatLeggings, 0);
		registerModel(LuminatBoots, 0);
		//TitaneArmor//
		registerModel(TitaneHelmet, 0);
		registerModel(TitaneChestPlate, 0);
		registerModel(TitaneLeggings, 0);
		registerModel(TitaneBoots, 0);
		//XenoStarTool//
		registerModel(XenoStarSword, 0);
		registerModel(XenoStarPickaxe, 0);
		registerModel(XenoStarAxe, 0);
		registerModel(XenoStarShovel, 0);
		//EuphoriteTool//
		registerModel(EuphoriteSword, 0);
		registerModel(EuphoritePickaxe, 0);
		registerModel(EuphoriteAxe, 0);
		registerModel(EuphoriteShovel, 0);
		//AzuriteTool//
		registerModel(AzuriteSword, 0);
		registerModel(AzuritePickaxe, 0);
		registerModel(AzuriteAxe, 0);
		registerModel(AzuriteShovel, 0);
		//LuminatTool//
		registerModel(LuminatSword, 0);
		registerModel(LuminatPickaxe, 0);
		registerModel(LuminatAxe, 0);
		registerModel(LuminatShovel, 0);
		//TitaneTool//
		registerModel(TitaneSword, 0);
		registerModel(TitanePickaxe, 0);
		registerModel(TitaneAxe, 0);
		registerModel(TitaneShovel, 0);
		//Hammer//
		registerModel(XenoStarHammer, 0);
		registerModel(EuphoriteHammer, 0);
		registerModel(AzuriteHammer, 0);
				
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerModel(Item item, int metadata) {
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
