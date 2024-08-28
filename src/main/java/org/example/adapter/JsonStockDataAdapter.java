package org.example.adapter;

import java.util.List;

public class JsonStockDataAdapter extends StockDataProvider {
    private JsonAnalyticsLibrary adapter;

    public JsonStockDataAdapter(JsonAnalyticsLibrary adapter) {
        this.adapter = adapter;
    }

    @Override
    List<XMLObject> openFile(String filePath) {
        var xmlObjects = adapter.abrirFile(filePath);
        List<XMLObject> list =  xmlObjects.stream()
                .map(
                         json -> {
                             var obj = new JsonStockDataAdapter.JsonXMLAdater();
                             return (XMLObject) obj;
                         }
        ).toList();

        return list;
    }

    public static class JsonXMLAdater implements XMLObject {
        private JsonObject jsonObject;

        public JsonXMLAdater(JsonObject jsonObject) {
            this.jsonObject = jsonObject;
        }

        public JsonXMLAdater() {
        }

        @Override
        public XMLObject getChild(String name) {
            return null;
        }

        @Override
        public XMLObject setChild(String node, XMLObject value) {
            return new JsonXMLAdater(jsonObject.setValue(node, new JsonObjectImpl(value)));
        }

        @Override
        public Object getValue() {
            return jsonObject.getValue();
        }
    }
}
