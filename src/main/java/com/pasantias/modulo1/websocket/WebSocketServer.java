package com.pasantias.modulo1.websocket;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

@ServerEndpoint("/websocket")
public class WebSocketServer {

    private static final CopyOnWriteArrayList<Session> sessions = new CopyOnWriteArrayList<>();

    @OnOpen
    public void onOpen(Session session) {
        sessions.add(session);
        System.out.println("Nuevo cliente conectado: " + session.getId());
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("Mensaje recibido de " + session.getId() + ": " + message);
        broadcastMessage(message);
    }

    @OnClose
    public void onClose(Session session) {
        sessions.remove(session);
        System.out.println("Cliente desconectado: " + session.getId());
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        System.err.println("Error en cliente " + session.getId() + ": ");
        throwable.printStackTrace();
    }

    private void broadcastMessage(String message) {
        for (Session session : sessions) {
            try {
                session.getBasicRemote().sendText(message);
            } catch (IOException e) {
                System.err.println("Error al enviar mensaje a " + session.getId() + ": ");
                e.printStackTrace();
            }
        }
    }
}
