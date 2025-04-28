package RevisaoGeral.Abstracao.entities;

import RevisaoGeral.Abstracao.entities.enums.Color;

public class Circle extends Shape{

    private Double radius;

    public Circle(Double radius) {

    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
