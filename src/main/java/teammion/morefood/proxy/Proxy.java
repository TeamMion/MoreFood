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

package teammion.morefood.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import teammion.morefood.util.Logger;

/**
 * Created on 11.08.16 at 14:09
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class Proxy
{
    public static final String SERVER = "teammion.morefood.proxy.CommonProxy";
    public static final String CLIENT = "teammion.morefood.proxy.ClientProxy";
    
    public void preInit(FMLPreInitializationEvent e)
    {
        Logger.info("PreInitialization");
    }
    
    public void init(FMLInitializationEvent e)
    {
        Logger.info("Initialization");
    }
    
    public void postInit(FMLPostInitializationEvent e)
    {
        Logger.info("PostInitialization");
    }
}
