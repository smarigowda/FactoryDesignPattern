package org.example.model;

public class PC extends Computer {
    String ram;
    String hdd;
    String cpu;

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
