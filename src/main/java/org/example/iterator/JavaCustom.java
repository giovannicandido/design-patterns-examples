package org.example.iterator;

public class JavaCustom {
    public static void main(String[] args) {
        MinhaCollection minhaCollection = new MinhaCollection();

        for(String value : minhaCollection) {
            System.out.println(value);
        }
    }
}
