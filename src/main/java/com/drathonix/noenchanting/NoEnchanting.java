package com.drathonix.noenchanting;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("noenchanting")
public class NoEnchanting {

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public NoEnchanting() {
    }
}
