package org.tomcrusade.tech_adventure.modules.materials;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import org.tomcrusade.tech_adventure.modules.materials.templates.InteractableBlocksGroup;
import org.tomcrusade.tech_adventure.utils.BlockSetting;
import org.tomcrusade.tech_adventure.modules.materials.templates.Material;
import org.tomcrusade.tech_adventure.modules.materials.templates.MaterialConfig;

public class TinMaterialSet extends Material implements InteractableBlocksGroup {

  public TinMaterialSet() {
    super("tin", "Tin");

    MaterialConfig config = new MaterialConfig();
    config.canOpenByHand = true;
    config.canButtonBeActivatedByArrows = true;
    config.canOpenByWindCharge = true;
    config.pressurePlateSensitivity = BlockSetType.ActivationRule.EVERYTHING;
    config.soundType = BlockSoundGroup.METAL;
    config.soundOfDoorClose = SoundEvents.BLOCK_IRON_DOOR_CLOSE;
    config.soundOfDoorOpen = SoundEvents.BLOCK_IRON_DOOR_OPEN;
    config.soundOfTrapdoorClose = SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE;
    config.soundOfTrapdoorOpen = SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN;
    config.soundOfPressurePlateClickOff = SoundEvents.BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF;
    config.soundOfPressurePlateClickOn = SoundEvents.BLOCK_METAL_PRESSURE_PLATE_CLICK_ON;
    config.soundOfButtonClickOff = SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF;
    config.soundOfButtonClickOn = SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON;
    this.setBlockSetType(config);

    BlockSetting materialSetting = new BlockSetting();
    materialSetting.sound = BlockSoundGroup.METAL;
    materialSetting.mapColor = MapColor.OFF_WHITE;

    BlockSetting buttonItemSetting = InteractableBlocksGroup.getButtonDefaultSettings(materialSetting);
    buttonItemSetting.mapColor = MapColor.CLEAR;
    InteractableBlocksGroup.registerButton(this, new ButtonBlock(this.getBlockSetType(), 5, buttonItemSetting.asMinecraftBlockSetting()));

    BlockSetting trapdoorItemSetting = InteractableBlocksGroup.getTrapdoorDefaultSettings(materialSetting);
    trapdoorItemSetting.hardness = 3.5f;
    trapdoorItemSetting.blastResistance = 4.2f;
    InteractableBlocksGroup.registerTrapdoor(this, new TrapdoorBlock(this.getBlockSetType(), trapdoorItemSetting.asMinecraftBlockSetting()));

    BlockSetting doorItemSetting = InteractableBlocksGroup.getDoorDefaultSettings(materialSetting);
    doorItemSetting.hardness = 3.5f;
    doorItemSetting.blastResistance = 4.2f;
    InteractableBlocksGroup.registerDoor(this, new DoorBlock(this.getBlockSetType(), doorItemSetting.asMinecraftBlockSetting()));

    BlockSetting pressurePlateItemSetting = InteractableBlocksGroup.getPressurePlateDefaultSettings(materialSetting);
    InteractableBlocksGroup.registerPressurePlate(this, new PressurePlateBlock(this.getBlockSetType(), pressurePlateItemSetting.asMinecraftBlockSetting()));

    BlockSetting cauldronItemSetting = InteractableBlocksGroup.getCauldronDefaultSettings(materialSetting);
    InteractableBlocksGroup.registerCauldron(this, new CauldronBlock(cauldronItemSetting.asMinecraftBlockSetting()));

    BlockSetting bulbItemSetting = InteractableBlocksGroup.getBulbDefaultSettings(materialSetting);
    bulbItemSetting.blastResistance = 4.2f;
    InteractableBlocksGroup.registerBulb(this, new BulbBlock(bulbItemSetting.asMinecraftBlockSetting()));
  }
}
