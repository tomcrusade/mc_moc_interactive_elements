package org.tomcrusade.tech_adventure.modules.materials.templates;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import org.tomcrusade.tech_adventure.modules.ModItemGroup;
import org.tomcrusade.tech_adventure.utils.BlockSetting;

import static org.tomcrusade.tech_adventure.modules.ModItems.*;

public interface InteractableBlocksGroup extends IMaterial {
  static BlockSetting getButtonDefaultSettings(BlockSetting defaultSetting) {
    BlockSetting setting = defaultSetting.clone();
    setting.hardness = 0.5f;
    setting.blastResistance = 0.5f;
    setting.hasNoCollision = true;
    setting.isBreakingRequiresTool = false;
    setting.pistonPushBehavior = PistonBehavior.DESTROY;
    return setting;
  }

  static void registerButton(Material material, Block block) {
    material.getItems().put(MaterialBlockTypes.BUTTON, new MaterialItem(
      material.getId() + "_button",
      Text.translatable("item.tech_adventure.materials.interactable_blocks.button",material.getName()),
      new Item.Settings(),
      block,
      new ModItemGroup[]{ITEM_GROUP_MOD_FUNCTIONAL, ITEM_GROUP_REDSTONE, ITEM_GROUP_BUILDING_BLOCKS},
      false
    ));
  }

  static BlockSetting getTrapdoorDefaultSettings(BlockSetting defaultSetting) {
    BlockSetting setting = defaultSetting.clone();
    setting.hardness = 5.0f;
    setting.blastResistance = 5.0f;
    setting.isNonOpaque = true;
    setting.isBreakingRequiresTool = true;
    setting.allowSpawning = Blocks::never;
    return setting;
  }

  static void registerTrapdoor(Material material, Block block) {
    material.getItems().put(MaterialBlockTypes.TRAPDOOR, new MaterialItem(
      material.getId() + "_trapdoor",
      Text.translatable("item.tech_adventure.materials.interactable_blocks.trapdoor",material.getName()),
      new Item.Settings(),
      block,
      new ModItemGroup[]{ITEM_GROUP_MOD_FUNCTIONAL, ITEM_GROUP_REDSTONE, ITEM_GROUP_BUILDING_BLOCKS},
      false
    ));
  }

  static BlockSetting getDoorDefaultSettings(BlockSetting defaultSetting) {
    BlockSetting setting = defaultSetting.clone();
    setting.hardness = 5.0f;
    setting.blastResistance = 5.0f;
    setting.isNonOpaque = true;
    setting.isBreakingRequiresTool = true;
    setting.pistonPushBehavior = PistonBehavior.DESTROY;
    return setting;
  }

  static void registerDoor(Material material, Block block) {
    material.getItems().put(MaterialBlockTypes.DOOR, new MaterialItem(
      material.getId() + "_door",
      Text.translatable("item.tech_adventure.materials.interactable_blocks.door",material.getName()),
      new Item.Settings(),
      block,
      new ModItemGroup[]{ITEM_GROUP_MOD_FUNCTIONAL, ITEM_GROUP_REDSTONE, ITEM_GROUP_BUILDING_BLOCKS},
      false
    ));
  }

  static BlockSetting getPressurePlateDefaultSettings(BlockSetting defaultSetting) {
    BlockSetting setting = defaultSetting.clone();
    setting.hardness = 0.5f;
    setting.blastResistance = 0.5f;
    setting.isSolidBlock = true;
    setting.isBreakingRequiresTool = true;
    setting.noteblockInstrument = NoteBlockInstrument.BASEDRUM;
    setting.hasNoCollision = true;
    setting.pistonPushBehavior = PistonBehavior.DESTROY;
    return setting;
  }

  static void registerPressurePlate(Material material, Block block) {
    material.getItems().put(MaterialBlockTypes.PRESSURE_PLATE, new MaterialItem(
      material.getId() + "_pressure_plate",
      Text.translatable("item.tech_adventure.materials.interactable_blocks.pressure_plate",material.getName()),
      new Item.Settings(),
      block,
      new ModItemGroup[]{ITEM_GROUP_MOD_FUNCTIONAL, ITEM_GROUP_REDSTONE, ITEM_GROUP_BUILDING_BLOCKS},
      false
    ));
  }

  static BlockSetting getCauldronDefaultSettings(BlockSetting defaultSetting) {
    BlockSetting setting = defaultSetting.clone();
    setting.hardness = 2.0f;
    setting.blastResistance = 2.0f;
    setting.isBreakingRequiresTool = true;
    setting.isNonOpaque = true;
    return setting;
  }

  static void registerCauldron(Material material, Block block) {
    material.getItems().put(MaterialBlockTypes.CAULDRON, new MaterialItem(
      material.getId() + "_cauldron",
      Text.translatable("item.tech_adventure.materials.interactable_blocks.cauldron",material.getName()),
      new Item.Settings(),
      block,
      new ModItemGroup[]{ITEM_GROUP_MOD_FUNCTIONAL, ITEM_GROUP_FUNCTIONAL, ITEM_GROUP_REDSTONE},
      false
    ));
  }

  static BlockSetting getBulbDefaultSettings(BlockSetting defaultSetting) {
    BlockSetting setting = defaultSetting.clone();
    setting.hardness = 3.0f;
    setting.blastResistance = 6.0f;
    setting.isBreakingRequiresTool = true;
    setting.solidBlockingValidator = Blocks::never;
    setting.luminanceCalculator = Blocks.createLightLevelFromLitBlockState(15);
    return setting;
  }

  static void registerBulb(Material material, Block block) {
    material.getItems().put(MaterialBlockTypes.BULB, new MaterialItem(
      material.getId() + "_bulb",
      Text.translatable("item.tech_adventure.materials.interactable_blocks.bulb",material.getName()),
      new Item.Settings(),
      block,
      new ModItemGroup[]{ITEM_GROUP_MOD_FUNCTIONAL, ITEM_GROUP_FUNCTIONAL, ITEM_GROUP_REDSTONE, ITEM_GROUP_BUILDING_BLOCKS},
      false
    ));
  }
}
