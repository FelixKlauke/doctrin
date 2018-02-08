package de.felix_klauke.doctrin.server.provider;

import de.felix_klauke.doctrin.server.channel.DoctrinServerChannelFactory;
import de.felix_klauke.doctrin.server.channel.DoctrinServerChannelInitializer;
import de.felix_klauke.doctrin.server.connection.DoctrinNettyServerConnection;
import io.netty.bootstrap.ServerBootstrap;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Provider;

import static org.junit.Assert.assertNotNull;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class ServerBootstrapProviderTest {

    private Provider<ServerBootstrap> serverBootstrapProvider;

    @Before
    public void setUp() {
        serverBootstrapProvider = new ServerBootstrapProvider(new DoctrinServerChannelFactory(), new DoctrinServerChannelInitializer(DoctrinNettyServerConnection::new));
    }

    @Test
    public void get() {
        ServerBootstrap serverBootstrap = serverBootstrapProvider.get();

        assertNotNull(serverBootstrap);
    }
}