package com.pasantias.modulo1.websocket;

import javax.websocket.*;
import java.net.URI;
import java.util.Scanner;

@ClientEndpoint
public class WebSocketClient {

    private static Session session;

    @OnOpen
    public void onOpen(Session session) {
        WebSocketClient.session = session;
        System.out.println("Conectado al servidor WebSocket");
    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println("Mensaje recibido del servidor: " + message);
    }

    public static void main(String[] args) {
        try {
            URI uri = new URI("ws://localhost:8080/websocket"); // URL del servidor WebSocket
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
            session = container.connectToServer(WebSocketClient.class, uri);

            // Simulación de envío de datos desde la Tierra
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enviar mensaje a la nave: ");
                String message = scanner.nextLine();
                session.getBasicRemote().sendText(message);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
