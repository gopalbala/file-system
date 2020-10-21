package com.gb.filesystem;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Directory extends FileSystemElement {
    private Directory parent;
    private List<FileSystemElement> children = new ArrayList<>();

    public Directory(Directory parent, String name, String owner, int size) {
        super(parent, name, owner, size);
    }

    public void addChild(FileSystemElement child) {
        super.setFile(false);
        children.add(child);
    }

    public int getSize() {
        int total = 0;
        for (FileSystemElement fElement : this.getChildren()) {
            total = total + fElement.getSize();
        }
        return total;
    }

    public Directory getDirectory(String dirName) {
        Directory directory = null;
        for (FileSystemElement fs : this.getChildren()) {
            if (fs.getName().contentEquals(dirName) && fs instanceof Directory) {
                directory = (Directory) fs;
            }
        }
        return directory;
    }

    public void getAll() {
        int count = 0;
        for (FileSystemElement FileSystemElement : getChildren()) {
            if (!FileSystemElement.isFile()) {
                System.out.print(FileSystemElement.getName() + "\t");
            } else {
                System.out.print(FileSystemElement.getName() + " ");
            }
            count++;
            if (count == getChildren().size() && !FileSystemElement.isFile()) {
                System.out.println();
            }
        }
        for (FileSystemElement fs : getChildren()) {
            if (!fs.isFile()) {
                fs.getAll();
            }
        }
    }

    public void accept(FileSystemVisitor fileSystemVisitor) {
        fileSystemVisitor.visit(this);
        for (FileSystemElement fileSystemElement : children) {
            fileSystemElement.accept(fileSystemVisitor);
        }
    }
}
