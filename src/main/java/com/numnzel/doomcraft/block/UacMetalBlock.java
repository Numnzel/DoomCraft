package com.numnzel.doomcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class UacMetalBlock extends Block {

	public static final String NAME = "uacmetalblock";
	private static final String REGISTRY_NAME = "uacmetalblock_block_registry";
	
	public UacMetalBlock() {
		super(
			Properties
				.create(Material.IRON)
				.hardnessAndResistance(2.0f)
				.lightValue(14)
				.sound(SoundType.METAL)
		);
		
		setRegistryName(NAME);
	}
}
