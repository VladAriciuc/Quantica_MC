
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.quantica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.quantica.QuanticaMod;

public class QuanticaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, QuanticaMod.MODID);
	public static final RegistryObject<CreativeModeTab> QUANTICATAB = REGISTRY.register("quanticatab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.quantica.quanticatab")).icon(() -> new ItemStack(Blocks.CHERRY_SAPLING)).displayItems((parameters, tabData) -> {
				tabData.accept(QuanticaModBlocks.CRUCIBLE.get().asItem());
			}).withSearchBar().build());
}
