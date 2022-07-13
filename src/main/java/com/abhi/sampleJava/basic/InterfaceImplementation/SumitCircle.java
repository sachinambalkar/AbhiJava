package com.abhi.sampleJava.basic.InterfaceImplementation;

import com.abhi.sampleJava.basic.CircleInterface;

public class SumitCircle implements CircleInterface {
    @Override
    public int getAreaOfCircle(int radius) {
        return (radius+radius);
    }
}
