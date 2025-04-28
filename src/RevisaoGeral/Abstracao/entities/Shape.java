package RevisaoGeral.Abstracao.entities;

import RevisaoGeral.Abstracao.entities.enums.Color;

public abstract class Shape {

    protected Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double area();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
