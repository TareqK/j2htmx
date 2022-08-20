/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.kisoft.j2htmx.examples;

import io.javalin.http.Context;
import static me.kisoft.j2htmx.examples.SidebarComponent.sidebar;
import static me.kisoft.j2htmx.examples.SidebarComponent.sidebarComponent;

/**
 *
 * @author tareq
 */
public class SidebarController {
 
    public static final String rootPath(){
        return "sidebar";
    }
    
    public static void index(Context ctx){
        ctx.html(sidebarComponent(ctx));
    }
}
