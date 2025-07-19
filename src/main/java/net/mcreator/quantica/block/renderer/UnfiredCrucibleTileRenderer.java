package net.mcreator.quantica.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.quantica.block.model.UnfiredCrucibleBlockModel;
import net.mcreator.quantica.block.entity.UnfiredCrucibleTileEntity;

public class UnfiredCrucibleTileRenderer extends GeoBlockRenderer<UnfiredCrucibleTileEntity> {
	public UnfiredCrucibleTileRenderer() {
		super(new UnfiredCrucibleBlockModel());
	}

	@Override
	public RenderType getRenderType(UnfiredCrucibleTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
