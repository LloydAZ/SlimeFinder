package dev.soapy.slimefinder.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.random.ChunkRandom;

public class SlimefinderItem extends Item
{
    public SlimefinderItem(Settings settings) {
        super(settings);
    }
    //public SlimefinderItem()
    //{
    //    super(new FabricItemSettings().maxCount(1));
    //}

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient)
        {
            ChunkPos chunkPos = new ChunkPos(user.getBlockPos());
            boolean slimeChunk = ChunkRandom.getSlimeRandom(chunkPos.x, chunkPos.z, ((StructureWorldAccess)world).getSeed(), 987234911L).nextInt(10) == 0;

            if(slimeChunk)
            {
                user.sendMessage(new TranslatableText("item.slimefinder.yes"), false);
            }
            else
            {
                user.sendMessage(new TranslatableText("item.slimefinder.no"), false);
            }
        }

        return TypedActionResult.success(user.getStackInHand(hand));
    }
}