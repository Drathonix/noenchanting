package com.drathonix.noenchanting.mixin;

import net.minecraft.world.inventory.EnchantmentMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.ArrayList;
import java.util.List;

@Mixin(EnchantmentMenu.class)
public class MixinEnchantmentMenu {
    /**
     * @author Drathonix
     * @reason Disables enchanting.
     */
    @Overwrite
    private List<EnchantmentInstance> getEnchantmentList(ItemStack p_39472_, int p_39473_, int p_39474_) {
        return new ArrayList<>();
    }
}
