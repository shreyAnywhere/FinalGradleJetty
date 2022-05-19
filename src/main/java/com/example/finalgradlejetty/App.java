package com.example.finalgradlejetty;

import jakarta.servlet.Filter;
import jakarta.servlet.Servlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.servlet.ServletMapping;
import org.eclipse.jetty.webapp.WebAppContext;

import java.net.URL;

public class App {

    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);
        ServletHandler servletHandler = new ServletHandler();

        servletHandler.addServletWithMapping("HelloServlet", "/");

        server.setHandler(servletHandler);
        server.start();
        server.join();
    }
}
