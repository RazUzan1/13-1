package com.company;

public class Mesholash extends Shape
{

    double x1;
    double x2;
    double x3;
    public Mesholash(int n, String name ,double x1 , double x2 , double x3 ){
        super(name ,n);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    public Mesholash(String name, int n) {
        super(name, n);
    }

    public Double Area(){
        return (x1 * x2 / 2);

    }
    public Double Circum(){
        return  (x1 + x2 +x3);
    }
}
