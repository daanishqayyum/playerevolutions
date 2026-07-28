package com.danishdaanish.playerevolutions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AwesomeCatBlock extends Block {
    public AwesomeCatBlock() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(-1.0f, 3600000.0f));
    }
}
