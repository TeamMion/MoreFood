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

import teammion.mioncore.api.item.*;
import teammion.morefood.item.*;
import teammion.morefood.util.Registry;

/**
 * Created on 11.08.16 at 14:19
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class Items extends net.minecraft.init.Items
{
    public static final Item APPLE_CHOCOLATE = item("apple_chocolate");
    public static final ItemFood APPLE_CHOCOLATE_COATED = itemFood("apple_chocolate_coated", 8);
    public static final ItemFood APPLE_GLACED = itemFood("apple_glaced", 6);
    public static final Item APPLE_SUGAR = item("apple_sugar");
    public static final Item BREAD_DOUGH = item("bread_dough");
    public static final Item BREAD_SLICE = item("bread_slice");
    public static final ItemFood CHOCOLATE = itemFood("chocolate", 8);
    public static final ItemDrink CHOCOLATE_DRINK = itemDrink("chocolate_drink", 4);
    public static final ItemFood CHOCOLATE_PIECE = itemFood("chocolate_piece", 1);
    public static final Item COCOA_BEAN_GROUND = item("cocoa_bean_ground");
    public static final Item COCOA_BEAN_ROASTED = item("cocoa_bean_roasted");
    public static final ItemFood EGG_BOILED = itemFood("egg_boiled", 3);
    public static final ItemFood FISH_STICK = itemFood("fish_stick", 6);
    public static final Item FISH_STICK_RAW = item("fish_stick_raw");
    public static final Item FLOUR = item("flour");
    public static final ItemFood FRENCH_FRIES = itemFood("french_fries", 6);
    public static final Item FRENCH_FRIES_RAW = item("french_fries_raw");
    public static final ItemFood ICE_CREAM_CHOCOLATE = itemFood("ice_cream_chocolate", 6);
    public static final Item ICE_CREAM_CONE = item("ice_cream_cone");
    public static final Item ICE_CREAM_DOUGH = item("ice_cream_dough");
    public static final ItemFood ICE_CREAM_STRAWBERRY = itemFood("ice_cream_strawberry", 6);
    public static final ItemMilkBottle MILK_BOTTLE = new ItemMilkBottle();
    public static final ItemFood SANDWICH_CHICKEN = itemFood("sandwich_chicken", 5);
    public static final ItemFood SANDWICH_FISH = itemFood("sandwich_fish", 5);
    public static final ItemFood SANDWICH_PORKCHOP = itemFood("sandwich_porkchop", 5);
    public static final ItemFood SANDWICH_SCHNITZEL = itemFood("sandwich_schnitzel", 5);
    public static final ItemFood SCHNITZEL = itemFood("schnitzel", 4);
    public static final Item SCHNITZEL_RAW = item("schnitzel_raw");
    public static final ItemStrawberry STRAWBERRY = new ItemStrawberry();
    public static final Item STRAWBERRY_CHOCOLATE = item("strawberry_chocolate");
    public static final ItemFood STRAWBERRY_CHOCOLATE_COATED = itemFood("strawberry_chocolate_coated", 8);
    public static final ItemFood STRAWBERRY_GLACED = itemFood("strawberry_glaced", 6);
    public static final Item STRAWBERRY_SUGAR = item("strawberry_sugar");
    
    public static void register()
    {
        Registry.register(APPLE_CHOCOLATE);
        Registry.register(APPLE_CHOCOLATE_COATED);
        Registry.register(APPLE_GLACED);
        Registry.register(APPLE_SUGAR);
        Registry.register(BREAD_DOUGH);
        Registry.register(BREAD_SLICE);
        Registry.register(CHOCOLATE);
        Registry.register(CHOCOLATE_DRINK);
        Registry.register(CHOCOLATE_PIECE);
        Registry.register(COCOA_BEAN_GROUND);
        Registry.register(COCOA_BEAN_ROASTED);
        Registry.register(EGG_BOILED);
        Registry.register(FISH_STICK);
        Registry.register(FISH_STICK_RAW);
        Registry.register(FLOUR);
        Registry.register(FRENCH_FRIES);
        Registry.register(FRENCH_FRIES_RAW);
        Registry.register(ICE_CREAM_CHOCOLATE);
        Registry.register(ICE_CREAM_DOUGH);
        Registry.register(ICE_CREAM_CONE);
        Registry.register(ICE_CREAM_STRAWBERRY);
        Registry.register(MILK_BOTTLE);
        Registry.register(SANDWICH_CHICKEN);
        Registry.register(SANDWICH_FISH);
        Registry.register(SANDWICH_PORKCHOP);
        Registry.register(SANDWICH_SCHNITZEL);
        Registry.register(SCHNITZEL);
        Registry.register(SCHNITZEL_RAW);
        Registry.register(STRAWBERRY);
        Registry.register(STRAWBERRY_CHOCOLATE);
        Registry.register(STRAWBERRY_CHOCOLATE_COATED);
        Registry.register(STRAWBERRY_GLACED);
        Registry.register(STRAWBERRY_SUGAR);
    }
    
    public static void registerModel()
    {
        Registry.registerModel(APPLE_CHOCOLATE);
        Registry.registerModel(APPLE_CHOCOLATE_COATED);
        Registry.registerModel(APPLE_GLACED);
        Registry.registerModel(APPLE_SUGAR);
        Registry.registerModel(BREAD_DOUGH);
        Registry.registerModel(BREAD_SLICE);
        Registry.registerModel(CHOCOLATE);
        Registry.registerModel(CHOCOLATE_DRINK);
        Registry.registerModel(CHOCOLATE_PIECE);
        Registry.registerModel(COCOA_BEAN_GROUND);
        Registry.registerModel(COCOA_BEAN_ROASTED);
        Registry.registerModel(EGG_BOILED);
        Registry.registerModel(FISH_STICK);
        Registry.registerModel(FISH_STICK_RAW);
        Registry.registerModel(FLOUR);
        Registry.registerModel(FRENCH_FRIES);
        Registry.registerModel(FRENCH_FRIES_RAW);
        Registry.registerModel(ICE_CREAM_CHOCOLATE);
        Registry.registerModel(ICE_CREAM_DOUGH);
        Registry.registerModel(ICE_CREAM_CONE);
        Registry.registerModel(ICE_CREAM_STRAWBERRY);
        Registry.registerModel(MILK_BOTTLE);
        Registry.registerModel(SANDWICH_CHICKEN);
        Registry.registerModel(SANDWICH_FISH);
        Registry.registerModel(SANDWICH_PORKCHOP);
        Registry.registerModel(SANDWICH_SCHNITZEL);
        Registry.registerModel(SCHNITZEL);
        Registry.registerModel(SCHNITZEL_RAW);
        Registry.registerModel(STRAWBERRY);
        Registry.registerModel(STRAWBERRY_CHOCOLATE);
        Registry.registerModel(STRAWBERRY_CHOCOLATE_COATED);
        Registry.registerModel(STRAWBERRY_GLACED);
        Registry.registerModel(STRAWBERRY_SUGAR);
    }
    
    private static Item item(String name)
    {
        return new Item(name, CreativeTabs.MOREFOOD);
    }
    
    private static ItemFood itemFood(String name, int amount)
    {
        return new ItemFood(name, amount, CreativeTabs.MOREFOOD);
    }
    
    private static ItemDrink itemDrink(String name, int amount)
    {
        return new ItemDrink(name, amount, CreativeTabs.MOREFOOD);
    }
}
