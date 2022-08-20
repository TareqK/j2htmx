/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.kisoft.j2htmx.examples;

import io.javalin.http.Context;
import static j2html.TagCreator.button;
import static j2html.TagCreator.div;
import static j2html.TagCreator.h2;
import j2html.tags.DomContent;
import j2html.tags.Tag;
import static j2htmx.J2Htmx.hx;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tareq
 */
public class JokeHeader {

    private Context ctx;

    private JokeHeader(Context ctx) {
        this.ctx = ctx;
    }

    private String render() {
        return h2(RandomStringUtils.randomAlphabetic(30)).render();
    }

    public static Tag jokeHeader() {
        String randomId = RandomStringUtils.randomAlphabetic(15);
        return div(
                div().withId(randomId),
                button().withText("Click for a new Joke")
                        .attr(hx.get(JokeController.rootPath()))
                        .attr(hx.target("#" + randomId)
                        )
        );
    }

    public static String jokeHeader(Context ctx) {
        return new JokeHeader(ctx).render();
    }
}
