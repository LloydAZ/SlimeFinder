package dev.soapy.slimefinder.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import dev.soapy.slimefinder.Slimefinder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SLIMEFINDERGROUP = FabricItemGroupBuilder.build(new Identifier(Slimefinder.MOD_ID, "slimefindergroup"),
            () -> new ItemStack(ModItems.DOWSING_ROD));
}
