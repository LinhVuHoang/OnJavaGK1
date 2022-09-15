package Collection.Map;

import java.util.HashMap;

public class exMap {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        // (int) (Math.random() * 10) gives a random integer from 0-9
        myMap.put("Apples", (int) (Math.random() * 10));

        // Note that although myMap requires an Integer, int will work too
        // this is a feature of Java 5.0 called auto-boxing
        // If an int is required, an Integer will also work: auto-unboxing
        myMap.put("Bananas", (int) (Math.random() * 10));
        myMap.put("Grapes", (int) (Math.random() * 10));

        // Cherries has the same Integer value as Grapes
        myMap.put("Cherries", myMap.get("Grapes"));
        myMap.put("Watermelons", (int) (Math.random() * 10));

        // Since the keys must be unique, there will only be one
        // "Watermelons" key
        myMap.put("Watermelons", (int) (Math.random() * 10));
        // Prints out keys and values
        System.out.println("my map is: " + myMap);
        System.out.println("my map contains 1: "+myMap.containsValue(1));
        System.out.println("my map contains Apples: "+myMap.containsKey("Apples"));
        System.out.println("my map has " +myMap.size() +" keys");
    }
}
