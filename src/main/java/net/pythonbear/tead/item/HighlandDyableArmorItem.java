package net.pythonbear.tead.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.DyeableItem;

public class HighlandDyableArmorItem extends DyeableArmorItem implements DyeableItem {
    public HighlandDyableArmorItem(ArmorMaterial material, EquipmentSlot type, Settings settings) {
        super(material, type, settings);
    }
}
