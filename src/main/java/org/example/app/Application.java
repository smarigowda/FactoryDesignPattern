package org.example.app;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.example.di.AppInjector;
import org.example.enums.ComputerTypes;
import org.example.factory.ComputerFactory;
import org.example.model.Computer;

public class Application {
    Computer computer;

    @Inject
    public Application(Computer comp) {
        this.computer = comp;
    }
    public void run() throws Exception {
//        System.out.println( "Factory Design Pattern");
//        Computer computer;
//        computer = ComputerFactory.getComputer(ComputerTypes.PC);
        // computer = ComputerFactory.getComputer(ComputerTypes.MAC);

        // assertThat(computer instanceof PC, is(true));
        // assertThat(computer instanceof MAC, is(true));

        computer.start();
    }
}

