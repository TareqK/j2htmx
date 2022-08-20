/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.kisoft.j2htmx.examples;

import io.javalin.http.Context;
import static j2html.TagCreator.body;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.main;
import static j2htmx.J2Htmx.withHx;
import static me.kisoft.j2htmx.examples.JokeHeader.jokeHeader;
import static me.kisoft.j2htmx.examples.SidebarComponent.sidebar;

/**
 *
 * @author tareq
 */
public class HomePage {

    private Context ctx;

    private HomePage(Context ctx) {
        this.ctx = ctx;
    }

    private String render() {
        return withHx(body(
                sidebar(),
                main(
                        h1("Hello, World!"),
                        jokeHeader(),
                        jokeHeader(),
                        jokeHeader(),
                        jokeHeader()
                )
        ).withStyle("display:flex;flex-direction:row;")
        ).render();
    }

    public static String homePage(Context ctx) {
        return new HomePage(ctx).render();
    }
}
