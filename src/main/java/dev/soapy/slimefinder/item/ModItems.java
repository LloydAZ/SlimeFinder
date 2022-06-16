package dev.soapy.slimefinder.item;

import dev.soapy.slimefinder.Slimefinder;
import dev.soapy.slimefinder.item.SlimefinderItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new SlimefinderItem(new FabricItemSettings().group(ModItemGroups.SLIMEFINDERGROUP).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Slimefinder.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + Slimefinder.MOD_ID);
    }
}
