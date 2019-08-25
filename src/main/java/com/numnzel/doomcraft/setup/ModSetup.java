package com.numnzel.doomcraft.setup;

import com.numnzel.doomcraft.block.DoomBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ModSetup {

	public ItemGroup itemGroup = new ItemGroup("doomcraft") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(DoomBlocks.UACMETALBLOCK);
		}
	};
	
	public void init() {
		
	}
}
