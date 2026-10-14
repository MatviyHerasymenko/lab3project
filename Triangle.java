package model;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Площа за формулою Герона
    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void draw() {
        System.out.println("Малюємо трикутник зі сторонами " + a + ", " + b + ", " + c);
    }

    @Override
    public String toString() {
        return "Triangle [колір: " + shapeColor + ", сторони: " + a + ", " + b + ", " + c
                + ", площа: " + String.format("%.2f", calcArea()) + "]";
    }
}
