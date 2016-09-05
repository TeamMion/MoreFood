/*
 * Copyright (c) 2016, Stefan Wimmer
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

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created on 05.09.16 at 13:03
 *
 * @author Stefan Wimmer {@literal <stefanwimmer128@gmail.com>}
 */
public class Config
{
    private static boolean DELETE_BREAD_RECIPE;
    private static boolean REGISTER_BREAD_RECIPE;
    
    public static void load(FMLPreInitializationEvent e)
    {
        Configuration config = new Configuration(e.getSuggestedConfigurationFile());
        config.load();
        
        DELETE_BREAD_RECIPE = config.getBoolean("delete_bread_recipe", "ingame", false, "If true the default bread recipe will be deleted");
        REGISTER_BREAD_RECIPE = config.getBoolean("register_bread_recipe", "ingame", true, "If true a custom bread recipe will be registered");
        
        config.save();
    }
    
    public static boolean isDeleteBreadRecipe()
    {
        return DELETE_BREAD_RECIPE;
    }
    
    public static boolean isRegisterBreadRecipe()
    {
        return REGISTER_BREAD_RECIPE;
    }
}
