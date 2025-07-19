
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.quantica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.quantica.block.UnfiredCrucibleBlock;
import net.mcreator.quantica.block.CrucibleBlock;
import net.mcreator.quantica.QuanticaMod;

public class QuanticaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, QuanticaMod.MODID);
	public static final RegistryObject<Block> CRUCIBLE = REGISTRY.register("crucible", () -> new CrucibleBlock());
	public static final RegistryObject<Block> UNFIRED_CRUCIBLE = REGISTRY.register("unfired_crucible", () -> new UnfiredCrucibleBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
