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

package org.teammion.morefood.recipes;

import net.minecraft.item.ItemStack;
import org.teammion.morefood.Config;
import org.teammion.morefood.Recipes;
import org.teammion.morefood.util.Registry;
import org.teammion.morefood.Items;

/**
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class ShapelessRecipes extends Recipes
{
    @Override
    public void register()
    {
        Registry.addShapelessRecipe(
                Items.APPLE_CHOCOLATE.stack(),
                Items.APPLE,
                Items.CHOCOLATE_PIECE
        );
        
        Registry.addShapelessRecipe(
                Items.APPLE_SUGAR.stack(),
                Items.APPLE,
                Items.SUGAR
        );
        
        if (Config.isRegisterBreadRecipe())
            Registry.addShapelessRecipe(
                    Items.BREAD_DOUGH.stack(2),
                    Items.FLOUR,
                    Items.FLOUR,
                    Items.FLOUR,
                    Items.FLOUR,
                    Items.WATER_BUCKET
            );
        
        Registry.addShapelessRecipe(
                Items.BREAD_SLICE.stack(2),
                Items.BREAD
        );
        
        Registry.addShapelessRecipe(
                Items.CHOCOLATE_DRINK.stack(),
                Items.COCOA_BEAN_GROUND,
                Items.COCOA_BEAN_GROUND,
                Items.MILK_BOTTLE,
                Items.SUGAR,
                Items.SUGAR
        );
        
        Registry.addShapelessRecipe(
                Items.CHOCOLATE_PIECE.stack(8),
                Items.CHOCOLATE
        );
        
        Registry.addShapelessRecipe(
                Items.FISH_STICK_RAW.stack(),
                Items.EGG,
                Items.FISH,
                Items.FLOUR,
                Items.FLOUR
        );
        
        Registry.addShapelessRecipe(
                Items.FLOUR.stack(2),
                Items.WHEAT
        );
        
        Registry.addShapelessRecipe(
                Items.FRENCH_FRIES_RAW.stack(8),
                Items.POTATO,
                Items.POTATO
        );
        
        Registry.addShapelessRecipe(
                Items.ICE_CREAM_CHOCOLATE.stack(),
                Items.CHOCOLATE_PIECE,
                Items.ICE_CREAM_CONE,
                Items.MILK_BOTTLE,
                Items.SUGAR
        );
        
        Registry.addShapelessRecipe(
                Items.ICE_CREAM_DOUGH.stack(),
                Items.FLOUR,
                new ItemStack(Items.POTIONITEM, 1, 0),
                Items.SUGAR
        );
        
        Registry.addShapelessRecipe(
                Items.ICE_CREAM_STRAWBERRY.stack(),
                Items.ICE_CREAM_CONE,
                Items.MILK_BOTTLE,
                Items.STRAWBERRY,
                Items.SUGAR
        );
        
        Registry.addShapelessRecipe(
                Items.MILK_BOTTLE.stack(4),
                Items.GLASS_BOTTLE,
                Items.GLASS_BOTTLE,
                Items.GLASS_BOTTLE,
                Items.GLASS_BOTTLE,
                Items.MILK_BUCKET
        );
        
        Registry.addShapelessRecipe(
                Items.SCHNITZEL_RAW.stack(),
                Items.EGG,
                Items.FLOUR,
                Items.FLOUR,
                Items.PORKCHOP
        );
        
        Registry.addShapelessRecipe(
                Items.STRAWBERRY_CHOCOLATE.stack(),
                Items.CHOCOLATE_PIECE,
                Items.STRAWBERRY
        );
        
        Registry.addShapelessRecipe(
                Items.STRAWBERRY_SUGAR.stack(),
                Items.STRAWBERRY,
                Items.SUGAR
        );
        
        if (Config.isCanCraftStrawberrySeed())
            Registry.addShapelessRecipe(
                Items.STRAWBERRY_SEED.stack(),
                Items.STRAWBERRY
            );
    }
}
