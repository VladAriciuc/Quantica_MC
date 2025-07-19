package net.mcreator.quantica.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.quantica.block.display.UnfiredCrucibleDisplayItem;

public class UnfiredCrucibleDisplayModel extends GeoModel<UnfiredCrucibleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnfiredCrucibleDisplayItem animatable) {
		return new ResourceLocation("quantica", "animations/crucible2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnfiredCrucibleDisplayItem animatable) {
		return new ResourceLocation("quantica", "geo/crucible2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnfiredCrucibleDisplayItem entity) {
		return new ResourceLocation("quantica", "textures/block/unfired_crucible_texture.png");
	}
}
