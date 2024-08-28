package org.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JavaNative {
    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Paula", "Alberto", "Paulo");
        Map<Integer, String> namesMap = Map.of(0, "Ana", 1, "Paula", 2, "Alberto", 3, "Paulo" );
        for (String name : names) {
            System.out.println(name);
        }

        for (Map.Entry<Integer, String> nameEntry : namesMap.entrySet()) {
            System.out.println(nameEntry.getKey() + " " + nameEntry.getValue());
        }

        for( Integer key : namesMap.keySet()) {
            System.out.println( key);

            var value = namesMap.get(key);
        }

        for( String value : namesMap.values()) {
            System.out.println(value);
        }



    }
}
