package org.example.di;

import com.google.inject.AbstractModule;
import org.example.model.Computer;
import org.example.model.MAC;
import org.example.model.PC;

public class AppInjector extends AbstractModule {
    @Override
    protected void configure() {
        bind(Computer.class).to(MAC.class);
        // bind(Computer.class).to(PC.class);
    }
}
