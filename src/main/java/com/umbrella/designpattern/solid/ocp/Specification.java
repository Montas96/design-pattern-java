package com.umbrella.designpattern.solid.ocp;

/** we introduce two new interfaces that are open for extension**/
public interface Specification <T> {
    boolean isSatisfied(T item);
}
