package com.umbrella.designpattern.structural.proxy.cachingProxyExample;


import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
