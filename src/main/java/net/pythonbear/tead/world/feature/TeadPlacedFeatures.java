package net.pythonbear.tead.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class TeadPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> RUBY_ORE_PLACED = PlacedFeatures.register("ruby_ore_placed",
            TeadConfiguredFeatures.RUBY_ORE, modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(232))));
    public static final RegistryEntry<PlacedFeature> DEEPSLATE_RUBY_ORE_PLACED = PlacedFeatures.register(
            "deepslate_ruby_ore_placed", TeadConfiguredFeatures.DEEPSLATE_RUBY_ORE, modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(0))));
    public static final RegistryEntry<PlacedFeature> LEAD_ORE_PLACED = PlacedFeatures.register("lead_ore_placed",
            TeadConfiguredFeatures.LEAD_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(64))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier,
                                                     PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
