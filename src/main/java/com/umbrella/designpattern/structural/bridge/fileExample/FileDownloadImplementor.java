package com.umbrella.designpattern.structural.bridge.fileExample;

public interface FileDownloadImplementor {
    Object downloadFile(String path);

    boolean storeFile(Object object);
}