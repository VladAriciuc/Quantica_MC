package net.mcreator.quantica.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.quantica.block.model.CrucibleDisplayModel;
import net.mcreator.quantica.block.display.CrucibleDisplayItem;

public class CrucibleDisplayItemRenderer extends GeoItemRenderer<CrucibleDisplayItem> {
	public CrucibleDisplayItemRenderer() {
		super(new CrucibleDisplayModel());
	}

	@Override
	public RenderType getRenderType(CrucibleDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
