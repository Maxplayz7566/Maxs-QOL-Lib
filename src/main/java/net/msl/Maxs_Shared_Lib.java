package net.msl;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class Maxs_Shared_Lib implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("msl");

	@Override
	public void onInitialize() {
		LOGGER.info("Initialized Maxs Shared Library!");
		Block block = new Block(FabricBlockSettings.create());
		blocks.createBlockWithItem(block, new BlockItem(block, new FabricItemSettings()), new Identifier("cool-mod-name", "debug_block"));
	}
}