package com.ikon106.aiot.data;

import com.ikon106.aiot.AiotMain;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class AIOTTags extends BlockTagsProvider{
    public static final TagKey<Block> MINABLE_WITH_AIOT = BlockTags.create(new ResourceLocation("forge", "minable/aiot"));

    public AIOTTags(DataGenerator generator, @Nullable ExistingFileHelper helper){
        super(generator, AiotMain.MOD_ID, helper);
    }

    @Override
    protected void addTags(){
        this.tag(MINABLE_WITH_AIOT).addTags(BlockTags.MINEABLE_WITH_PICKAXE,
                                            BlockTags.MINEABLE_WITH_AXE,
                                            BlockTags.MINEABLE_WITH_HOE,
                                            BlockTags.MINEABLE_WITH_SHOVEL,
                                            BlockTags.COAL_ORES);
    }
}
