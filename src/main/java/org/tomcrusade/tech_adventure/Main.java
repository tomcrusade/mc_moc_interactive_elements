package org.tomcrusade.tech_adventure;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tomcrusade.tech_adventure.modules.ModItems;

public class Main implements ModInitializer {
    public static final String MOD_ID = "tech_adventure";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing " + MOD_ID + " mod");
        ModItems.register();
        LOGGER.info(MOD_ID + " initialized");
    }
}
