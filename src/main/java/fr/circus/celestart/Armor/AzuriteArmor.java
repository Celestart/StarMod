package fr.circus.celestart.Armor;

import fr.circus.celestart.Reference;
import fr.circus.celestart.StarModItems;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class AzuriteArmor extends ItemArmor {
	
	public static final ArmorMaterial AzuriteArmorMaterial = EnumHelper.addArmorMaterial("AzuriteArmorMaterial", Reference.MOD_ID + ":AzuriteArmor", 188, new int[]{3, 5, 4, 3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	public AzuriteArmor(EntityEquipmentSlot equipmentSlotIn) {
		super(AzuriteArmorMaterial, 0, equipmentSlotIn);
	}

}
