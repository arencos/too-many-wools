package me.aren.toomanywools;

import me.aren.toomanywools.registry.ModBlocks;
import me.aren.toomanywools.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class TooManyWools implements ModInitializer {
	public static String modId = "toomanywools";
	public static final ItemGroup WOOL_ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier("toomanywools", "wool_item_group"),
			() -> new ItemStack(Blocks.WHITE_WOOL));
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world! Does my mod work? Yes it does!");
		ModBlocks.registerBlocks();
		ModItems.registerItems();

	}
}
