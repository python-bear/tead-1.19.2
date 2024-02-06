package net.pythonbear.tead.world.feature;

import net.minecraft.util.registry.Registry;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.*;
import net.pythonbear.tead.Tead;
import net.pythonbear.tead.init.TeadBlocks;

import java.util.List;

public class TeadConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> RUBY_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    TeadBlocks.RUBY_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> DEEPSLATE_RUBY_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    TeadBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> LEAD_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    TeadBlocks.LEAD_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE =
            ConfiguredFeatures.register("ruby_ore", Feature.ORE, new OreFeatureConfig(RUBY_ORES, 4));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DEEPSLATE_RUBY_ORE =
            ConfiguredFeatures.register("deepslate_ruby_ore", Feature.ORE,
                    new OreFeatureConfig(DEEPSLATE_RUBY_ORES, 5));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> LEAD_ORE =
            ConfiguredFeatures.register("lead_ore", Feature.ORE, new OreFeatureConfig(LEAD_ORES, 10));
    public static void registerConfiguredFeatures() {
        Tead.LOGGER.debug("Registering the ModConfiguredFeatures for " + Tead.MOD_ID);
    }
}
