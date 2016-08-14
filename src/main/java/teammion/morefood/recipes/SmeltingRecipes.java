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

package teammion.morefood.recipes;

import net.minecraft.item.ItemStack;
import teammion.morefood.Items;
import teammion.morefood.Recipes;
import teammion.morefood.util.Registry;

/**
 * Created on 11.08.16 at 14:23
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class SmeltingRecipes extends Recipes
{
    @Override
    public void register()
    {
        Registry.addSmelting(
                Items.APPLE_CHOCOLATE,
                Items.APPLE_CHOCOLATE_COATED.stack()
        );
        
        Registry.addSmelting(
                Items.APPLE_SUGAR,
                Items.APPLE_GLACED.stack()
        );
        
        Registry.addSmelting(
                Items.BREAD_DOUGH,
                new ItemStack(Items.BREAD)
        );
        
        Registry.addSmelting(
                Items.EGG,
                Items.EGG_BOILED.stack()
        );
        
        Registry.addSmelting(
                Items.FISH_STICK_RAW,
                Items.FISH_STICK.stack()
        );
        
        Registry.addSmelting(
                Items.FRENCH_FRIES_RAW,
                Items.FRENCH_FRIES.stack()
        );
        
        Registry.addSmelting(
                new ItemStack(Items.DYE, 1, 3),
                Items.COCOA_BEAN_ROASTED.stack()
        );
        
        Registry.addSmelting(
                Items.SCHNITZEL_RAW,
                Items.SCHNITZEL.stack()
        );
        
        Registry.addSmelting(
                Items.STRAWBERRY_CHOCOLATE,
                Items.STRAWBERRY_CHOCOLATE_COATED.stack()
        );
        
        Registry.addSmelting(
                Items.STRAWBERRY_SUGAR,
                Items.STRAWBERRY_GLACED.stack()
        );
    }
}
