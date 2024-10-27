package org.tomcrusade.tech_adventure.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.tomcrusade.tech_adventure.utils.MixinItem;

@Mixin(net.minecraft.item.Item.class)
public class Item implements MixinItem {
    private Text customName;

    @Override
    public Text getCustomName() {
        return this.customName;
    }

    @Override
    public void setCustomName(Text customItemName) {
        this.customName = customItemName;
    }

    @Inject(method = "getName(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/text/Text;", at = @At("RETURN"), cancellable = true)
    public void getName(ItemStack stack, CallbackInfoReturnable<Text> cir) {
        if (this.getCustomName() != null) {
            cir.setReturnValue(this.getCustomName());
        }
    }

    @Inject(method = "getName()Lnet/minecraft/text/Text;", at = @At("RETURN"), cancellable = true)
    public void getName(CallbackInfoReturnable<Text> cir) {
        if (this.getCustomName() != null) {
            cir.setReturnValue(this.getCustomName());
        }
    }
}
