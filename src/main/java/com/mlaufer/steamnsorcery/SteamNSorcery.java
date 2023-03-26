package com.mlaufer.steamnsorcery;

import com.mlaufer.steamnsorcery.init.ModBlocks;
import com.mlaufer.steamnsorcery.init.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SteamNSorcery.MODID)
public class SteamNSorcery {
    public static final String MODID = "steamnsorcery";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SteamNSorcery() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);

    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return Items.CHEST.getDefaultInstance();
        }
    };
}
