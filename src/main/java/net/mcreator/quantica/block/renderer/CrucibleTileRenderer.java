package net.mcreator.quantica.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.quantica.block.model.CrucibleBlockModel;
import net.mcreator.quantica.block.entity.CrucibleTileEntity;

public class CrucibleTileRenderer extends GeoBlockRenderer<CrucibleTileEntity> {
	public CrucibleTileRenderer() {
		super(new CrucibleBlockModel());
	}

	@Override
	public RenderType getRenderType(CrucibleTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
