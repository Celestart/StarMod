package fr.circus.celestart.Armor;

import fr.circus.celestart.Reference;
import fr.circus.celestart.StarModItems;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class LuminatArmor extends ItemArmor {
	
	public static final ArmorMaterial LuminatArmorMaterial = EnumHelper.addArmorMaterial("LuminatArmorMaterial", Reference.MOD_ID + ":LuminatArmor", 156, new int[]{2, 5, 4, 2}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	public LuminatArmor(EntityEquipmentSlot equipmentSlotIn) {
		super(LuminatArmorMaterial, 0, equipmentSlotIn);
	}

}
