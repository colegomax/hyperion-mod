package com.colenobi.hyperion.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityMrSecure extends EntityCreature
{
    public EntityMrSecure(World worldIn)
    {
        super(worldIn);
        this.setSize(1F, 2F);
    }

    @Override
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(3, new EntityAILookIdle(this));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
    }

    @Override
    public float getEyeHeight()
    {
        return 1.65F;
    }

//    @Override
//    protected ResourceLocation getLootTable()
//    {
//        return LootTableHandler.CENTAUR;
//    }
//
//    @Override
//    protected SoundEvent getAmbientSound()
//    {
//        return SoundsHandler.ENTITY_CENTAUR_AMBIENT;
//    }
//
//    @Override
//    protected SoundEvent getHurtSound(DamageSource source)
//    {
//        return SoundsHandler.ENTITY_CENTAUR_HURT;
//    }
//
//    @Override
//    protected SoundEvent getDeathSound()
//    {
//        return SoundsHandler.ENTITY_CENTAUR_DEATH;
//    }
}