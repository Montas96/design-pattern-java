package com.umbrella.designpattern.structural.composite.fileExample;

import java.util.List;

public abstract class AbstractFile {

    public abstract String getName();

    public abstract double getSize();

    public abstract List<AbstractFile> getChildren();

    public abstract void addFile(AbstractFile file);

    public abstract void removeFile(AbstractFile file);

    public abstract void displayHierarchy();



}
