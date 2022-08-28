/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.kisoft.j2htmx.examples.component;

import io.javalin.http.Context;
import static j2html.TagCreator.a;
import static j2html.TagCreator.div;
import static j2html.TagCreator.li;
import static j2html.TagCreator.span;
import static j2html.TagCreator.ul;
import j2html.tags.DomContent;
import j2html.tags.Tag;
import static j2htmx.J2Htmx.hx;

/**
 *
 * @author tareq
 */
public class SidebarComponent extends Component {
    
    @Override
    public String render(Context ctx) {
        return sidebarContainer(
                sidebarHeader(),
                navList(
                        navItem("Facebook", "https://facebook.com", true),
                        navItem("Twitter", "https://twitter.com", false),
                        navItem("Linkedin", "https://linkedin.com", false)
                )
        ).render();
    }
    
    private Tag sidebarContainer(DomContent... content) {
        return div(content).withClass("d-flex flex-column flex-shrink-0 p-3 text-bg-dark")
                .withStyle("width:280px;");
    }
    
    private Tag sidebarHeader() {
        return a(
                span("Sidebar").withClass("fs-4")
        ).withClass("d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none");
    }
    
    private Tag navItem(String text, String href, boolean active) {
        return li(
                a(text).withClass("nav-link text-white")
                        .withCondClass(active, "active")
                        .withHref(href)
                        .withTarget("_blank")
        ).withClass("nav-item");
    }
    
    private Tag navList(DomContent... content) {
        return ul(content).withClass("nav nav-pills flex-column mb-auto");
    }
    
    public static Tag sidebar() {
        return div().attr(hx.get("/sidebar"))
                .attr(hx.swap("outerHTML"))
                .attr(hx.target("this"))
                .attr(hx.trigger("load"));
    }
    
    public static final String rootPath() {
        return "sidebar";
    }
    
}
