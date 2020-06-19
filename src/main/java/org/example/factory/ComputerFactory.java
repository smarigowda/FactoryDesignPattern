package org.example.factory;

import org.example.model.Computer;
import org.example.model.PC;

public class ComputerFactory {
    public static Computer getComputer(String type) throws Exception {
        if("PC".equalsIgnoreCase(type)) {
            return new PC("10GB", "120GB", "3GH");
        }
        throw new Exception("Unknown type of Computer");
    }
}
