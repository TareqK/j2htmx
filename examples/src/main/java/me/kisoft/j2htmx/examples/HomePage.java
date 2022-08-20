/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.kisoft.j2htmx.examples;

import io.javalin.http.Context;
import static j2html.TagCreator.body;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.head;
import static j2html.TagCreator.html;
import static j2html.TagCreator.main;
import static j2htmx.J2Htmx.withHx;
import static me.kisoft.j2htmx.examples.ContentComponent.content;
import static me.kisoft.j2htmx.examples.J2HtmlExtentions.withBootstrap;
import static me.kisoft.j2htmx.examples.J2HtmlExtentions.withFullHeight;
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
        return html(
                withBootstrap(
                        withHx(
                                head()
                        )
                ),
                body(
                        withFullHeight(
                                main(
                                        sidebar(),
                                        content(
                                                h1("Hello, World!"),
                                                jokeHeader(),
                                                jokeHeader(),
                                                jokeHeader(),
                                                jokeHeader()
                                        )
                                )
                        )
                )
        ).render();
    }

    public static String homePage(Context ctx) {
        return new HomePage(ctx).render();
    }
}
