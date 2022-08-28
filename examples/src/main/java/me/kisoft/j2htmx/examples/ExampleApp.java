/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package me.kisoft.j2htmx.examples;

import me.kisoft.j2htmx.examples.page.HomePage;
import me.kisoft.j2htmx.examples.component.SidebarComponent;
import me.kisoft.j2htmx.examples.component.JokeComponent;
import io.javalin.Javalin;

/**
 *
 * @author tareq
 */
public class ExampleApp {

    public static void main(String[] args) {
        Javalin app = Javalin.create();
        app.get(HomePage.rootPath(), ctx -> new HomePage().handle(ctx));
        app.get(JokeComponent.rootPath(), ctx -> new JokeComponent().handle(ctx));
        app.get(SidebarComponent.rootPath(), ctx -> new SidebarComponent().handle(ctx));
        app.start(8080);
    }
}
