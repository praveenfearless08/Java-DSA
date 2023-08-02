package com.praveen.oops.inheritance;

public class BoxWeight extends Box {
    double w;
    public BoxWeight(){
        this.w = -1;

    }
    public BoxWeight(double l,double b, double h, double w){
     super(l, b, h);
    }

}
