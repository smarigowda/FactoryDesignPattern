package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.example.app.Application;
import org.example.di.AppInjector;

/**
 * Hello Factory!
 *
 */
public class Client
{
    public static void main( String[] args ) throws Exception {
        Injector injector = Guice.createInjector(new AppInjector());
        Application app = injector.getInstance(Application.class);
        app.run();
    }
}
