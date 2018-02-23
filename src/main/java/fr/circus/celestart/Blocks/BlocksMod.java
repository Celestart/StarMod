package fr.circus.celestart.Blocks;

import fr.circus.celestart.StarMod;
import fr.circus.celestart.StarModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlocksMod extends Block {	
	
	public BlocksMod(Material materialIn, String NAME) {
		super(materialIn);
		
		StarModBlocks.setBlockName(this, NAME);
		setResistance(5.0F);
		setHardness(3.0F);
		setCreativeTab(StarMod.TabStarMod);

	}

}
