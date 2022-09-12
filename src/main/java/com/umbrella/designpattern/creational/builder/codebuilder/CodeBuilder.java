package com.umbrella.designpattern.creational.builder.codebuilder;

import java.util.HashMap;

public class CodeBuilder {

    private String className;
    private HashMap<String, String> fields;

    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
        System.out.println(cb);
    }

    public CodeBuilder(String className)
    {
        this.className = className;
        fields= new HashMap<>();
    }

    public CodeBuilder addField(String name, String type)
    {
        fields.put(name, type);
        return this;
    }

    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("public class "+ className ).append(System.lineSeparator());
        stringBuilder.append("{" + System.lineSeparator());
        fields.forEach((name, type) -> {
            stringBuilder.append(String.format("  public %s %s;", type, name)).append(System.lineSeparator());
        });
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
