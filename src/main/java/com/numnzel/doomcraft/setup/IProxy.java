package com.numnzel.doomcraft.setup;

import net.minecraft.world.World;

public interface IProxy {

	void init();
	
	World getClientWorld();
}
