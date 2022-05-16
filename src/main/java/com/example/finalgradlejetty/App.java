package com.example.finalgradlejetty;

import jakarta.servlet.Servlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;

import javax.servlet.http.HttpServletMapping;
import java.net.URL;

public class App {

    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);
        WebAppContext webAppContext = new WebAppContext();
        //ServletHolder servletHolder = new ServletHolder((Class<? extends Servlet>) HelloServlet.class);
        webAppContext.setServer(server);
        webAppContext.setContextPath("/hello-servlet");
        webAppContext.setWar("src/main/webapp");
        webAppContext.addServlet((Class)HelloServlet.class, "/hello-servlet");

        server.setHandler(webAppContext);
        server.start();
        server.join();
    }
}
