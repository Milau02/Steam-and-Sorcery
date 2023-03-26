package com.mlaufer.steamnsorcery.datagen;

import com.mlaufer.steamnsorcery.init.ModBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> finishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(ModBlocks.EXAMPLE_BLOCK.get())
                .define('X', Blocks.DIRT.asItem())
                .pattern("XXX")
                .pattern("X X")
                .pattern("XXX")
                .unlockedBy("has_crafting_component",inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.DIRT.asItem()).build()))
                .save(finishedRecipeConsumer);
    }
}
