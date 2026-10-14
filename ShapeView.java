package view;

import model.Shape;

public class ShapeView {
    public void showMessage(String message) {
        System.out.println("\n=== " + message + " ===");
    }

    public void showShapes(Shape[] shapes) {
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }

    public void showArea(String text, double area) {
        System.out.println(text + String.format("%.2f", area));
    }
}
