package com.colenobi.hyperion.core;

import com.colenobi.hyperion.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModBlocks
{
    //private static final List<Block> BLOCKS = new ArrayList<>();

    /* Create your items here */

    //@GameRegistry.ObjectHolder(ItemNames.ASSAULTER)
    //public static final Item ASSAULTER = null;

    //@GameRegistry.ObjectHolder(ItemNames.FOAM_DART)
    //public static final ItemAmmo FOAM_DART = null;

    //private static void register()
    //{
        /* Registering custom guns. Make sure you create a new gun json for every gun.
         * See "assets/foamguns/guns/assaulter.json" for an example. The json file is where you can
         * customize the properties for each of your weapons.
         *
         * For example of gun json, see MrCrayfish's Gun Mod repo
         * https://github.com/MrCrayfish/MrCrayfishGunMod/tree/master/src/main/resources/assets/cgm/guns
         *
         * */
        //BLOCKS.add(new ItemGun(new ResourceLocation(Reference.MOD_ID, "assaulter")).setCreativeTab(HyperionMod.TAB));

        /* Registering custom ammo. Make sure you change in your gun json to use your custom ammo if you implement one */
        //BLOCKS.add(new ItemAmmo(new ResourceLocation(Reference.MOD_ID, "foam_dart")).setCreativeTab(HyperionMod.TAB));
    //}

    //@SubscribeEvent
    //public static void register(RegistryEvent.Register<Item> event)
    //{
        //ModBlocks.register();
        //BLOCKS.forEach(item -> event.getRegistry().register(block));
    //}

    //@SubscribeEvent
    //@SideOnly(Side.CLIENT)
    //public static void register(ModelRegistryEvent event)
    //{
    //    BLOCKS.forEach(ModBlocks::registerRender);
    //}

    //@SideOnly(Side.CLIENT)
    //private static void registerRender(Item item)
    //{
    //    ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    //}
}
