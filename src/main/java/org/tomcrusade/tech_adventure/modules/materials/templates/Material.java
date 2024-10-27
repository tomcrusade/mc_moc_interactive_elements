package org.tomcrusade.tech_adventure.modules.materials.templates;

import net.minecraft.block.BlockSetType;

import java.util.HashMap;

public abstract class Material implements IMaterial {

    private final HashMap<MaterialBlockTypes, MaterialItem> items;
    private BlockSetType blockSetType;
    private final String id;
    private final String name;

    public Material(String id, String name) {
        this.id = id;
        this.name = name;
        this.items = new HashMap<>();
    }

    protected void setBlockSetType(MaterialConfig config) {
        this.blockSetType = new BlockSetType(
          this.name,
          config.canOpenByHand,
          config.canOpenByWindCharge,
          config.canButtonBeActivatedByArrows,
          config.pressurePlateSensitivity,
          config.soundType,
          config.soundOfDoorClose,
          config.soundOfDoorOpen,
          config.soundOfTrapdoorClose,
          config.soundOfTrapdoorOpen,
          config.soundOfPressurePlateClickOff,
          config.soundOfPressurePlateClickOn,
          config.soundOfButtonClickOff,
          config.soundOfButtonClickOn
        );
    }

    @Override
    public BlockSetType getBlockSetType() {
        return blockSetType;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public HashMap<MaterialBlockTypes, MaterialItem> getItems() {
        return this.items;
    }

    @Override
    public MaterialItem getItem(MaterialBlockTypes type) {
        return this.items.get(type);
    }
}
