package net.lettuce.adequateadditions.core;

import com.mojang.logging.LogUtils;
import net.lettuce.adequateadditions.registry.ModBlocks;
import net.lettuce.adequateadditions.registry.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(AdequateAdditions.MOD_ID)
public class AdequateAdditions {
    public static final String MOD_ID = "adequate_additions";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AdequateAdditions() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::addCreative);

        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, ModConfig.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModItems.ROSE_GOLD_BLOCK);
            event.getEntries().putAfter(Items.LIGHT_WEIGHTED_PRESSURE_PLATE.getDefaultInstance(), ModItems.ROSE_GOLD_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.ROSE_GOLD_BEETROOT);

            event.getEntries().putAfter(Items.BEETROOT.getDefaultInstance(), ModItems.ROSE_GOLD_BEETROOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.ROSE_GOLD_SHOVEl);
            event.accept(ModItems.ROSE_GOLD_PICKAXE);
            event.accept(ModItems.ROSE_GOLD_AXE);
            event.accept(ModItems.ROSE_GOLD_HOE);
            event.getEntries().putAfter(Items.GOLDEN_HOE.getDefaultInstance(), ModItems.ROSE_GOLD_SHOVEl.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_SHOVEl.get().getDefaultInstance(), ModItems.ROSE_GOLD_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_PICKAXE.get().getDefaultInstance(), ModItems.ROSE_GOLD_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_AXE.get().getDefaultInstance(), ModItems.ROSE_GOLD_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);


        }

        if(event.getTabKey() == CreativeModeTabs.COMBAT) {

            event.accept(ModItems.ROSE_GOLD_SWORD);
            event.accept(ModItems.ROSE_GOLD_AXE);
            event.accept(ModItems.ROSE_GOLD_HELMET);
            event.accept(ModItems.ROSE_GOLD_CHESTPLATE);
            event.accept(ModItems.ROSE_GOLD_LEGGINGS);
            event.accept(ModItems.ROSE_GOLD_BOOTS);


            event.getEntries().putAfter(Items.GOLDEN_SWORD.getDefaultInstance(), ModItems.ROSE_GOLD_SWORD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLDEN_AXE.getDefaultInstance(), ModItems.ROSE_GOLD_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.GOLDEN_BOOTS.getDefaultInstance(), ModItems.ROSE_GOLD_HELMET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_HELMET.get().getDefaultInstance(), ModItems.ROSE_GOLD_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_CHESTPLATE.get().getDefaultInstance(), ModItems.ROSE_GOLD_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_LEGGINGS.get().getDefaultInstance(), ModItems.ROSE_GOLD_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

            if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ROSE_GOLD_INGOT);
            event.accept(ModItems.ROSE_GOLD_NUGGET);
            event.accept(ModItems.ROSE_POWDER);

            event.getEntries().putAfter(Items.GOLD_INGOT.getDefaultInstance(), ModItems.ROSE_GOLD_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLD_NUGGET.getDefaultInstance(), ModItems.ROSE_GOLD_NUGGET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.BLAZE_POWDER.getDefaultInstance(), ModItems.ROSE_POWDER.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }
    }
    @SubscribeEvent
    public void onServerStarting (ServerStartingEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
