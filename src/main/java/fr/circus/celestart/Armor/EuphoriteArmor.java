package fr.circus.celestart.Armor;

import fr.circus.celestart.Reference;
import fr.circus.celestart.StarModItems;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class EuphoriteArmor extends ItemArmor {
	
	public static final ArmorMaterial EuphoriteArmorMaterial = EnumHelper.addArmorMaterial("EuphoriteArmorMaterial", Reference.MOD_ID + ":EuphoriteArmor", 313, new int[]{3, 6, 5, 3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	public EuphoriteArmor(EntityEquipmentSlot equipmentSlotIn) {
		super(EuphoriteArmorMaterial, 0, equipmentSlotIn);
	}

}
