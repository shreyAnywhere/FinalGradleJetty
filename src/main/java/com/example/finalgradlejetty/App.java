package com.example.finalgradlejetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.net.URL;

public class App {

    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);
        WebAppContext webAppContext = new WebAppContext();
        URL webDir = App.class.getClassLoader().getResource("C:\\Users\\HP\\IdeaProjects\\FinalGradleJetty\\src\\main\\java\\com\\example\\finalgradlejetty\\HelloServlet.java");
        webAppContext.setResourceBase(webDir.toURI().toString());

        webAppContext.setServer(server);
        webAppContext.setContextPath("/");
        webAppContext.setWar("src/main/webapp");
        webAppContext.addServlet((Class)HelloServlet.class, "/hello-servlet");

        server.setHandler(webAppContext);
        server.start();
        server.join();
    }
}
