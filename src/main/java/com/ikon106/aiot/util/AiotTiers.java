package com.ikon106.aiot.util;

import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import javax.swing.*;
import java.util.function.Supplier;

@SuppressWarnings("deprecation")
public enum AiotTiers implements Tier {
    WOOD(0, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(ItemTags.PLANKS);
    }),
    STONE(1, 131, 4.0F, 1.0F, 5, () -> {
        return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);
    }),
    IRON(2, 250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    DIAMOND(3, 1561*2, 8.0F, 3.0F, 10, () -> {
        return Ingredient.of(Items.DIAMOND);
    }),
    GOLD(0, 32, 12.0F, 0.0F, 22, () -> {
        return Ingredient.of(Items.GOLD_INGOT);
    }),
    NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {
        return Ingredient.of(Items.NETHERITE_INGOT);
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private AiotTiers(int level, int durability, float miningSpeed, float damage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = durability;
        this.speed = miningSpeed;
        this.damage = damage;
        this.enchantmentValue = enchantability;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

}