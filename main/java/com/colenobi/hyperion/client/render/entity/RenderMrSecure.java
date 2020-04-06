package com.colenobi.hyperion.client.render.entity;

import com.colenobi.hyperion.Reference;
import com.colenobi.hyperion.entity.EntityMrSecure;
import com.colenobi.hyperion.entity.models.ModelMrSecure;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMrSecure extends RenderLiving<EntityMrSecure>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/mrsecure.png");

    public RenderMrSecure(RenderManager manager)
    {
        super(manager, new ModelMrSecure(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityMrSecure entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityMrSecure entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}