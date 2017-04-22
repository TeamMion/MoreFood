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

package org.teammion.morefood.proxy;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.teammion.morefood.Blocks;
import org.teammion.morefood.Config;
import org.teammion.morefood.Recipes;
import org.teammion.morefood.Items;
import org.teammion.morefood.util.Logger;

import java.util.ArrayList;

/**
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent e)
    {
        Logger.info("PreInitialization");
        
        Config.load(e);
        
        Items.register();
        Blocks.register();
    }
    
    public void init(FMLInitializationEvent e)
    {
        Logger.info("Initialization");
        
        Recipes.registerAll();
        
        MinecraftForge.addGrassSeed(Items.STRAWBERRY_SEED.stack(), 9);
    }
    
    public void postInit(FMLPostInitializationEvent e)
    {
        Logger.info("PostInitialization");
        
        if (Config.isDeleteBreadRecipe())
        {
            new ArrayList<>(CraftingManager.getInstance().getRecipeList()).forEach(recipe ->
            {
                if (recipe != null && recipe.getRecipeOutput() != null && recipe.getRecipeOutput().getItem() == Items.BREAD)
                    CraftingManager.getInstance().getRecipeList().remove(recipe);
            });
        }
    }
}
