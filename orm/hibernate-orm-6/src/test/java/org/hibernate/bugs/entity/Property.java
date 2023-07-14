package org.hibernate.bugs.entity;

public interface Property<T> {

    String getName();

    T getValue();
}