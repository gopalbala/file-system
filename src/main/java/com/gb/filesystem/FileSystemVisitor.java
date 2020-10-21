package com.gb.filesystem;

public interface FileSystemVisitor {
    void visit(Directory dir);

    void visit(File file);
}
