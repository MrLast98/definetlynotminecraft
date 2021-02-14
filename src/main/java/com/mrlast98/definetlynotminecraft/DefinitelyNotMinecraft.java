package com.mrlast98.definetlynotminecraft;

import net.fabricmc.api.ModInitializer;
import com.mrlast98.definetlynotminecraft.ilcore.*;

public class DefinitelyNotMinecraft implements ModInitializer {

    public static final String MOD_ID = "dnm";

    @Override
    public void onInitialize() {
        CoreItems.registerItems();
        CoreBlocks.registerBlocks();
    }
}
