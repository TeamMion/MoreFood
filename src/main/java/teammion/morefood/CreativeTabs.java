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

package teammion.morefood;

import net.minecraft.item.Item;

/**
 * Created on 11.08.16 at 17:41
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public abstract class CreativeTabs extends net.minecraft.creativetab.CreativeTabs
{
    public static final CreativeTabs MOREFOOD = new CreativeTabs("tm-morefood")
    {
        @Override
        public Item getTabIconItem()
        {
            return Items.STRAWBERRY;
        }
    };
    
    public CreativeTabs(String label)
    {
        super(label);
    }
    
    public CreativeTabs(int index, String label)
    {
        super(index, label);
    }
}
