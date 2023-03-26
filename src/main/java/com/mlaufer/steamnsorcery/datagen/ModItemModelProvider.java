package com.mlaufer.steamnsorcery.datagen;

import com.mlaufer.steamnsorcery.SteamNSorcery;
import com.mlaufer.steamnsorcery.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, SteamNSorcery.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //simpleItem(ModItems.EXAMPLE_ITEM);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> itemRegistryObject){
        return withExistingParent(
                itemRegistryObject.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(SteamNSorcery.MODID,"item/"+ itemRegistryObject.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> itemRegistryObject){
        return withExistingParent(
                itemRegistryObject.getId().getPath(), new ResourceLocation("item/handheld"))
                .texture("layer0", new ResourceLocation(SteamNSorcery.MODID,"item/"+ itemRegistryObject.getId().getPath()));
    }

}
