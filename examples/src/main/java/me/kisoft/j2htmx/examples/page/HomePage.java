/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.kisoft.j2htmx.examples.page;

import me.kisoft.j2htmx.examples.component.Component;
import io.javalin.http.Context;
import static j2html.TagCreator.body;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.head;
import static j2html.TagCreator.html;
import static j2html.TagCreator.main;
import j2html.tags.Tag;
import static j2htmx.J2Htmx.withHtmxImport;
import static me.kisoft.j2htmx.examples.component.ContentComponent.content;
import static me.kisoft.j2htmx.examples.J2HtmlExtentions.withBootstrap;
import static me.kisoft.j2htmx.examples.J2HtmlExtentions.withFullHeight;
import static me.kisoft.j2htmx.examples.component.JokeComponent.jokeHeader;
import static me.kisoft.j2htmx.examples.component.SidebarComponent.sidebar;

/**
 *
 * @author tareq
 */
public class HomePage extends Page {

    public static final String rootPath() {
        return "/";
    }

    @Override
    public String render(Context ctx) {
        return html(
                withBootstrap(
                        withHtmxImport(
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

}
