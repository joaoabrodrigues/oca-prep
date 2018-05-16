package udemy.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingListPerformanceTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(createArray());

        forLoop(list);
        forEachLoop(list);
        iterator(list);
        listIterator(list);
    }

    private static void forLoop(List<String> list){
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
        }

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("For Loop total time = " + totalTime  + " ms");
    }

    private static void forEachLoop(List<String> list){
        long startTime = System.currentTimeMillis();

        for(String i : list) { } // it gets compiled to iterator

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("For Each Loop total time = " + totalTime  + " ms");
    }

    private static void iterator(List<String> list){
        long startTime = System.currentTimeMillis();

        for(Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            String temp = iterator.next();
        }

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Iterator total time = " + totalTime  + " ms");
    }

    private static void listIterator(List<String> list){
        long startTime = System.currentTimeMillis();

        for(ListIterator<String> iterator = list.listIterator(); iterator.hasNext();) {
            String temp = iterator.next();
        }

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("ListIterator total time = " + totalTime + " ms");
    }

    private static String[] createArray(){
        String[] stringArray = new String[10_000_000];

        for(int i = 0; i < stringArray.length; i++){
            stringArray[i] = "Array " + i;
        }

        return stringArray;
    }
}
