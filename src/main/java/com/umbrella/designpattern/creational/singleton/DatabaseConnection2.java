package com.umbrella.designpattern.creational.singleton;

import java.time.Instant;

/**
 * This solution is thread-safe, but it introduces a cost in performance, related to synchronisation of the method,
 */

// make the class final that can not be inherited
public final class DatabaseConnection2 {

    //create an object of DatabaseConnection
    public static DatabaseConnection2 dbConnection;
    private final Instant createdAt = Instant.now();

    //make the constructor private so that this class cannot be instantiated
    //
    private DatabaseConnection2() {
    }

    //Get the only connection available
    public static synchronized DatabaseConnection2 getInstance() {
        if (dbConnection == null) {
            dbConnection = new DatabaseConnection2();
        }
        return dbConnection;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void showMessage() {
        System.out.println("DatabaseConnection2 Connection created at " + createdAt + " " + Thread.currentThread().getName());
    }


}
