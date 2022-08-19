/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.kisoft.j2htmx.examples;

import io.javalin.http.Context;
import static j2html.TagCreator.body;
import static j2html.TagCreator.button;
import static j2html.TagCreator.div;
import static j2html.TagCreator.h1;
import static j2htmx.J2Htmx.hx;
import static j2htmx.J2Htmx.withHx;

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
        return withHx(
                body(
                        h1("Hello, World!"),
                        div().withId("joke-container"),
                        button().withText("Click for a new Joke")
                                .attr(hx.get(JokeController.rootPath()))
                                .attr(hx.target("#joke-container"))
                )
        ).render();
    }

    public static String homePage(Context ctx) {
        return new HomePage(ctx).render();
    }
}
