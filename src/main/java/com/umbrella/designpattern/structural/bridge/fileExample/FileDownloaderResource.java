package com.umbrella.designpattern.structural.bridge.fileExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bridge")
public class FileDownloaderResource {

    @GetMapping("/file")
    public void downloadFile() {
        {
            String os = "linux";
            FileDownloaderAbstraction downloader = null;

            switch (os) {
                case "windows":
                    downloader = new FileDownloaderAbstractionImpl(new WindowsFileDownloadImplementor());
                    break;

                case "linux":
                    downloader = new FileDownloaderAbstractionImpl(new LinuxFileDownloadImplementor());
                    break;

                default:
                    System.out.println("OS not supported !!");
            }

            Object fileContent = downloader.download("some path");
            downloader.store(fileContent);
        }
    }
}
