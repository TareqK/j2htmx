/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.kisoft.j2htmx.examples;

import io.javalin.http.Context;
import static me.kisoft.j2htmx.examples.HomePage.homePage;

/**
 *
 * @author tareq
 */
public class HomeController {

    public static final String rootPath() {
        return "/";
    }

    public static final void index(Context ctx) {
        ctx.html(homePage(ctx));
    }
}
