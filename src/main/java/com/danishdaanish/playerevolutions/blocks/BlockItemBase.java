package com.danishdaanish.playerevolutions.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import com.danishdaanish.playerevolutions.PlayerEvolutions;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(PlayerEvolutions.TAB));
    }
}
