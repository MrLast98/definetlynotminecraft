package com.mrlast98.definetlynotminecraft.ilcore;

import com.mrlast98.definetlynotminecraft.DefinitelyNotMinecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CoreItems {
    public static final Item ROUGH_STONE = new Item(new Item.Settings().group(ItemGroup.DECORATIONS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(DefinitelyNotMinecraft.MOD_ID, "rough_stone"), ROUGH_STONE);
    }
}
