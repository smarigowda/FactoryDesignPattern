package org.example.model;

import com.google.inject.Inject;

import javax.inject.Singleton;

@Singleton
public class PC extends Computer {
    String ram;
    String hdd;
    String cpu;

    @Inject
    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }

    @Override
    public void start() {
        System.out.println("Starting PC Computer");
    }
}
