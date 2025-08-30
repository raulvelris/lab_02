package com.solid.corrected.mock;

import com.solid.corrected.interfaz.Logger;

public class MockLogger implements Logger {
    public String lastMessage = null;

    @Override

    public void log(String message) {
        lastMessage = message;
        System.out.println("[MOCK LOG] " + message);
    }

    public String getLastMessage() {
        return lastMessage;
    }
}