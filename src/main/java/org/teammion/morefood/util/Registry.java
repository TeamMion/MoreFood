/*
 * Copyright (c) 2016 - 2017, Team Mion
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

package org.teammion.morefood.util;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.teammion.morefood.api.MoreFoodAPI;
import org.teammion.morefood.api.util.IItem;

/**
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class Registry extends org.teammion.morefood.api.util.Registry
{
    @SideOnly(Side.CLIENT)
    public static void registerModel(IItem item, int meta)
    {
        regiserModel(item, meta, MoreFoodAPI.MODID + ":" + item.item().getUnlocalizedName().substring(5));
    }
    
    @SideOnly(Side.CLIENT)
    public static void registerModel(IItem item)
    {
        registerModel(item, 0);
    }
}
