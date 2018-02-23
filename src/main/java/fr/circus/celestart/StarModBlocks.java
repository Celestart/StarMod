package fr.circus.celestart;

import fr.circus.celestart.Blocks.BlocksMod;
import fr.circus.celestart.Blocks.LuminatBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class StarModBlocks {
	
	public static final Block XenoStarBlock = new BlocksMod(Material.ROCK, "XenoStarBlock");
	public static final Block EuphoriteBlock = new BlocksMod(Material.ROCK, "EuphoriteBlock");
	public static final Block AzuriteBlock = new BlocksMod(Material.ROCK, "AzuriteBlock");
	public static final Block LuminatBlock = new LuminatBlock(Material.ROCK, "LuminatBlock");
	public static final Block TitaneBlock = new BlocksMod(Material.ROCK, "TitaneBlock");
	
	public static final Block XenoStarOre = new BlocksMod(Material.ROCK, "XenoStarOre");
	public static final Block EuphoriteOre = new BlocksMod(Material.ROCK, "EuphoriteOre");
	public static final Block AzuriteOre = new BlocksMod(Material.ROCK, "AzuriteOre");
	public static final Block LuminatOre = new LuminatBlock(Material.ROCK, "LuminatOre");
	public static final Block TitaneOre = new BlocksMod(Material.ROCK, "TitaneOre");
	
	public static void setBlockName(Block block, String name) {
		
		block.setRegistryName(Reference.MOD_ID, name).setUnlocalizedName(name);

	}

}
