package com.umbrella.designpattern.structural.composite.fileExample;

import java.util.ArrayList;
import java.util.List;

public class Directory extends AbstractFile{

    private String name;

    private double size;

    private List<AbstractFile> files = new ArrayList<>();

    public Directory(String name, double size, List<AbstractFile> files) {
        this.name = name;
        this.size = size;
        this.files = files;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSize() {
        files.forEach(file -> size += file.getSize());
        return size;
    }

    @Override
    public List<AbstractFile> getChildren() {
        return files;
    }

    @Override
    public void addFile(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void removeFile(AbstractFile file) {
        file.removeFile(file);
    }

    @Override
    public void displayHierarchy() {
        System.out.println("/"+name);
        files.forEach(abstractFile -> abstractFile.displayHierarchy());

    }
}
