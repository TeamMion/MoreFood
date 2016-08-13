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

import teammion.morefood.Items;
import teammion.morefood.Recipes;
import teammion.morefood.util.Registry;

/**
 * Created on 11.08.16 at 14:23
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class ShapedRecipes extends Recipes
{
    @Override
    public void register()
    {
        Registry.addShapedRecipe(
                Items.COCOA_BEAN_GROUND.stack(),
                "AA",
                "AA",
                'A', Items.COCOA_BEAN_ROASTED
        );
        
        Registry.addShapedRecipe(
                Items.CHOCOLATE.stack(),
                "AAA",
                "BCB",
                "AAA",
                'A', Items.COCOA_BEAN_GROUND,
                'B', Items.SUGAR,
                'C', Items.MILK_BUCKET
        );
        
        Registry.addShapedRecipe(
                Items.CHOCOLATE.stack(),
                "ABA",
                "ACA",
                "ABA",
                'A', Items.COCOA_BEAN_GROUND,
                'B', Items.SUGAR,
                'C', Items.MILK_BUCKET
        );
        
        Registry.addShapedRecipe(
                Items.SANDWICH_FISH.stack(),
                "A",
                "B",
                "A",
                'A', Items.BREAD_SLICE,
                'B', Items.COOKED_FISH
        );
        
        Registry.addShapedRecipe(
                Items.SANDWICH_CHICKEN.stack(),
                "A",
                "B",
                "A",
                'A', Items.BREAD_SLICE,
                'B', Items.COOKED_CHICKEN
        );
        
        Registry.addShapedRecipe(
                Items.SANDWICH_PORKCHOP.stack(),
                "A",
                "B",
                "A",
                'A', Items.BREAD_SLICE,
                'B', Items.COOKED_PORKCHOP
        );
        
        Registry.addShapedRecipe(
                Items.SANDWICH_SCHNITZEL.stack(),
                "A",
                "B",
                "A",
                'A', Items.BREAD_SLICE,
                'B', Items.SCHNITZEL
        );
    }
}
