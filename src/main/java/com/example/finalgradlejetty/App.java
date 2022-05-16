package com.example.finalgradlejetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class App {

    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);
//        WebAppContext context = new WebAppContext();
//        context.setContextPath("/");
//
//        server.setHandler(context);
        server.start();
        System.out.println("Server Started ! ");
        server.join();
    }
}
