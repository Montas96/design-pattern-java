package com.umbrella.designpattern.creational.singleton;

import java.time.Instant;

/**
 * This implementation is thread-safe because the Java language specifications require the JVM to have initialized a static variable before its first use.
 */

// make the class final that can not be inherited
public final class DatabaseConnection5 {

    private final Instant createdAt = Instant.now();

    public static DatabaseConnection5 getInstance() {
        return DatabaseConnectionWrapper.instance;
    }

    public void showMessage() {
        System.out.println("DatabaseConnection5 Connection created at " + createdAt + " " + Thread.currentThread().getName());
    }

    private static class DatabaseConnectionWrapper {
        private final static DatabaseConnection5 instance = new DatabaseConnection5();
    }

}


