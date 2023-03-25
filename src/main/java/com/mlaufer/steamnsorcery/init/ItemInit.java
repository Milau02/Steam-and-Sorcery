package com.mlaufer.steamnsorcery.init;

import com.mlaufer.steamnsorcery.SteamNSorcery;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SteamNSorcery.MODID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
            () -> new Item(props())
    );


    private static Item.Properties props(){
        return new Item.Properties().tab(SteamNSorcery.TAB);
    }
}
