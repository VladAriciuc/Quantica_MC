
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.quantica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.quantica.block.entity.CrucibleTileEntity;
import net.mcreator.quantica.QuanticaMod;

public class QuanticaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, QuanticaMod.MODID);
	public static final RegistryObject<BlockEntityType<CrucibleTileEntity>> CRUCIBLE = REGISTRY.register("crucible", () -> BlockEntityType.Builder.of(CrucibleTileEntity::new, QuanticaModBlocks.CRUCIBLE.get()).build(null));

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
