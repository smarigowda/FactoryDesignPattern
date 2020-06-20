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
        this.computer.start();
        System.out.println("RAM = " + this.computer.getRAM());
        System.out.println("HDD = " + this.computer.getHDD());
        System.out.println("CPU = " + this.computer.getCPU());
    }
}

