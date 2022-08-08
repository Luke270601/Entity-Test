package net.lukescott.entitytest.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.lukescott.entitytest.entity.ModEntities;
import net.lukescott.entitytest.entity.custom.CrocoLizardEntity;

public class ModRegistries {

    public static void registerModStuffs(){
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.CROCOLIZARD, CrocoLizardEntity.setAttributes());
    }
}
