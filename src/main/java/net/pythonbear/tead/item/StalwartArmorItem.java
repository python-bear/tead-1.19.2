package net.pythonbear.tead.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

public class StalwartArmorItem extends ArmorItem {
    private final int protection;

    public StalwartArmorItem(ArmorMaterial material, EquipmentSlot type, Settings settings) {
        super(material, type, settings);
        this.protection = material.getProtectionAmount(type) + 1;
    }

    @Override
    public int getProtection() {
        return this.protection;
    }
}
