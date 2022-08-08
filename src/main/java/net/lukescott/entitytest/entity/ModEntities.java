package net.lukescott.entitytest.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.lukescott.entitytest.EntityTestMod;
import net.lukescott.entitytest.entity.custom.CrocoLizardEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<CrocoLizardEntity> CROCOLIZARD = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(EntityTestMod.MOD_ID, "raccoon"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CrocoLizardEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build());
}
