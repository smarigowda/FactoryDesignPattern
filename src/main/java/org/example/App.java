package org.example;

import org.example.factory.ComputerFactory;
import org.example.model.Computer;
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
        String type = "PC";
        Computer pc;
        pc = ComputerFactory.getComputer("PC");
        // pc should now be an instance of Computer
        assertThat(pc instanceof PC, is(true));
    }
}
