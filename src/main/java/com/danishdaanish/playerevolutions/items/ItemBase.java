package com.danishdaanish.playerevolutions.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import com.danishdaanish.playerevolutions.PlayerEvolutions;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(PlayerEvolutions.TAB));
    }
}

