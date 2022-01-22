package com.umbrella.designpattern.creational.singleton;

import java.time.Instant;

/**
 * The part that must really be thread safe is the creation of the instance,
 * which corresponds only to the first invocation of the method. It may then be tempting to synchronize only the creation of the instance.
 * The goal is to avoid placing a lock on the class monitor each time the method is invoked. Unfortunately, this solution is not thread-safe.
 * Thread 1 enters the secure block and before the reference created by the constructor is assigned to the instance variable,
 * the scheduler passes control to thread 2 which tests if the instance is null and it is so it goes wait for thread 1's safe block to exit
 * to execute the safe code block in turn. The two threads each get a separate instance.
 */

// make the class final that can not be inherited
public final class DatabaseConnection3 {

    //create an object of DatabaseConnection
    public static DatabaseConnection3 dbConnection;
    private final Instant createdAt = Instant.now();

    //make the constructor private so that this class cannot be instantiated
    private DatabaseConnection3() {
    }

    //Get the only connection available
    public static DatabaseConnection3 getInstance() {
        if (dbConnection == null) {
            synchronized (DatabaseConnection3.class) {
                dbConnection = new DatabaseConnection3();
            }
        }
        return dbConnection;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void showMessage() {
        System.out.println("DatabaseConnection3 Connection created at " + createdAt + " " + Thread.currentThread().getName());
    }


}
