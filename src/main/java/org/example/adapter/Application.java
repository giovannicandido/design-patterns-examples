package org.example.adapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    private List<XMLObject> xmlTree;

    private StockDataProvider stockDataProvider;

    public Application(StockDataProvider stockDataProvider) {
        this.stockDataProvider = stockDataProvider;
    }

    public Map<String, XMLObject> buildMap() {
        List<XMLObject> arquivo1 = stockDataProvider.openFile("arquivo1");
        /// processa arquivo 1
        arquivo1.forEach(System.out::println);
        return new HashMap<>();
    }
}
