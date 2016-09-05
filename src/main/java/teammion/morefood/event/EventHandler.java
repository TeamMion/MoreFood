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

package teammion.morefood.event;

import net.minecraft.entity.item.EntityItem;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import teammion.morefood.Items;

/**
 * Created on 11.08.16 at 18:00
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class EventHandler
{
    @SubscribeEvent
    public void onDrop(LivingDropsEvent e)
    {
        for (int i = 1; i <= 3; i++)
            e.getDrops().add(new EntityItem(
                    e.getEntity().getEntityWorld(), e.getEntity().posX, e.getEntity().posY, e.getEntity().posZ, Items.STRAWBERRY.stack((int) Math.ceil(i / 2))
            ));
    }
}
