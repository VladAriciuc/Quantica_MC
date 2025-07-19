package net.mcreator.quantica.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.quantica.block.model.UnfiredCrucibleDisplayModel;
import net.mcreator.quantica.block.display.UnfiredCrucibleDisplayItem;

public class UnfiredCrucibleDisplayItemRenderer extends GeoItemRenderer<UnfiredCrucibleDisplayItem> {
	public UnfiredCrucibleDisplayItemRenderer() {
		super(new UnfiredCrucibleDisplayModel());
	}

	@Override
	public RenderType getRenderType(UnfiredCrucibleDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
