package org.example.factory;

import org.example.enums.ComputerTypes;
import org.example.model.Computer;
import org.example.model.MAC;
import org.example.model.PC;

public class ComputerFactory {
    public static Computer getComputer(ComputerTypes type) throws Exception {
        if(type.equals(ComputerTypes.PC)) {
            return new PC();
        } else if(type.equals(ComputerTypes.MAC)) {
            return new MAC();
        }
        throw new Exception("Unknown type of Computer");
    }
}
