package com.example.finalgradlejetty;

import jakarta.servlet.Filter;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.servlet.ServletMapping;
import org.eclipse.jetty.webapp.WebAppContext;

import javax.servlet.Servlet;
import java.net.URL;

public class App {

    public static void main(String[] args) throws Exception {

        Server server = new Server();
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8080);
        server.setConnectors(new Connector[] {connector});
        ServletHandler servletHandler = new ServletHandler();
        ServletHolder servletHolder = new ServletHolder();
        servletHolder.setName("default");
        servletHolder.setClassName("HelloServlet");

        //servletHandler.addServletWithMapping("HelloServlet", "/");
        servletHandler.addServletWithMapping(servletHolder, "/");

        server.setHandler(servletHandler);
        server.start();
        server.join();
    }
}
