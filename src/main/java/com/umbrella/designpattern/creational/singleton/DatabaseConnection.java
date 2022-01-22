package com.umbrella.designpattern.creational.singleton;

import java.time.Instant;

/**
 * This implementation is thread-safe because the Java language specifications require the JVM to have initialized a static variable before its first use.
 */

// make the class final that can not be inherited
public final class DatabaseConnection {

    //create an object of DatabaseConnection
    public static DatabaseConnection dbConnection = new DatabaseConnection();
    private final Instant createdAt = Instant.now();

    //make the constructor private so that this class cannot be instantiated
    //
    private DatabaseConnection() {
    }

    //Get the only connection available
    public static DatabaseConnection getInstance() {
        return dbConnection;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void showMessage() {
        System.out.println("DatabaseConnection Connection created at " + createdAt + " " + Thread.currentThread().getName());
    }


}
