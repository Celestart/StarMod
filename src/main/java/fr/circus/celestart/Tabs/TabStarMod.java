package fr.circus.celestart.Tabs;

import fr.circus.celestart.StarModItems;

/*import fr.circus.celestart.StarModItems;*/

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TabStarMod extends CreativeTabs {

	public TabStarMod(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(StarModItems.EuphoriteIngot);
	}

}
