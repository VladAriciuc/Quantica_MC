package net.mcreator.quantica.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.quantica.init.QuanticaModBlockEntities;
import net.mcreator.quantica.block.renderer.CrucibleTileRenderer;
import net.mcreator.quantica.QuanticaMod;

@Mod.EventBusSubscriber(modid = QuanticaMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(QuanticaModBlockEntities.CRUCIBLE.get(), context -> new CrucibleTileRenderer());
	}
}
