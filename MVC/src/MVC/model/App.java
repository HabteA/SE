package MVC.model;

public class App {

    public static void main(String[] args) {
        // Assemble all the pieces of the MVC
        Model m = new Model("Habte", "Assefa");
        View v = new View("MVC Model Demo");
        Controller c = new Controller(m, v);
        c.initController();
    }

}