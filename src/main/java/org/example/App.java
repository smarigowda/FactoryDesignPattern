package org.example;

import org.example.enums.ComputerTypes;
import org.example.factory.ComputerFactory;
import org.example.model.Computer;
import org.example.model.MAC;
import org.example.model.PC;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Hello Factory!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        System.out.println( "Factory Design Pattern");
        Computer computer;
        // computer = ComputerFactory.getComputer(ComputerTypes.PC);
        computer = ComputerFactory.getComputer(ComputerTypes.MAC);

//        assertThat(computer instanceof PC, is(true));
        assertThat(computer instanceof MAC, is(true));
    }
}
