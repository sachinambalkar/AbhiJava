package com.abhi.sampleJava.basic.InterfaceImplementation;

import com.abhi.sampleJava.basic.CircleInterface;

public class AjayCircle implements CircleInterface {


    @Override
    public int getAreaOfCircle(int radius) {
        return (radius * radius) + 10;
    }
}
