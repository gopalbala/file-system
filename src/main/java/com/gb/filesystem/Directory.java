package com.gb.filesystem;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Directory extends FileSystemElement{
    private Directory parent;
}
