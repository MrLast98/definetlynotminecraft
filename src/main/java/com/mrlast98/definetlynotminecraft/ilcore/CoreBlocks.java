package com.mrlast98.definetlynotminecraft.ilcore;

import com.mrlast98.definetlynotminecraft.DefinitelyNotMinecraft;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CoreBlocks {

    public static final Block ALTAR = new Block(FabricBlockSettings
        .of(Material.METAL)
        .strength(50F, 18000000F)
        .luminance(15)
        .breakByTool(FabricToolTags.SHOVELS, 2)
        .requiresTool()
        .sounds(BlockSoundGroup.GRASS));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(DefinitelyNotMinecraft.MOD_ID, "altar"), ALTAR);
    }
}
