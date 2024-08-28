package org.example.adapter;

public interface JsonObject {

    JsonObject getNode();
    JsonObject setValue(String node, JsonObject value);
    Object getValue();
}
