package net.pythonbear.tead.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.DyeableItem;

public class PlateArmorItem extends DyeableArmorItem implements DyeableItem {
    public PlateArmorItem(ArmorMaterial armorMaterial, EquipmentSlot type, Settings settings) {
        super(armorMaterial, type, settings);
    }
}
