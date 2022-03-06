package Shraddha_EONFWL522059_6772;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class MergeList {


    public static void main(String args[]) {
      
        List hundreads = Arrays.asList(101,102,103);
        List thousands = Arrays.asList(1001,1002,1003);
   
        // merging two list using core Java
        List merged = new ArrayList(hundreads);
        merged.addAll(thousands);
      
        System.out.println("List 1 : " + hundreads);
        System.out.println("List 2 : " + thousands);
        System.out.println("Merged List : " + merged);
      
      
        // another way to merge two list in Java
        // using ListUtils from Apache commons Collection
//        merged = ListUtils.union(hundreads, thousands);
//        System.out.println("Merged List using Apache Commons Collections: " + merged);
      
    }
}
