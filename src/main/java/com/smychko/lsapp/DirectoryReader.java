package com.smychko.lsapp;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class DirectoryReader {

    public File read (String path){
        File dir = new File(path);
        return dir;
    }
}
