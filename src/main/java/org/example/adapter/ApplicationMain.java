package org.example.adapter;

public class ApplicationMain {
    public static void main(String[] args) {
        var stockDataProvider = new StockDataProvider();
        var application1 = new Application(stockDataProvider);

        var jsonAnalytics = new JsonAnalyticsLibrary();
        var adapter = new JsonStockDataAdapter(jsonAnalytics);
        var application2 = new Application(adapter);
    }
}
