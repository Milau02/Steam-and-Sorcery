package com.mlaufer.steamnsorcery.datagen;

import com.mlaufer.steamnsorcery.SteamNSorcery;
import com.mlaufer.steamnsorcery.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, SteamNSorcery.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //simpleBlockWithItem(ModBlocks.EXAMPLE_BLOCK);
    }


    private void simpleBlockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlock(blockRegistryObject.get(),cubeAll(blockRegistryObject.get()));
        simpleBlockItem(blockRegistryObject.get(),cubeAll(blockRegistryObject.get()));
    }
}
