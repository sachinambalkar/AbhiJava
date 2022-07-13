package com.abhi.sampleJava.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SampleList {


    public static void main(String args[]){

        List<Integer>  list= Arrays.asList(new Integer[]{1,5,4,3,2,7,8,9,3});


        //Sort
      for(int index=0;index<list.size();index++){
          System.out.println(" "+index+" => "+list.get(index));
      }

      //https://www.geeksforgeeks.org/bubble-sort/
       //Implement bubble sort

        //Collections.sort(list);
      System.out.println(list.stream().map(a->" "+a+" ").collect(Collectors.joining(",")));


    }
}
