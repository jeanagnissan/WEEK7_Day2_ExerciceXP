package exercice1;

import exercice1.Shape;

public class XShape extends Shape {
    private String name;

    public XShape(String name) { // Default Constructor
        this.name = name;
    }

    @Override
    public String getName() {
        return super.getName() + ", " + this.name;
    }
}
