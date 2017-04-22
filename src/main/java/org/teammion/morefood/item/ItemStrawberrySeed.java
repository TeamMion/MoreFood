/*
 * Copyright (c) 2017, Team Mion
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

package org.teammion.morefood.item;

import org.teammion.morefood.Blocks;
import org.teammion.morefood.CreativeTabs;
import org.teammion.morefood.api.item.ItemSeed;

/**
 * @author Stefan Wimmer <info@stefanwimmer128.eu>
 */
public class ItemStrawberrySeed extends ItemSeed
{
    public ItemStrawberrySeed()
    {
        super("strawberry_seed", Blocks.STRAWBERRY_BUSH, CreativeTabs.MOREFOOD);
    }
}
