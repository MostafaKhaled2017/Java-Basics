/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.*;
/**
 *
 * @author mosta
 */
public class List {
    static ArrayList<String> animals = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        add("dog");
        add("cat");
        remove(1);
        update(0, "Lion");
        printList();
        
    }
    
    static void add(String animal){
        animals.add(animal);
    }
    
    static void remove(int index){
        animals.remove(index);
    }
    
    static void update(int index, String newValue){
        animals.set(index, newValue);
    }
    static void printList(){
        for (String s: animals){
            System.out.println(s + " ");
        }
    }
}
