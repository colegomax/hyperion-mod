package com.colenobi.hyperion;

import com.colenobi.hyperion.core.ModItems;
import com.colenobi.hyperion.entity.EntityFoamDart;
import com.colenobi.hyperion.entity.EntityInit;
import com.colenobi.hyperion.entity.EntityMrSecure;
import com.colenobi.hyperion.proxy.CommonProxy;
import com.mrcrayfish.guns.client.gui.DisplayProperty;
import com.mrcrayfish.guns.client.gui.GuiWorkbench;
import com.mrcrayfish.guns.common.WorkbenchRegistry;
import com.mrcrayfish.guns.item.AmmoRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;

import java.io.File;

import static net.minecraftforge.registries.GameData.registerEntity;

/*
 * This is all you need in your mod class to create an addon.
 */

/**
 * Author: MrCrayfish
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, acceptedMinecraftVersions = Reference.MC_VERSION, dependencies = Reference.DEPENDENCIES)
public class HyperionMod
{
    @Mod.Instance
    public static HyperionMod instance;

    public static File config;

    public static final CreativeTabs TABGUNS = new CreativeTabs(Reference.MOD_ID + ".tabguns")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.ASSAULTER);
        }
    };

    public static final CreativeTabs TABITEMS = new CreativeTabs(Reference.MOD_ID + ".tabitems")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Items.IRON_INGOT);
        }
    };

    public static final CreativeTabs TABROBOTS = new CreativeTabs(Reference.MOD_ID + ".tabrobots")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Items.IRON_INGOT);
        }
    };

    @SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_SERVER)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "foam_dart"), EntityFoamDart.class, Reference.MOD_ID + ".foam_dart", 0, this, 64, 80, true);
        //PLEASE DO NOT ADD ENTITY REGISTRY HERE ADD IT TO ENTITYINIT!!!
        EntityInit.registerEntities();
        proxy.preInit();
    }

    /*
     * Uncomment this below if you want make your custom ammo to shoot a custom projectile. A projectile is
     * an entity, so you will need to register it as normally would for an entity.
     *
     * You can copy the registration from MrCrayfish's Gun Mod
     * https://github.com/MrCrayfish/MrCrayfishGunMod/blob/master/src/main/java/com/mrcrayfish/guns/init/ModEntities.java#L15
     *
     * The missile entity is an example of a custom projectile. You can see the example here.
     * https://github.com/MrCrayfish/MrCrayfishGunMod/blob/master/src/main/java/com/mrcrayfish/guns/entity/EntityMissile.java
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        /* Registering projectile factories must be done in the init phase or later. If you do it in preInit, the item will be null. */
        AmmoRegistry.getInstance().registerProjectileFactory(ModItems.FOAM_DART, EntityFoamDart::new);

        proxy.init();
    }
}
