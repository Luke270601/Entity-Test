package net.lukescott.entitytest.entity.client;

import net.lukescott.entitytest.EntityTestMod;
import net.lukescott.entitytest.entity.custom.CrocoLizardEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class CrocoLizardModel extends AnimatedGeoModel<CrocoLizardEntity> {

    @Override
    public Identifier getModelResource(CrocoLizardEntity object) {
        return new Identifier(EntityTestMod.MOD_ID, "geo/crocolizard.geo.json");
    }

    @Override
    public Identifier getTextureResource(CrocoLizardEntity object) {
        return new Identifier(EntityTestMod.MOD_ID, "textures/entity/crocolizard/texture.png");
    }

    @Override
    public Identifier getAnimationResource(CrocoLizardEntity animatable) {
        return new Identifier(EntityTestMod.MOD_ID, "animations/model.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(CrocoLizardEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 270F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 270F));
        }
    }

}
