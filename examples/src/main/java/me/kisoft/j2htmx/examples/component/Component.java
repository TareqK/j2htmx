/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.kisoft.j2htmx.examples.component;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import j2html.tags.Tag;

/**
 *
 * @author tareq
 */
public abstract class Component implements Handler {

    @Override
    public void handle(Context ctx) {
        ctx.html(render(ctx));
    }

    protected abstract String render(Context ctx);

}
