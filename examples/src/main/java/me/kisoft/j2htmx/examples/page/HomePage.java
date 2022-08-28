/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.kisoft.j2htmx.examples.page;

import io.javalin.http.Context;
import static j2html.TagCreator.body;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.head;
import static j2html.TagCreator.html;
import static j2html.TagCreator.main;
import static j2htmx.J2Htmx.withHtmxImport;
import static me.kisoft.j2htmx.examples.layout.Bootstrap.withBootstrap;
import static me.kisoft.j2htmx.examples.component.JokeComponent.jokeHeader;
import static me.kisoft.j2htmx.examples.component.SidebarComponent.sidebar;
import static me.kisoft.j2htmx.examples.layout.Bootstrap.fullHeight;
import static me.kisoft.j2htmx.examples.layout.Bootstrap.container;

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
        return html(withBootstrap(
                withHtmxImport(
                        head()
                )
        ),
                body(
                        fullHeight(
                                main(
                                        sidebar(),
                                        container(
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
