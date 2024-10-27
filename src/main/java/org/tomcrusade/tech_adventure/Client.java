package org.tomcrusade.tech_adventure;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.tomcrusade.tech_adventure.Main.MOD_ID;

public class Client implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Initializing " + MOD_ID + " client");
    }
}
