package com.stal111.valhelsia_structures.core.data.server;

import com.stal111.valhelsia_structures.core.ValhelsiaStructures;
import com.stal111.valhelsia_structures.core.init.ModStructureFeatures;
import com.stal111.valhelsia_structures.utils.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.ConfiguredStructureTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

/**
 * Mod Structure Tags Provider <br>
 * Valhelsia Structures - com.stal111.valhelsia_structures.core.data.data.ModStructureTagsProvider
 *
 * @author Valhelsia Team
 * @version 1.18.2 - 0.1.0
 * @since 2022-03-20
 */
public class ModStructureTagsProvider extends ConfiguredStructureTagsProvider {

    public ModStructureTagsProvider(DataGenerator dataGenerator, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, ValhelsiaStructures.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(ModTags.ConfiguredStructures.ON_SPAWNER_DUNGEON_EXPLORER_MAPS).add(ModStructureFeatures.SPAWNER_DUNGEON.value());
        this.tag(ModTags.ConfiguredStructures.ON_CASTLE_EXPLORER_MAPS).add(ModStructureFeatures.CASTLE.value());
    }
}
