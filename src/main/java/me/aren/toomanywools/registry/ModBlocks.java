package me.aren.toomanywools.registry;

import me.aren.toomanywools.TooManyWools;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block TURQUOISE_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block VIOLET_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block CERULEAN_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block ACID_GREEN_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block BLACK_COFFEE_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block ASPARAGUS_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block BEIGE_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block DANDELION_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block ARYLIDE_YELLOW_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block AERO_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block AMBER_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block BABY_BLUE_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block ANDROID_GREEN_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block ALABASTER_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block ANTIQUE_BRONZE_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block ANTIQUE_FUCHSIA_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static final Block APRICOT_WOOL = new Block(FabricBlockSettings.
            of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .breakByHand(true)
            .strength(0.8f, 0.8f)
            .sounds(BlockSoundGroup.WOOL)
    );

    public static void registerBlocks()
    {
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "turquoise_wool"), TURQUOISE_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "violet_wool"), VIOLET_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "cerulean_wool"), CERULEAN_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "acid_green_wool"), ACID_GREEN_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "black_coffee_wool"), BLACK_COFFEE_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "asparagus_wool"), ASPARAGUS_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "beige_wool"), BEIGE_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "dandelion_wool"), DANDELION_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "arylide_yellow_wool"), ARYLIDE_YELLOW_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "aero_wool"), AERO_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "amber_wool"), AMBER_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "baby_blue_wool"), BABY_BLUE_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "android_green_wool"), ANDROID_GREEN_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "alabaster_wool"), ALABASTER_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "antique_bronze_wool"), ANTIQUE_BRONZE_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "antique_fuchsia_wool"), ANTIQUE_FUCHSIA_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(TooManyWools.modId, "apricot_wool"), APRICOT_WOOL);
    }
}
