package org.example.adapter;

public class JsonObjectImpl implements JsonObject{
    private XMLObject xmlObject;

    public JsonObjectImpl(XMLObject xmlObject) {
        this.xmlObject = xmlObject;
    }

    public JsonObjectImpl() {
    }

    @Override
    public JsonObject getNode() {
        return null;
    }

    @Override
    public JsonObject setValue(String node, JsonObject value) {
        return null;
    }

    @Override
    public Object getValue() {
        return null;
    }
}
