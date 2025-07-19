package net.mcreator.quantica.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.quantica.block.entity.UnfiredCrucibleTileEntity;

public class UnfiredCrucibleBlockModel extends GeoModel<UnfiredCrucibleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnfiredCrucibleTileEntity animatable) {
		return new ResourceLocation("quantica", "animations/crucible2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnfiredCrucibleTileEntity animatable) {
		return new ResourceLocation("quantica", "geo/crucible2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnfiredCrucibleTileEntity animatable) {
		return new ResourceLocation("quantica", "textures/block/unfired_crucible_texture.png");
	}
}
