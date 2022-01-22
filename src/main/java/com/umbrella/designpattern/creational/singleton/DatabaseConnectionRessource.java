package com.umbrella.designpattern.creational.singleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping("/api/database-connection")
public class DatabaseConnectionRessource {

    @GetMapping("/simple-implementation")
    public void getDatabaseConnection() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() { // anonymous class
                DatabaseConnection.getInstance().showMessage();
                DatabaseConnection1.getInstance().showMessage();
                DatabaseConnection2.getInstance().showMessage();
                DatabaseConnection3.getInstance().showMessage();
                DatabaseConnection4.getInstance().showMessage();
                DatabaseConnection5.getInstance().showMessage();
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() { // anonymous class
                DatabaseConnection.getInstance().showMessage();
                DatabaseConnection1.getInstance().showMessage();
                DatabaseConnection2.getInstance().showMessage();
                DatabaseConnection3.getInstance().showMessage();
                DatabaseConnection4.getInstance().showMessage();
                DatabaseConnection5.getInstance().showMessage();
            }
        };
        Collection<Runnable> tasks = new ArrayList<>();
        tasks.add(runnable);
        tasks.add(runnable2);
        tasks.parallelStream().parallel().forEach(runnable1 -> runnable1.run());


    }
}
