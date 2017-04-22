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

package org.teammion.morefood.api.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import org.teammion.morefood.api.util.IItemNamed;
import org.teammion.morefood.api.util.IStackable;

/**
 * Block base class
 *
 * @author Stefan Wimmer {@literal <stefanwimmer128@gmail.com>}
 */
public class Block extends net.minecraft.block.Block implements IStackable, IItemNamed
{
    /**
     * Creates {@link Block} with Registry/Unlocalized name and Material
     * @param name Registry/Unlocalized name
     * @param materialIn Material
     */
    public Block(String name, Material materialIn)
    {
        super(materialIn);
        
        setName(name);
    }
    
    /**
     * Creates {@link Block} with Registry/Unlocalized name, Material and MapColor
     * @param name Registry/Unlocalized name
     * @param materialIn Material
     * @param color MapColor
     */
    public Block(String name, Material materialIn, MapColor color)
    {
        super(materialIn, color);
        
        setName(name);
    }
    
    /**
     * Creates {@link Block} with Registry/Unlocalized name, Material and CreativeTabs
     * @param name Registry/Unlocalized name
     * @param materialIn Material
     * @param creativeTab CreativeTabs
     */
    public Block(String name, Material materialIn, CreativeTabs creativeTab)
    {
        this(name, materialIn);
        
        setCreativeTab(creativeTab);
    }
    
    /**
     * Creates {@link Block} with Registry/Unlocalized name, Material, MapColor and CreativeTabs
     * @param name Registry/Unlocalized name
     * @param materialIn Material
     * @param color MapColor
     * @param creativeTab CreativeTabs
     */
    public Block(String name, Material materialIn, MapColor color, CreativeTabs creativeTab)
    {
        this(name, materialIn, color);
        
        setCreativeTab(creativeTab);
    }
}
