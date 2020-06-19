package org.example;

import org.example.app.Application;
import org.example.enums.ComputerTypes;
import org.example.factory.ComputerFactory;
import org.example.model.Computer;
import org.example.model.MAC;
import org.example.model.PC;


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
