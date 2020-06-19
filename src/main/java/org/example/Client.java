package org.example;

import org.example.app.Application;

/**
 * Hello Factory!
 *
 */
public class Client
{
    public static void main( String[] args ) throws Exception {
        Application app = new Application();
        app.run();
    }
}
