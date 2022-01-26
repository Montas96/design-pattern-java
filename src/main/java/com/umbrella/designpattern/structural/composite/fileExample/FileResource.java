package com.umbrella.designpattern.structural.composite.fileExample;

import com.umbrella.designpattern.structural.composite.employeeExample.Accountant;
import com.umbrella.designpattern.structural.composite.employeeExample.BankManager;
import com.umbrella.designpattern.structural.composite.employeeExample.Cashier;
import com.umbrella.designpattern.structural.composite.employeeExample.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/composite")
public class FileResource {

    @GetMapping("/files")
    public void draw() {
        File file = new File("doc.txt");
        File file1 = new File("doc1.txt");
        List<AbstractFile> files = new ArrayList<>();
        files.add(file);
        files.add(file1);
        Directory user = new Directory("user",23, files);
        List<AbstractFile> homeFiles = new ArrayList<>();
        homeFiles.add(user);
        File file3 = new File("doc3.txt");
        homeFiles.add(file3);
        Directory home = new Directory("home",3343, homeFiles);
        Directory etc = new Directory("etc",3343, new ArrayList<>());
        List<AbstractFile> rootFiles = new ArrayList<>();
        rootFiles.add(home);
        rootFiles.add(etc);
        Directory root = new Directory("root",3343, rootFiles);
        root.displayHierarchy();

    }
}
