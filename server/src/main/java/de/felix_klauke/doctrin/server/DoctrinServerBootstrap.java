package de.felix_klauke.doctrin.server;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.felix_klauke.doctrin.server.config.DoctrinServerConfig;
import de.felix_klauke.doctrin.server.module.DoctrinServerModule;

/**
 * The main bootstrap class.
 *
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class DoctrinServerBootstrap {

    /**
     * The entry method of the JVM.
     *
     * @param args The cli arguments.
     */
    public static void main(String[] args) {
        DoctrinServerConfig doctrinServerConfig = new DoctrinServerConfig("0.0.0.0", 8085);

        Injector injector = Guice.createInjector(new DoctrinServerModule(doctrinServerConfig));
        DoctrinServerApplication application = injector.getInstance(DoctrinServerApplication.class);
        application.initialize();
    }
}
