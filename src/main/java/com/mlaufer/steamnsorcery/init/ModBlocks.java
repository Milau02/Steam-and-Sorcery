package com.mlaufer.steamnsorcery.init;

import com.mlaufer.steamnsorcery.SteamNSorcery;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SteamNSorcery.MODID);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = register(
            "example_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).friction(0.5f).strength(1f, 5f).requiresCorrectToolForDrops()),
            new Item.Properties().tab(SteamNSorcery.TAB)
    );

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
