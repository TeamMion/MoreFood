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

package org.teammion.morefood.util;

import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;
import org.teammion.morefood.api.MoreFoodAPI;

/**
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class Logger
{
    public static void log(Level level, String msg)
    {
        FMLLog.log(MoreFoodAPI.MODID, level, msg);
    }
    
    public static void info(String msg)
    {
        log(Level.INFO, msg);
    }
    
    public static void warn(String msg)
    {
        log(Level.WARN, msg);
    }
    
    public static void error(String msg)
    {
        log(Level.ERROR, msg);
    }
}
