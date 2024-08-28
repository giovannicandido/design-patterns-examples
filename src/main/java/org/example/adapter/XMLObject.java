package org.example.adapter;

public interface XMLObject {

    XMLObject getChild(String name);
    XMLObject setChild(String node, XMLObject value);
    Object getValue();
}
