package com.stal111.valhelsia_structures.world.structures;

import com.mojang.serialization.Codec;
import com.stal111.valhelsia_structures.config.StructureConfigEntry;
import com.stal111.valhelsia_structures.init.ModStructureFeatures;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;

import java.util.Arrays;

/**
 * Castle Structure
 * Valhelsia-Structures - com.stal111.valhelsia_structures.world.structures.CastleStructure
 *
 * @author Valhelsia Team
 * @version 16.0.3
 * @since 2020-05-27
 */

public class CastleStructure extends AbstractValhelsiaStructure {

    public CastleStructure(Codec<JigsawConfiguration> villageConfigCodec) {
        super(villageConfigCodec, "castle", 3,
                new StructureConfigEntry(0.5D, 40, 8,
                        Biome.BiomeCategory.PLAINS.getName(),
                        Biome.BiomeCategory.FOREST.getName(),
                        Biome.BiomeCategory.TAIGA.getName()
                ));
    }

    @Override
    public int getSeedModifier() {
        return 16987356;
    }

    @Override
    public ConfiguredStructureFeature<JigsawConfiguration, ? extends StructureFeature<JigsawConfiguration>> getStructureFeature() {
        return ModStructureFeatures.CASTLE;
    }
}
