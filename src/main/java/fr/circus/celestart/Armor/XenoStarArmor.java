package fr.circus.celestart.Armor;

import fr.circus.celestart.Reference;
import fr.circus.celestart.StarModItems;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class XenoStarArmor extends ItemArmor {
	
	public static final ArmorMaterial XenoStarArmorMaterial = EnumHelper.addArmorMaterial("XenoStarArmorMaterial", Reference.MOD_ID + ":XenoStarArmor", 469, new int[]{4, 7, 6, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	public XenoStarArmor(EntityEquipmentSlot equipmentSlotIn) {
		super(XenoStarArmorMaterial, 0, equipmentSlotIn);
	}

}
