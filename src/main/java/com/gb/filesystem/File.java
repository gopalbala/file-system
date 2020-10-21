package com.gb.filesystem;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class File extends FileSystemElement {

    public File(Directory parent, String name, String owner, int size) {
        super(parent, name, owner, size);
    }

    public void accept(FileSystemVisitor fileSystemVisitor) {
        fileSystemVisitor.visit(this);
    }
}
