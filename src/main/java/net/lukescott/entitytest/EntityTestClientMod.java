package net.lukescott.entitytest;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.lukescott.entitytest.entity.ModEntities;
import net.lukescott.entitytest.entity.client.CrocoLizardRenderer;

public class EntityTestClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.CROCOLIZARD, CrocoLizardRenderer::new);

    }
}
