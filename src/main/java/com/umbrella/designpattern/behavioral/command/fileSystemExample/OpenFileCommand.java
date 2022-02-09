package com.umbrella.designpattern.behavioral.command.fileSystemExample;

public class OpenFileCommand implements Command {

    private final FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        this.fileSystem.openFile();
    }

}