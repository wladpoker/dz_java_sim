package org.example;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJ = new Object();
    public static void addToHMap(Integer number){
        hMap.put(number, OBJ);
    }

    private static void printConsole(){
        Iterator<Integer> iterator = hMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }

    public static void main(String[] args) {
        addToHMap(0);
        addToHMap(7);
        addToHMap(43);
        addToHMap(13);
        addToHMap(44);
        addToHMap(1);
        addToHMap(9);
        addToHMap(38);
        addToHMap(10);
        addToHMap(50);

        printConsole();
        System.out.println();
    }
}