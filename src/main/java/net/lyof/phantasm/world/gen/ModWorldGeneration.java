package net.lyof.phantasm.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.TheEndBiomes;
import net.lyof.phantasm.config.ConfigEntries;
import net.lyof.phantasm.setup.ModTags;
import net.lyof.phantasm.world.ModPlacedFeatures;
import net.lyof.phantasm.world.biome.ModBiomes;
import net.minecraft.world.gen.GenerationStep;

public class ModWorldGeneration {
    public static void register() {
        generateTrees();
        generateFeatures();
        generateBiomes();
    }


    public static void generateTrees() {
        if (ConfigEntries.doPreamTrees)
            BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.DREAMING_DEN),
                    GenerationStep.Feature.VEGETAL_DECORATION,
                    ModPlacedFeatures.PREAM);

        /*if (ConfigEntries.doTallPreamTrees)
            BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.DREAMING_DEN),
                    GenerationStep.Feature.VEGETAL_DECORATION,
                    ModPlacedFeatures.TALL_PREAM);*/

        /*BiomeModifications.addCarver(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Carver.AIR,
                );*/
    }

    public static void generateFeatures() {
        if (ConfigEntries.doCrystalSpikes)
            BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.DREAMING_DEN),
                    GenerationStep.Feature.VEGETAL_DECORATION,
                    ModPlacedFeatures.CRYSTAL_SPIKE);

        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.DREAMING_DEN),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.VIVID_NIHILIUM_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.DREAMING_DEN),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.TALL_VIVID_NIHILIUM_PATCH);

        if (ConfigEntries.doFallenStars)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                    GenerationStep.Feature.SURFACE_STRUCTURES,
                    ModPlacedFeatures.FALLEN_STAR);
    }

    public static void generateBiomes() {
        if (ConfigEntries.doDreamingDenBiome)
            TheEndBiomes.addHighlandsBiome(ModBiomes.DREAMING_DEN, ConfigEntries.dreamingDenWeight);
    }
}
