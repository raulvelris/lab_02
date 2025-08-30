package com.solid.corrected.concreta;

import com.solid.corrected.interfaz.NotificationService;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String type, String recipient, String message) {
        System.out.println("[EMAIL] Tipo: " + type + ", Para: " + recipient + ", Mensaje: " + message);
    }
}