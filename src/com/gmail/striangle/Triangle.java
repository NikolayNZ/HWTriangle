package com.gmail.striangle;

public class Triangle {
    private double a;
    private double b;
    private double c;


    Triangle (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle(){
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double squareTriangle() {
        double p = (a+b+c)/2.0;
        double s = Math.sqrt(p * (p - a) * (p - a) * (p - a));
        return s;
    }

    @Override
    public String toString() {
        return "Triangle{" + "side A = " + a + ", side B = " + b + ", side C = " + c + '}';
    }
}
