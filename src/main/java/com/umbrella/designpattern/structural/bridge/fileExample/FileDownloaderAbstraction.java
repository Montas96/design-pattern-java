package com.umbrella.designpattern.structural.bridge.fileExample;

public interface FileDownloaderAbstraction {
    Object download(String path);

    boolean store(Object object);
}
