package com.ikon106.aiot.items;

import com.ikon106.aiot.data.AIOTTags;

import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import java.util.Set;

import static net.minecraftforge.common.ToolActions.*;

public class AiotItem extends DiggerItem {
    protected final float speed;
    public AiotItem(Tier tier, float addedDamage, float addedAttackSpeed, Properties properties){
        super(addedDamage, addedAttackSpeed, tier, AIOTTags.MINABLE_WITH_AIOT, properties);
        this.speed = tier.getSpeed();
    }

    public static final Set<ToolAction> TOOL_ACTIONS = Set.of(
            AXE_DIG, AXE_STRIP, AXE_SCRAPE, AXE_WAX_OFF,
            HOE_DIG,
            SHOVEL_DIG, SHOVEL_FLATTEN,
            PICKAXE_DIG,
            SWORD_DIG);
    @Override
    public boolean canPerformAction(ItemStack stack, ToolAction toolAction){
        return TOOL_ACTIONS.contains(toolAction);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state){
        return super.getDestroySpeed(stack, state);
    }

    @Override
    public boolean isCorrectToolForDrops(ItemStack stack, BlockState state){
        return super.isCorrectToolForDrops(stack, state);
    }
}
