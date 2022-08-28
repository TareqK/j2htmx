/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.kisoft.j2htmx.examples.component;

import static j2html.TagCreator.div;
import j2html.tags.DomContent;
import j2html.tags.Tag;

/**
 *
 * @author tareq
 */
public class ContentComponent{

    private ContentComponent() {

    }

    public static DomContent content(DomContent... content) {
        return div(content).withClass("container-fluid");
    }

}
