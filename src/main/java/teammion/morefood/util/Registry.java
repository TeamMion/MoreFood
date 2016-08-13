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

package teammion.morefood.util;

import teammion.morefood.MoreFood;
import teammion.mioncore.util.IItem;

/**
 * Created on 11.08.16 at 14:49
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class Registry extends teammion.mioncore.util.Registry
{
    public static void render(IItem item, int meta, String name)
    {
        render(item, meta, MoreFood.MODID, name);
    }
    
    public static void render(IItem item)
    {
        render(item, 0, item.item().getUnlocalizedName().substring(5));
    }
}
