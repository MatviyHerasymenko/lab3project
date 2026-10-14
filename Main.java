import controller.ShapeController;
import model.ShapeModel;
import view.ShapeView;

public class Main {
    public static void main(String[] args) {
        ShapeModel model = new ShapeModel();
        ShapeView view = new ShapeView();
        ShapeController controller = new ShapeController(model, view);
        controller.run();
    }
}
