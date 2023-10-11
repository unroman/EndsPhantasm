package net.lyof.phantasm.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lyof.phantasm.Phantasm;
import net.lyof.phantasm.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ModItemGroups {
    public static final ItemGroup PHANTASM = register(Phantasm.MOD_ID,
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.phantasm"))
                    .icon(() -> new ItemStack(ModBlocks.FALLEN_STAR))
                    .entries((displayContext, entries) -> {
                        if (false) return;


                        entries.add(ModBlocks.FALLEN_STAR);

                        entries.add(ModBlocks.PREAM_LOG);
                        entries.add(ModBlocks.PREAM_WOOD);
                        entries.add(ModBlocks.STRIPPED_PREAM_LOG);
                        entries.add(ModBlocks.STRIPPED_PREAM_WOOD);

                        entries.add(ModBlocks.PREAM_PLANKS);
                        entries.add(ModBlocks.PREAM_STAIRS);
                        entries.add(ModBlocks.PREAM_SLAB);

                        entries.add(ModItems.PREAM_BERRY);

                        entries.add(ModBlocks.CRYSTAL_SHARD);
                        entries.add(ModBlocks.VOID_CRYSTAL_SHARD);

                        entries.add(ModBlocks.CRYSTAL_BLOCK);
                        entries.add(ModBlocks.VOID_CRYSTAL_BLOCK);


                        entries.add(ModItems.CRYSTALLINE_SWORD);
                        entries.add(ModItems.CRYSTALLINE_SHOVEL);
                        entries.add(ModItems.CRYSTALLINE_PICKAXE);
                        entries.add(ModItems.CRYSTALLINE_AXE);
                        entries.add(ModItems.CRYSTALLINE_HOE);


                        entries.add(ModBlocks.CRYSTAL_TILES);
                        entries.add(ModBlocks.CRYSTAL_TILES_STAIRS);
                        entries.add(ModBlocks.CRYSTAL_TILES_SLAB);
                        entries.add(ModBlocks.CRYSTAL_PILLAR);

                        entries.add(ModBlocks.VOID_CRYSTAL_TILES);
                        entries.add(ModBlocks.VOID_CRYSTAL_TILES_STAIRS);
                        entries.add(ModBlocks.VOID_CRYSTAL_TILES_SLAB);
                        entries.add(ModBlocks.VOID_CRYSTAL_PILLAR);

                        entries.add(ModBlocks.POLISHED_OBSIDIAN);
                        entries.add(ModBlocks.POLISHED_OBSIDIAN_BRICKS);
                        entries.add(ModBlocks.POLISHED_OBSIDIAN_STAIRS);
                        entries.add(ModBlocks.POLISHED_OBSIDIAN_SLAB);


                        //for (Item item : ModRegistry.ITEMS)
                        //    entries.add(item);
                    })
                    .build());


    public static ItemGroup register(String id, ItemGroup tab) {
        return Registry.register(Registries.ITEM_GROUP, Phantasm.makeID(id), tab);
    }

    public static void register() {
        Phantasm.log("Registering ItemGroups for modid : " + Phantasm.MOD_ID);


        if (false) return;
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(ModItems.PREAM_BERRY);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.FALLEN_STAR);

            entries.add(ModBlocks.CRYSTAL_SHARD);
            entries.add(ModBlocks.VOID_CRYSTAL_SHARD);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.CRYSTAL_BLOCK);
            entries.add(ModBlocks.CRYSTAL_TILES);
            entries.add(ModBlocks.CRYSTAL_TILES_STAIRS);
            entries.add(ModBlocks.CRYSTAL_TILES_SLAB);
            entries.add(ModBlocks.CRYSTAL_PILLAR);
            entries.add(ModBlocks.VOID_CRYSTAL_BLOCK);
            entries.add(ModBlocks.VOID_CRYSTAL_TILES);
            entries.add(ModBlocks.VOID_CRYSTAL_PILLAR);

            entries.add(ModBlocks.POLISHED_OBSIDIAN);
            entries.add(ModBlocks.POLISHED_OBSIDIAN_BRICKS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(ModItems.CRYSTALLINE_SHOVEL);
            entries.add(ModItems.CRYSTALLINE_PICKAXE);
            entries.add(ModItems.CRYSTALLINE_AXE);
            entries.add(ModItems.CRYSTALLINE_HOE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(ModItems.CRYSTALLINE_SWORD);
        });
    }
}
