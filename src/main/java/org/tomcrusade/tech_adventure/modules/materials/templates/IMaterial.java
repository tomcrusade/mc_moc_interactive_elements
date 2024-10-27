package org.tomcrusade.tech_adventure.modules.materials.templates;

import net.minecraft.block.BlockSetType;

import java.util.HashMap;

public interface IMaterial {
  public HashMap<MaterialBlockTypes, MaterialItem> getItems();

  public String getId();

  public String getName();

  public BlockSetType getBlockSetType();

  public MaterialItem getItem(MaterialBlockTypes type);
}
