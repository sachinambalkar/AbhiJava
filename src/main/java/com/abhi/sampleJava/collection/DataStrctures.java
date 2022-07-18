package com.abhi.sampleJava.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class DataStrctures {

    /*
                Set,
                List,
                Map,
                SortedSet,
                SortedMap,
                HashSet,
                TreeSet,
                ArrayList,
                LinkedList,
                Vector,
                Collections,
                Arrays,
                AbstractCollection

     */
    public static void main(String args[]){

        new DataStrctures().startExec();
    }

    private void startExec() {

        understandList();
        understandSet();
        understandMap();

    }

    private void understandMap() {
        int[] nums=new int[]{1,4,6,3,4,6,7,8,9,1,1,1,3,4,6,7};


    }

    private void understandSet() {
        int[] nums=new int[]{1,4,6,3,4,6,7,8,9,1,1,1,3,4,6,7};

    }

    private void understandList() {

        int[] nums=new int[]{1,4,6,3,4,6,7,8,9,1,1,1,3,4,6,7};

        List<Integer>  list1=new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            list1.add(nums[index]);
        }

        printMethod1(list1);
        printMethod2(list1);
        printMethod3(list1);
        printMethod4(list1);
        printMethod5(list1);
    }

    private void printMethod5(List<Integer> list1) {
        System.out.print("Method 5: "+ list1
                                        .stream()
                                        .map(a->a+"  ")
                                        .collect(Collectors.joining())+" \n");
    }

    private void printMethod4(List<Integer> list1) {
        System.out.print("Method 4: ");
        list1.forEach(a->System.out.print(a+"  "));
        System.out.print("\n");
    }

    private void printMethod3(List<Integer> list1) {
        System.out.print("Method 3: ");
        Iterator<Integer> iterator=list1.listIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"  ");
        }
        System.out.print("\n");
    }

    private void printMethod2(List<Integer> list1) {
        System.out.print("Method 2: ");
        for(Integer val:list1){
            System.out.print(val+"  ");
        }
        System.out.print("\n");
    }

    private void printMethod1(List<Integer> list1) {
        System.out.print("Method 1: ");
        for(int index=0;index<list1.size();index++){
            System.out.print(list1.get(index)+"  ");
        }
        System.out.print("\n");
    }
}
