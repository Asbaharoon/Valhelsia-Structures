package com.stal111.valhelsia_structures.common.world.structures.height;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.stal111.valhelsia_structures.core.init.world.ModStructureHeightProviderTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.WorldGenerationContext;
import net.minecraft.world.level.levelgen.heightproviders.HeightProvider;
import net.minecraft.world.level.levelgen.structure.Structure;

/**
 * @author Valhelsia Team
 * @since 2022-10-28
 */
public class DefaultHeightProvider extends StructureHeightProvider {

    public static final Codec<DefaultHeightProvider> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(HeightProvider.CODEC.fieldOf("height_provider").forGetter(height -> {
            return height.heightProvider;
        })).apply(instance, DefaultHeightProvider::new);
    });

    private final HeightProvider heightProvider;

    public DefaultHeightProvider(HeightProvider provider) {
        this.heightProvider = provider;
    }

    @Override
    public int sample(BlockPos pos, Structure.GenerationContext context, Heightmap.Types heightmapType) {
        return this.heightProvider.sample(context.random(), new WorldGenerationContext(context.chunkGenerator(), context.heightAccessor()));
    }

    @Override
    public int minY(BlockPos pos, Structure.GenerationContext context, Heightmap.Types heightmapType) {
        return 0;
    }

    @Override
    public int maxY(BlockPos pos, Structure.GenerationContext context, Heightmap.Types heightmapType) {
        return 0;
    }

    @Override
    public StructureHeightProviderType<?> getType() {
        return ModStructureHeightProviderTypes.DEFAULT_HEIGHT.get();
    }
}
