package com.gb.filesystem;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class FileSystemElement {
    private String name;
    private String size;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String owner;
    private boolean isFile;
}
