package com.liboru.design.pattern.visitor;

public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }
    abstract public void accept(Visitor visitor);
}
