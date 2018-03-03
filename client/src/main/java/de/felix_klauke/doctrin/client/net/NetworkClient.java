package de.felix_klauke.doctrin.client.net;

import io.reactivex.Observable;
import org.json.JSONObject;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public interface NetworkClient {

    /**
     * Connect to the server.
     */
    void connect();

    /**
     * Check if the client is connected.
     *
     * @return If the client is connected.
     */
    boolean isConnected();

    /**
     * Disconnect from the server.
     */
    void disconnect();

    /**
     * Get all messages the client receives.
     *
     * @return The observable of the messages.
     */
    Observable<JSONObject> getMessages();

    /**
     * Send the given jon object to the server.
     *
     * @param jsonObject The json object.
     */
    void sendMessage(JSONObject jsonObject);
}
