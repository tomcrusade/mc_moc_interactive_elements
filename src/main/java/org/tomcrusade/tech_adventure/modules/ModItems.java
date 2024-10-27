package org.tomcrusade.tech_adventure.modules;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.text.Text;
import org.tomcrusade.tech_adventure.modules.materials.TinMaterialSet;

public class ModItems {
  public static final ModItemGroup ITEM_GROUP_MOD_FUNCTIONAL = new ModItemGroup(
    "functional_items",
    new Item(new Item.Settings()),
    Text.translatable("item_groups.tech_adventure.functional")
  );
  public static final ModItemGroup ITEM_GROUP_FUNCTIONAL = new ModItemGroup(ItemGroups.FUNCTIONAL);
  public static final ModItemGroup ITEM_GROUP_REDSTONE = new ModItemGroup(ItemGroups.REDSTONE);
  public static final ModItemGroup ITEM_GROUP_BUILDING_BLOCKS = new ModItemGroup(ItemGroups.BUILDING_BLOCKS);

  public static TinMaterialSet TIN_MATERIAL_SET;

  public static void register() {
    TIN_MATERIAL_SET = new TinMaterialSet();
    ITEM_GROUP_MOD_FUNCTIONAL.registerItems();
    ITEM_GROUP_FUNCTIONAL.registerItems();
    ITEM_GROUP_REDSTONE.registerItems();
    ITEM_GROUP_BUILDING_BLOCKS.registerItems();
  }
}
