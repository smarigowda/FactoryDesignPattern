package org.example.app;

import org.example.enums.ComputerTypes;
import org.example.factory.ComputerFactory;
import org.example.model.Computer;

public class Application {
    public void run() throws Exception {
        System.out.println( "Factory Design Pattern");
        Computer computer;
        computer = ComputerFactory.getComputer(ComputerTypes.PC);
        // computer = ComputerFactory.getComputer(ComputerTypes.MAC);

        // assertThat(computer instanceof PC, is(true));
        // assertThat(computer instanceof MAC, is(true));

        computer.start();
    }
}

