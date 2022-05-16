package com.example.finalgradlejetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.webapp.WebAppContext;

import javax.servlet.http.HttpServletMapping;

public class App {

    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);
        WebAppContext  context=new WebAppContext();
        context.setContextPath("/hello-servlet");

        server.setHandler(context);
        server.start();
        server.join();
    }
}
