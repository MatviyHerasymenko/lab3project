package controller;

import model.ShapeModel;
import view.ShapeView;


public class ShapeController {
    private ShapeModel model;
    private ShapeView view;

    public ShapeController(ShapeModel model, ShapeView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        view.showMessage("Набір даних");
        view.showShapes(model.getShapes());

        view.showMessage("Сумарна площа");
        view.showArea("Усіх фігур: ", model.getTotalArea());
        view.showArea("Прямокутників: ", model.getAreaByType("Rectangle"));
        view.showArea("Трикутників: ", model.getAreaByType("Triangle"));
        view.showArea("Кіл: ", model.getAreaByType("Circle"));

        model.sortByArea();
        view.showMessage("Сортування за площею");
        view.showShapes(model.getShapes());

        model.sortByColor();
        view.showMessage("Сортування за кольором");
        view.showShapes(model.getShapes());
    }
}
