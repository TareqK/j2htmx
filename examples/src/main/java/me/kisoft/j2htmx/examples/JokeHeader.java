/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.kisoft.j2htmx.examples;

import io.javalin.http.Context;
import static j2html.TagCreator.h2;
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

    public static String jokeHeader(Context ctx) {
        return new JokeHeader(ctx).render();
    }
}
