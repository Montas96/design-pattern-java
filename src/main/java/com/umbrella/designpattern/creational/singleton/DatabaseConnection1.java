package com.umbrella.designpattern.creational.singleton;

import java.time.Instant;

/**
 * tHIS implémentation IS simple but unfortunately, it's not threadsafe.
 * In a multithreaded context, it's possible that the first two getInstance() may create two instances.
 * So each thread receives a different instance witch does not respect the design pattern constraint.
 */

// make the class final that can not be inherited
public final class DatabaseConnection1 {

    //create an object of DatabaseConnection
    public static DatabaseConnection1 dbConnection;
    private final Instant createdAt = Instant.now();

    //make the constructor private so that this class cannot be instantiated
    //
    private DatabaseConnection1() {
    }

    //Get the only connection available
    public static DatabaseConnection1 getInstance() {
        if (dbConnection == null) {
            dbConnection = new DatabaseConnection1();
        }
        return dbConnection;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void showMessage() {
        System.out.println("DatabaseConnection1 Connection created at " + createdAt + " " + Thread.currentThread().getName());
    }


}
