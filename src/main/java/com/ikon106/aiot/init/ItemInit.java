package com.ikon106.aiot.init;

import com.ikon106.aiot.AiotMain;
import com.ikon106.aiot.items.AiotItem;
import com.ikon106.aiot.items.FuelItem;
import com.ikon106.aiot.util.AiotTiers;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AiotMain.MOD_ID);

    public static final RegistryObject<Item> SMILE = ITEMS.register("smile", ()
            -> new Item(new Item.Properties().tab(ModCreativeTab.instance)
                                            .food(new FoodProperties.Builder().nutrition(3).saturationMod(10).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200, 4), 1.0F).build())));

    public static final RegistryObject<Item> TINYCOAL = ITEMS.register("tiny_coal", ()
            -> new FuelItem(new Item.Properties().tab(ModCreativeTab.instance), 200));

    public static final RegistryObject<Item> DIAMONDAIOT = ITEMS.register("diamond_aiot", ()
            -> new AiotItem(AiotTiers.DIAMOND,5F,-3.5F, new Item.Properties().tab(ModCreativeTab.instance)));

    public static class ModCreativeTab extends CreativeModeTab {
        private ModCreativeTab(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SMILE.get());
        }

        public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "aiot");
    }
}


