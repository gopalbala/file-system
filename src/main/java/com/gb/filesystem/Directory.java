package com.gb.filesystem;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Directory extends FileSystemElement{
    private Directory parent;
    private List<FileSystemElement> children = new ArrayList<>();
    public Directory(Directory parent,String name,String owner,int size){
        super(parent,name,owner,size);
    }

}
