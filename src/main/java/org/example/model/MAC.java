package org.example.model;

import org.example.enums.ComputerTypes;

public class MAC extends Computer {
    String ram;
    String hdd;
    String cpu;

    public MAC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
