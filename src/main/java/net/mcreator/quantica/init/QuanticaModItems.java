
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.quantica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.quantica.block.display.CrucibleDisplayItem;
import net.mcreator.quantica.QuanticaMod;

public class QuanticaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, QuanticaMod.MODID);
	public static final RegistryObject<Item> CRUCIBLE = REGISTRY.register(QuanticaModBlocks.CRUCIBLE.getId().getPath(), () -> new CrucibleDisplayItem(QuanticaModBlocks.CRUCIBLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> FFFFFFFFFF = block(QuanticaModBlocks.FFFFFFFFFF);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
