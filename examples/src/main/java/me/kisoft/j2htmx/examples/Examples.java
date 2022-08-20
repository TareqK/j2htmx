/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package me.kisoft.j2htmx.examples;

import io.javalin.Javalin;

/**
 *
 * @author tareq
 */
public class Examples {

    public static void main(String[] args) {
        Javalin app = Javalin.create();
        app.get(HomeController.rootPath(), HomeController::index);
        app.get(JokeController.rootPath(), JokeController::index);
        app.get(SidebarController.rootPath(),SidebarController::index);
        app.start(8080);
    }
}
