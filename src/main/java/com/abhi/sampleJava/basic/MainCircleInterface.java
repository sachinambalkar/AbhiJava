package com.abhi.sampleJava.basic;

import com.abhi.sampleJava.basic.InterfaceImplementation.AjayCircle;
import com.abhi.sampleJava.basic.InterfaceImplementation.MyCircle;
import com.abhi.sampleJava.basic.InterfaceImplementation.SumitCircle;

public class MainCircleInterface {

    public static void main(String args[]){
        System.out.println("Hello");

        int output = 0;
        int radius=10;

        System.out.println("Format One !!!!!!!");
        formatOne(output,radius);

        System.out.println("Format Two !!!!!!!");
        formatTwo(output,radius);

        System.out.println("Format Three !!!!!!!");
        formatThree(output,radius);
    }

    private static void formatThree(int output, int radius) {

        CircleInterface circleInterface=new AjayCircle();
        output=circleInterface.getAreaOfCircle(radius);
        System.out.println("Ajay's output: "+output);


        circleInterface=new SumitCircle();
        output=circleInterface.getAreaOfCircle(radius);
        System.out.println("Sumit's output: "+output);

        circleInterface=new MyCircle();
        output=circleInterface.getAreaOfCircle(radius);
        System.out.println("MyCircle output: "+output);
    }

    private static void formatTwo(int output, int radius) {

        CircleInterface ajayCircle=new AjayCircle();
        output=ajayCircle.getAreaOfCircle(radius);
        System.out.println("Ajay's output: "+output);


        CircleInterface sumitCircle=new SumitCircle();
        output=sumitCircle.getAreaOfCircle(radius);
        System.out.println("Sumit's output: "+output);

        CircleInterface myCircle=new MyCircle();
        output=myCircle.getAreaOfCircle(radius);
        System.out.println("MyCircle output: "+output);

    }

    private static void formatOne(int output, int radius) {

        AjayCircle ajayCircle=new AjayCircle();
        output=ajayCircle.getAreaOfCircle(radius);
        System.out.println("Ajay's output: "+output);


        SumitCircle sumitCircle=new SumitCircle();
        output=sumitCircle.getAreaOfCircle(radius);
        System.out.println("Sumit's output: "+output);

        MyCircle myCircle=new MyCircle();
        output=myCircle.getAreaOfCircle(radius);
        System.out.println("MyCircle output: "+output);
    }

}
