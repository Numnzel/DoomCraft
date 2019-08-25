package com.numnzel.doomcraft;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.numnzel.doomcraft.block.DoomBlocks;
import com.numnzel.doomcraft.block.UacMetalBlock;
import com.numnzel.doomcraft.setup.ClientProxy;
import com.numnzel.doomcraft.setup.IProxy;
import com.numnzel.doomcraft.setup.ServerProxy;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("doomcraft")
public class DoomCraft {

	public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

	private static final Logger LOGGER = LogManager.getLogger();
	
	public DoomCraft() {
		// Register the setup method for modLoading
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
	}
	
	// You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
	// Event bus for receiving Registry Events)
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
			event.getRegistry().register(new UacMetalBlock());
		}
		
		@SubscribeEvent
		public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
			event.getRegistry().register(new BlockItem(DoomBlocks.UACMETALBLOCK, new Item.Properties()).setRegistryName("uacmetalblock"));
		}
	}
}
