package com.gb.filesystem;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
public class FileSystem {
    private Directory directory;
    private Directory current;
    private Directory root;
    private static FileSystem fs = null;
    private boolean isFile;

    private FileSystem() {
        this.directory = new Directory(null, "root", "admin", 0);
    }

    public static FileSystem getFileSystem() {
        if (fs == null) {
            fs = new FileSystem();
        }
        return fs;
    }

    public List<FileSystemElement> getChildren(Directory current){
        return current.getChildren();
    }

    public List<FileSystemElement> sort(Directory dir, Comparator<FileSystemElement> c){
        List<FileSystemElement> ar = this.getChildren(dir);
        Collections.sort(ar,c);
        return ar;
    }
}
