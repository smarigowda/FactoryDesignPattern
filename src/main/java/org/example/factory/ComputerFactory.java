package org.example.factory;

import org.example.enums.ComputerTypes;
import org.example.model.Computer;
import org.example.model.MAC;
import org.example.model.PC;

public class ComputerFactory {
    public static Computer getComputer(ComputerTypes type) throws Exception {
        if(type.equals(ComputerTypes.PC)) {
            return new PC("10GB", "120GB", "3GH");
        } else if(type.equals(ComputerTypes.MAC)) {
            return new MAC("16Gb", "250GB", "5GH");
        }
        throw new Exception("Unknown type of Computer");
    }
}
