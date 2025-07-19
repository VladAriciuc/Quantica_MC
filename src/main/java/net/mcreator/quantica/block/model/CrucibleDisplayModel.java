package net.mcreator.quantica.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.quantica.block.display.CrucibleDisplayItem;

public class CrucibleDisplayModel extends GeoModel<CrucibleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CrucibleDisplayItem animatable) {
		return new ResourceLocation("quantica", "animations/crucible.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrucibleDisplayItem animatable) {
		return new ResourceLocation("quantica", "geo/crucible.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrucibleDisplayItem entity) {
		return new ResourceLocation("quantica", "textures/block/crucible_texture.png");
	}
}
