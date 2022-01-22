package com.umbrella.designpattern.creational.singleton;

import java.time.Instant;

/**
 *Double-checked:
 * It consists of retesting if the instance is indeed null after the lock has been set in case another thread has already passed the first test.
 */

// make the class final that can not be inherited
public final class DatabaseConnection4 {

    //create an object of DatabaseConnection
    public static DatabaseConnection4 dbConnection;
    private final Instant createdAt = Instant.now();

    //make the constructor private so that this class cannot be instantiated
    private DatabaseConnection4() {
    }

    //Get the only connection available
    public static DatabaseConnection4 getInstance() {
        if (dbConnection == null) {
            synchronized (DatabaseConnection4.class) {
                if (dbConnection == null) {
                    dbConnection = new DatabaseConnection4();
                }
            }
        }
        return dbConnection;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void showMessage() {
        System.out.println("DatabaseConnection4 Connection created at " + createdAt + " " + Thread.currentThread().getName());
    }


}
