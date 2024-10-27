package org.tomcrusade.tech_adventure.modules.materials.templates;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.tomcrusade.tech_adventure.modules.ModItemGroup;

import static org.tomcrusade.tech_adventure.Main.MOD_ID;

public class MaterialItem {

    public final Identifier id;
    public final Item item;
    public final Block block;

    public MaterialItem(
            String id,
            Text name,
            Item.Settings itemSetting,
            Block block,
            ModItemGroup[] groups,
            boolean isTechnicalBlock
    ) {
        this.id = Identifier.of(MOD_ID, id);
        if (block == null) {
            this.block = null;
            this.item = new Item(itemSetting);
            this.item.setCustomName(name);
            return;
        }
        this.block = block;
        Registry.register(Registries.BLOCK, this.id, block);
        if (isTechnicalBlock) {
            this.item = null;
        } else {
            this.item = new BlockItem(block, itemSetting);
            this.item.setCustomName(name);
            Registry.register(Registries.ITEM, this.id, this.item);
        }
        if (this.item != null) {
            for (ModItemGroup group : groups) {
                group.add(this);
            }
        }
    }
}
