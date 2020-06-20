package org.example;

import org.example.enums.ComputerTypes;
import org.example.factory.ComputerFactory;
import org.example.model.Computer;

/**
 * Hello Factory!
 *
 */

public class ClientUsingFactory {
    public static void main(String[] args) throws Exception {
        Computer computer;
//        computer = ComputerFactory.getComputer(ComputerTypes.MAC);
        computer = ComputerFactory.getComputer(ComputerTypes.PC);
        computer.start();
    }
}
