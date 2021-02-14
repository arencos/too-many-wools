package me.aren.toomanywools.registry;

import me.aren.toomanywools.TooManyWools;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final BlockItem TURQUOISE_WOOL = new BlockItem(ModBlocks.TURQUOISE_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem VIOLET_WOOL = new BlockItem(ModBlocks.VIOLET_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem CERULEAN_WOOL = new BlockItem(ModBlocks.CERULEAN_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem ACID_GREEN_WOOL = new BlockItem(ModBlocks.ACID_GREEN_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem BLACK_COFFEE_WOOL = new BlockItem(ModBlocks.BLACK_COFFEE_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem ASPARAGUS_WOOL = new BlockItem(ModBlocks.ASPARAGUS_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem BEIGE_WOOL = new BlockItem(ModBlocks.BEIGE_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem DANDELION_WOOL = new BlockItem(ModBlocks.DANDELION_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem ARYLIDE_YELLOW_WOOL = new BlockItem(ModBlocks.ARYLIDE_YELLOW_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem AERO_WOOL = new BlockItem(ModBlocks.AERO_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem AMBER_WOOL = new BlockItem(ModBlocks.AMBER_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem BABY_BLUE_WOOL = new BlockItem(ModBlocks.BABY_BLUE_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem ANDROID_GREEN_WOOL = new BlockItem(ModBlocks.ANDROID_GREEN_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem ALABASTER_WOOL = new BlockItem(ModBlocks.ALABASTER_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem ANTIQUE_BRONZE_WOOL = new BlockItem(ModBlocks.ANTIQUE_BRONZE_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem ANTIQUE_FUCHSIA_WOOL = new BlockItem(ModBlocks.ANTIQUE_FUCHSIA_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));
    public static final BlockItem APRICOT_WOOL = new BlockItem(ModBlocks.APRICOT_WOOL, new Item.Settings().group(TooManyWools.WOOL_ITEM_GROUP));

    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "turquoise_wool"), TURQUOISE_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "violet_wool"), VIOLET_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "cerulean_wool"), CERULEAN_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "acid_green_wool"), ACID_GREEN_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "black_coffee_wool"), BLACK_COFFEE_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "asparagus_wool"), ASPARAGUS_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "beige_wool"), BEIGE_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "dandelion_wool"), DANDELION_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "arylide_yellow_wool"), ARYLIDE_YELLOW_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "aero_wool"), AERO_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "amber_wool"), AMBER_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "baby_blue_wool"), BABY_BLUE_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "android_green_wool"), ANDROID_GREEN_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "alabaster_wool"), ALABASTER_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "antique_bronze_wool"), ANTIQUE_BRONZE_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "antique_fuchsia_wool"), ANTIQUE_FUCHSIA_WOOL);
        Registry.register(Registry.ITEM, new Identifier(TooManyWools.modId, "apricot_wool"), APRICOT_WOOL);
    }
}
