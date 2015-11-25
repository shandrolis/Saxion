package BoekOpdrachten;

import java.util.ArrayList;

/**
 * Created by Joep on 24-Nov-15.
 * Write a method
 * public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
 * that appends one array list after another. For example, if a is
 * 1 4 9 16
 * and b is
 * 9 7 4 9 11
 * then append returns the array list
 * 1 4 9 16 9 7 4 9 11
 */

public class ArrayListMagic {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        a.addAll(b);

        return a;
    }
    /*
     * Alternatively:
     * for(Integer i : b){
     * a.add(i);
     * }
     */

    /**
     * Write a method
     public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
     that merges two array lists, alternating elements from both array lists. If one array
     list is shorter than the other, then alternate as long as you can and then append the
     remaining elements from the longer array list. For example, if a is
     1 4 9 16
     and b is
     9 7 4 9 11
     then merge returns the array list
     1 9 4 7 9 4 16 9 11
     */

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){

        for (Integer i : a){

        }
        return null;
    }

}
