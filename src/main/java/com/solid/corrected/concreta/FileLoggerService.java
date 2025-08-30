package com.solid.corrected.concreta;

import com.solid.corrected.interfaz.Logger;

public class FileLoggerService implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[FILE LOG] " + message);
    }
}