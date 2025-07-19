package net.mcreator.quantica.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.quantica.block.entity.CrucibleTileEntity;

public class CrucibleBlockModel extends GeoModel<CrucibleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrucibleTileEntity animatable) {
		return new ResourceLocation("quantica", "animations/crucible.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrucibleTileEntity animatable) {
		return new ResourceLocation("quantica", "geo/crucible.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrucibleTileEntity animatable) {
		return new ResourceLocation("quantica", "textures/block/crucible_texture.png");
	}
}
