package edu.cmu.cs.cs214.lab02;

//No need to import if use fully qualified name
import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);

        Renderer renderer = new Renderer(rectangle);

        renderer.draw();
    }
}
