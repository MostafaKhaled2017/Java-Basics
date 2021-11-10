/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapexample;

import java.util.*;

/**
 *
 * @author mosta
 */
public class MapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "Second");
        map.put("3", "Third");
        map.put("4", "first");
        map.put("5", "first");
        checkUniqueness(map);

    }
    
    static void checkUniqueness(Map<String, String> map) {
        Collection<String> values = map.values();
        Set<String> set = new HashSet<>(values);
        int nonUniqueValues = map.size() - set.size();
        if (nonUniqueValues == 0) {
            System.out.println("The map contains only unique values");
        } else if (nonUniqueValues > 0) {
            System.out.println("The map contains " + nonUniqueValues + " non-unique value(s)");
        } else {
            System.out.println("Error: something went wrong");
        }
    }
}
