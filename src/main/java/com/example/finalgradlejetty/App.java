package com.example.finalgradlejetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.net.URL;

public class App {

    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);
        WebAppContext webAppContext = new WebAppContext();

        URL webDir = App.class.getClassLoader().getResource("src/main/java/com/example/finalgradlejetty/");
        //context.setResourceBase(webDir.toURI().toString());
        webAppContext.setContextPath("/");
        webAppContext.setDescriptor("src/main/webapp/WEB-INF/web.xml");
        webAppContext.setResourceBase(webDir.toURI().toString());
        webAppContext.setParentLoaderPriority(true);

        server.setHandler(webAppContext);
        server.start();
        server.join();
    }
}
