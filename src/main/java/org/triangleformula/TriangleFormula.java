package org.triangleformula;


public class TriangleFormula {
    private double a;
    private double b;
    private double c;

    public TriangleFormula(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double p = (a + b + c) / 2;
        double area = Math.floor(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        return area;
    }
}
