package com.colenobi.hyperion.entity;

import com.colenobi.hyperion.HyperionMod;
import com.colenobi.hyperion.Reference;
import com.colenobi.hyperion.ModConfiguration;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
    public static void registerEntities()

    {
        registerEntity("mrsecure", EntityMrSecure.class, ModConfiguration.ENTITY_MRSECURE_ID, 50, 2175296, 3355955);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, HyperionMod.instance, range, 1, true, color1, color2);
    }
}
