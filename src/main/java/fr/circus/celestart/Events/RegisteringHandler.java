package fr.circus.celestart.Events;

import fr.circus.celestart.StarModBlocks;
import fr.circus.celestart.StarModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegisteringHandler {
	
	@SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(StarModBlocks.XenoStarBlock, StarModBlocks.EuphoriteBlock, StarModBlocks.AzuriteBlock, StarModBlocks.LuminatBlock,
        		StarModBlocks.TitaneBlock);
        event.getRegistry().registerAll(StarModBlocks.XenoStarOre, StarModBlocks.EuphoriteOre, StarModBlocks.AzuriteOre, StarModBlocks.LuminatOre,
        		StarModBlocks.TitaneOre);
    }
	
	@SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(StarModItems.XenoStarIngot, StarModItems.EuphoriteIngot, StarModItems.AzuriteFragment, StarModItems.LuminatFragment,
        		StarModItems.TitaneIngot);
        //BlockItem//
        event.getRegistry().registerAll(StarModItems.XenoStarBlockItem, StarModItems.EuphoriteBlockItem, StarModItems.AzuriteBlockItem, StarModItems.LuminatBlockItem,
        		StarModItems.TitaneBlockItem);
        //OreItem//
        event.getRegistry().registerAll(StarModItems.XenoStarOreItem, StarModItems.EuphoriteOreItem, StarModItems.AzuriteOreItem, StarModItems.LuminatOreItem,
        		StarModItems.TitaneOreItem);
        //XenoStarArmor//
        event.getRegistry().registerAll(StarModItems.XenoStarHelmet, StarModItems.XenoStarChestPlate, StarModItems.XenoStarLeggings, StarModItems.XenoStarBoots);
        //EuphoriteArmor//
        event.getRegistry().registerAll(StarModItems.EuphoriteHelmet, StarModItems.EuphoriteChestPlate, StarModItems.EuphoriteLeggings, StarModItems.EuphoriteBoots);
        //AzuriteArmor//
        event.getRegistry().registerAll(StarModItems.AzuriteHelmet, StarModItems.AzuriteChestPlate, StarModItems.AzuriteLeggings, StarModItems.AzuriteBoots);
        //LuminatArmor//
        event.getRegistry().registerAll(StarModItems.LuminatHelmet, StarModItems.LuminatChestPlate, StarModItems.LuminatLeggings, StarModItems.LuminatBoots);
        //TitaneArmor//
        event.getRegistry().registerAll(StarModItems.TitaneHelmet, StarModItems.TitaneChestPlate, StarModItems.TitaneLeggings, StarModItems.TitaneBoots);
        //XenoStarTool//
        event.getRegistry().registerAll(StarModItems.XenoStarSword, StarModItems.XenoStarPickaxe, StarModItems.XenoStarAxe, StarModItems.XenoStarShovel);
        //EuphoriteTool//
        event.getRegistry().registerAll(StarModItems.EuphoriteSword, StarModItems.EuphoritePickaxe, StarModItems.EuphoriteAxe, StarModItems.EuphoriteShovel);
        //AzuriteTool//
        event.getRegistry().registerAll(StarModItems.AzuriteSword, StarModItems.AzuritePickaxe, StarModItems.AzuriteAxe, StarModItems.AzuriteShovel);
        //LuminatTool//
        event.getRegistry().registerAll(StarModItems.LuminatSword, StarModItems.LuminatPickaxe, StarModItems.LuminatAxe, StarModItems.LuminatShovel);
        //TitaneTool//
        event.getRegistry().registerAll(StarModItems.TitaneSword, StarModItems.TitanePickaxe, StarModItems.TitaneAxe, StarModItems.TitaneShovel);
        //Hammer//
        event.getRegistry().registerAll(StarModItems.XenoStarHammer, StarModItems.EuphoriteHammer, StarModItems.AzuriteHammer);
	}

}
