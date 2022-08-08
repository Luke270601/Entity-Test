package net.lukescott.entitytest.entity.client;

import net.lukescott.entitytest.EntityTestMod;
import net.lukescott.entitytest.entity.custom.CrocoLizardEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CrocoLizardRenderer extends GeoEntityRenderer<CrocoLizardEntity> {
    public CrocoLizardRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new CrocoLizardModel());
    }

    @Override
    public Identifier getTextureResource(CrocoLizardEntity instance) {
        return new Identifier(EntityTestMod.MOD_ID, "textures/entity/crocolizard/texture.png");
    }
}
