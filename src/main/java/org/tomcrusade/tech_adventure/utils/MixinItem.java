package org.tomcrusade.tech_adventure.utils;

import net.minecraft.text.Text;

public interface MixinItem {
  default Text getCustomName() {
    return null;
  }
  default void setCustomName(Text name) {
  }
}
