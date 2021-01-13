package com.company;

public class Meroba extends Shape
{
    double x ; //עורך צלע

    public Meroba(int n , String name,double x){
        super(name,n);
        this.x = x;
    }

    public Meroba(String name, int n) {
        super(name, n);
    }

    public Double Area(){
        return  (x * x);

    }
    public Double Circum(){
        return  (x * 4);
    }
}
