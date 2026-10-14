package model;

import java.util.Arrays;

public class ShapeModel {
    private Shape[] shapes;

    public ShapeModel() {
        shapes = new Shape[] {
            new Rectangle("Червоний", 4, 5),
            new Circle("Синій", 3),
            new Triangle("Зелений", 3, 4, 5),
            new Rectangle("Жовтий", 2, 7),
            new Circle("Червоний", 1.5),
            new Triangle("Синій", 6, 7, 8),
            new Rectangle("Зелений", 10, 3),
            new Circle("Жовтий", 5),
            new Triangle("Чорний", 5, 5, 6),
            new Rectangle("Синій", 1, 1)
        };
    }

    public Shape[] getShapes() {
        return shapes;
    }

    // Сумарна площа всіх фігур
    public double getTotalArea() {
        double sum = 0;
        for (Shape s : shapes) {
            sum += s.calcArea();
        }
        return sum;
    }

    // Сумарна площа фігур заданого виду ("Circle", "Rectangle", "Triangle")
    public double getAreaByType(String typeName) {
        double sum = 0;
        for (Shape s : shapes) {
            if (s.getClass().getSimpleName().equals(typeName)) {
                sum += s.calcArea();
            }
        }
        return sum;
    }

    // Сортування за площею
    public void sortByArea() {
        Arrays.sort(shapes, new AreaComparator());
    }

    // Сортування за кольором
    public void sortByColor() {
        Arrays.sort(shapes, new ColorComparator());
    }
}
