package com.aaroncoplan.todoist.model;

public class Project {

    private final int id;
    private final String name;
    private final int order;
    private final int indent;
    private final int commentCount;

    public Project(int id, String name, int order, int indent, int commentCount) {
        this.id = id;
        this.name = name;
        this.order = order;
        this.indent = indent;
        this.commentCount = commentCount;
    }
}