package com.smychko.lsapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class DirectoryPrinter implements CommandLineRunner {

    private final DirectoryReader directoryReader;

    public DirectoryPrinter(DirectoryReader directoryReader) {
        this.directoryReader = directoryReader;
    }

    @Override
    public void run(String... args) throws Exception {

        if (args.length > 0 ) {
            for (String arg : args) {
                File dir = directoryReader.read(arg);

                for (File item : dir.listFiles()) {
                    if (item.isDirectory()) {
                        System.out.println("Каталог: " + item.getName());
                    } else {
                        System.out.println("Файл: " + item.getName());
                    }
                }
            }
        }
    }
}
