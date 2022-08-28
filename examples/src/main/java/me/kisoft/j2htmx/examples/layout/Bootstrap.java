/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.kisoft.j2htmx.examples.layout;

import static j2html.TagCreator.div;
import static j2html.TagCreator.link;
import static j2html.TagCreator.meta;
import static j2html.TagCreator.script;
import j2html.tags.ContainerTag;
import j2html.tags.DomContent;
import j2html.tags.specialized.HeadTag;
import j2html.tags.specialized.MainTag;

/**
 *
 * @author tareq
 */
public class Bootstrap {

    public static ContainerTag withBootstrapCss(ContainerTag tag) {
        return tag.with(
                link()
                        .withRel("stylesheet")
                        .withHref("https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css")
                        .attr("integrity", "sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx")
                        .attr("crossorigin", "anonymous"))
                .with(
                        meta().withName("viewport")
                                .withContent("width=device-width, initial-scale=1")
                );
    }

    public static ContainerTag withBootstrapJs(ContainerTag tag) {
        return tag.with(
                script().withSrc("https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js")
                        .attr("integrity", "sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa")
                        .attr("crossorigin", "anonymous")
        );
    }

    public static ContainerTag withBootstrap(ContainerTag tag) {
        if (!(tag instanceof HeadTag)) {
            throw new IllegalArgumentException("With bootstrap can only be used on head tags");
        }
        return withBootstrapCss(
                withBootstrapJs(
                        tag
                )
        );
    }

    public static MainTag fullHeight(MainTag tag) {
        return tag.withClass("d-flex flex-nowrap")
                .withStyle("height: 100vh;height: -webkit-fill-available;max-height: 100vh;overflow-x: auto;overflow-y: hidden;");
    }

    public static DomContent container(DomContent... content) {
        return div(content).withClass("container-fluid");
    }
}
