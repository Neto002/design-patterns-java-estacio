import Prototype.FiguraPrototype;

import java.util.ArrayList;
import java.util.List;

public class Figuras {
    private static Figuras instance = new Figuras();
    List<FiguraPrototype> figuras;

    private Figuras() {
        this.figuras = new ArrayList<>();
    }

    public static synchronized Figuras getInstance() {
        if (instance == null) {
            instance = new Figuras();
        }
        return instance;
    }
}
