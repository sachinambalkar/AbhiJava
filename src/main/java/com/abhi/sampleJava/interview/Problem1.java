package com.abhi.sampleJava.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem1 {

    public static void main(String args[]){

        new Problem1().solve();
    }


    public void solve(){
            //method1();
            method2();
    }

    public void method2(){
      String strs=  "It is a long established fact that reader will be distracted by readable content " +
        "of a page when looking at its layout. The point of using Lorem Ipsum is that it has a " +
                "more-or-less normal distribution of letters, as opposed to using 'Content here, content here', " +
                "making it look like readable English. Many desktop publishing packages and webpage editors now use " +
                "Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many websites " +
                "still in their infancy";

      String[] splittedStr=strs.split("\\ ");

    // Itr1 =>
   // System.out.println(Arrays.stream(splittedStr).collect(Collectors.joining(" \n ")) ); ;

        for(int index=0;index<splittedStr.length;index++){

            if(splittedStr[index]=="is"){

            }
            System.out.println(splittedStr[index]);
        }

    }

    public void method1(){
        String str="It is a long established fact that reader will be distracted by readable content " +
                "of a page when looking at its layout. The point of using Lorem Ipsum is that it has a " +
                "more-or-less normal distribution of letters, as opposed to using 'Content here, content here', " +
                "making it look like readable English. Many desktop publishing packages and webpage editors now use " +
                "Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many websites " +
                "still in their infancy.";
        String replaceString="is";
        System.out.println(str.replaceAll("is",""));
    }
}
