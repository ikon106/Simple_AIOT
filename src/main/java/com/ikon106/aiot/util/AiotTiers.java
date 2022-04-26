package com.ikon106.aiot.util;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;



public class AiotTiers {
    public static final ForgeTier DIAMONDAIOT = new ForgeTier(3, 1561*2, 8.0f, 3f, 22, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND));

}