package com.solid.corrected.mock;

import com.solid.corrected.interfaz.NotificationService;
    
public class MockNotificationService implements NotificationService {
    public boolean sent = false;

    @Override
    public void sendNotification(String type, String recipient, String message) {
        sent = true;
        System.out.println("[MOCK NOTIFICATION] " + type + " a " + recipient + ": " + message);
    }

    public boolean wasSent() {
        return sent;
    }
}