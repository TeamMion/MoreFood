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

package org.teammion.morefood.api.item;

import net.minecraft.creativetab.CreativeTabs;
import org.teammion.morefood.api.util.IItemNamed;
import org.teammion.morefood.api.util.IStackable;

/**
 * ItemFood base class
 *
 * @author Stefan Wimmer {@literal <stefanwimmer128@gmail.com>}
 */
public class ItemFood extends net.minecraft.item.ItemFood implements IStackable, IItemNamed
{
    /**
     * Creates {@link ItemFood} with Registry/Unlocalized name, amount, saturation and isWolfFood
     * @param name Registry/Unlocalized name
     * @param amount Food regain amount
     * @param saturation Food saturation
     * @param isWolfFood Says if food can be eaten by Wolfs
     */
    public ItemFood(String name, int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        
        setName(name);
    }
    
    /**
     * Creates {@link ItemFood} with Registry/Unlocalized name, amount and isWolfFood
     * @param name Registry/Unlocalized name
     * @param amount Food regain amount
     * @param isWolfFood Says if food can be eaten by Wolfs
     */
    public ItemFood(String name, int amount, boolean isWolfFood)
    {
        this(name, amount, .6f, isWolfFood);
    }
    
    /**
     * Creates {@link ItemFood} with Registry/Unlocalized name and amount
     * @param name Registry/Unlocalized name
     * @param amount Food regain amound
     */
    public ItemFood(String name, int amount)
    {
        this(name, amount, false);
    }
    
    /**
     * Creates {@link ItemFood} with Registry/Unlocalized name, amount, saturation, isWolfFood and CreativeTabs
     * @param name Registry/Unlocalized name
     * @param amount Food regain amound
     * @param saturation Food saturation
     * @param isWolfFood Says if food can be eaten by Wolfs
     * @param creativeTab CreativeTabs
     */
    public ItemFood(String name, int amount, float saturation, boolean isWolfFood, CreativeTabs creativeTab)
    {
        this(name, amount, saturation, isWolfFood);
        
        setCreativeTab(creativeTab);
    }
    
    /**
     * Creates {@link ItemFood} with Registry/Unlocalized name, amount, isWolfFood and CreativeTabs
     * @param name Registry/Unlocalized name
     * @param amount Food regain amound
     * @param isWolfFood Says if food can be eaten by Wolfs
     * @param creativeTab CreativeTabs
     */
    public ItemFood(String name, int amount, boolean isWolfFood, CreativeTabs creativeTab)
    {
        this(name, amount, .6f, isWolfFood, creativeTab);
    }
    
    /**
     * Creates {@link ItemFood} with Registry/Unlocalized name, amount and CreativeTabs
     * @param name Registry/Unlocalized name
     * @param amount Food regain amound
     * @param creativeTab CreativeTabs
     */
    public ItemFood(String name, int amount, CreativeTabs creativeTab)
    {
        this(name, amount, false, creativeTab);
    }
}
