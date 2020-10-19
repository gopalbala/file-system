package com.gb.filesystem;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class FileSystemElement {
    private String name;
    private int size;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Directory parent;
    private String owner;
    private boolean isFile;


    public FileSystemElement(Directory parent, String name, String owner, int size) {
        this.parent = parent;
        this.name = name;
        this.owner = owner;
        this.size = size;
    }
}
