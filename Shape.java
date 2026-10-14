package model;


public abstract class Shape implements Drawable {
    protected String shapeColor; // колір фігури

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    // Абстрактний метод обчислення площі
    public abstract double calcArea();

    @Override
    public String toString() {
        return "Фігура, колір: " + shapeColor;
    }
}
