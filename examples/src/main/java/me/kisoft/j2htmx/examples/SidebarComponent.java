/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.kisoft.j2htmx.examples;

import io.javalin.http.Context;
import static j2html.TagCreator.a;
import static j2html.TagCreator.aside;
import static j2html.TagCreator.div;
import static j2html.TagCreator.li;
import static j2html.TagCreator.ul;
import j2html.tags.Tag;
import static j2htmx.J2Htmx.hx;

/**
 *
 * @author tareq
 */
public class SidebarComponent {

    private Context ctx;

    private SidebarComponent(Context ctx) {
        this.ctx = ctx;
    }

    private String render() {
        return aside(
                ul(
                        li(
                                a("Facebook").withHref("https://facebook.com")
                                        .withTarget("_blank")
                        ),
                        li(
                                a("Twitter").withHref("https://facebook.com")
                                        .withTarget("_blank")
                        ),
                        li(
                                a("Linkedin").withHref("https://facebook.com")
                                        .withTarget("_blank")
                        )
                )
        ).render();
    }
    
    public static Tag sidebar(){
       return div().attr(hx.get("/sidebar"))
                                .attr(hx.swap("outerHTML"))
                                .attr(hx.target("this"))
                                .attr(hx.trigger("load"));
    }

    public static String sidebarComponent(Context ctx) {
        return new SidebarComponent(ctx).render();
    }
}
