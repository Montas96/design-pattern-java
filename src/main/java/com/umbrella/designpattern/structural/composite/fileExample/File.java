package com.umbrella.designpattern.structural.composite.fileExample;

import java.util.List;

public class File extends AbstractFile {

    private String name;
    private double size;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public List<AbstractFile> getChildren() {
        return null;
    }

    @Override
    public void addFile(AbstractFile file) {

    }

    @Override
    public void removeFile(AbstractFile file) {

    }

    @Override
    public void displayHierarchy() {
        System.out.println("/" + name);
    }
}
