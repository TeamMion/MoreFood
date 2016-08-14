/*
 * Copyright (c) 2016, Team Mion
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package teammion.morefood.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import teammion.mioncore.block.BlockCropsRightClickHarvest;
import teammion.morefood.Items;
import teammion.mioncore.block.BlockCrops;

import javax.annotation.Nullable;

/**
 * Created on 13.08.16 at 17:50
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class BlockStrawberryBush extends BlockCropsRightClickHarvest
{
    public BlockStrawberryBush()
    {
        super("strawberry_bush", Items.STRAWBERRY, 4);
    }
    
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return (new AxisAlignedBB[]
        {
            new AxisAlignedBB(0d, 0d, 0d, 1d, .0625d, 1d),
            new AxisAlignedBB(0d, 0d, 0d, 1d, .25d, 1d),
            new AxisAlignedBB(0d, 0d, 0d, 1d, .4375d, 1d),
            new AxisAlignedBB(0d, 0d, 0d, 1d, .625d, 1d),
            new AxisAlignedBB(0d, 0d, 0d, 1d, .875d, 1d),
            new AxisAlignedBB(0d, 0d, 0d, 1d, .875d, 1d),
            new AxisAlignedBB(0d, 0d, 0d, 1d, .875d, 1d),
            new AxisAlignedBB(0d, 0d, 0d, 1d, .875d, 1d)
        })[getAge(state)];
    }
}
