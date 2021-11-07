package com.stal111.valhelsia_structures.common.integration;

import com.stal111.valhelsia_structures.common.item.ModCreativeModeTabs;
import com.stal111.valhelsia_structures.core.ValhelsiaStructures;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaRecipeCategoryUid;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.runtime.IJeiRuntime;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nonnull;

/**
 * Valhelsia Structures JEI Plugin <br>
 * Valhelsia Structures - com.stal111.valhelsia_structures.common.integration.ValhelsiaStructuresJEIPlugin
 *
 * @author Valhelsia Team
 * @version 1.17.1-0.1.0
 * @since 2020.08.12
 */
@JeiPlugin
public class ValhelsiaStructuresJEIPlugin implements IModPlugin {

    private static final ResourceLocation ID = new ResourceLocation(ValhelsiaStructures.MOD_ID, "main");

    @Override
    @Nonnull
    public ResourceLocation getPluginUid() {
        return ID;
    }

    @Override
    public void onRuntimeAvailable(IJeiRuntime jeiRuntime) {
        jeiRuntime.getIngredientManager().removeIngredientsAtRuntime(VanillaTypes.ITEM, ModCreativeModeTabs.HIDDEN_ITEMS);
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addRecipes(AxeCraftingRecipeMaker.createAxeCraftingRecipes(), VanillaRecipeCategoryUid.CRAFTING);
    }
}