package com.mlaufer.steamnsorcery;

import com.mlaufer.steamnsorcery.init.BlockInit;
import com.mlaufer.steamnsorcery.init.ItemInit;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SteamNSorcery.MODID)
public class SteamNSorcery {
    public static final String MODID = "steamnsorcery";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SteamNSorcery() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);

    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return Items.CHEST.getDefaultInstance();
        }
    };
}
