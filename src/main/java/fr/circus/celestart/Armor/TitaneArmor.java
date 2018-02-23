package fr.circus.celestart.Armor;

import fr.circus.celestart.Reference;
import fr.circus.celestart.StarModItems;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class TitaneArmor extends ItemArmor {
	
	public static final ArmorMaterial TitaneArmorMaterial = EnumHelper.addArmorMaterial("TitaneArmorMaterial", Reference.MOD_ID + ":TitaneArmor", 156, new int[]{2, 5, 4, 2}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	public TitaneArmor(EntityEquipmentSlot equipmentSlotIn) {
		super(TitaneArmorMaterial, 0, equipmentSlotIn);
	}

}
