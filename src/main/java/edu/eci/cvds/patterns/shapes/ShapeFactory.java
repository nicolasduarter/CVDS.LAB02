package edu.eci.cvds.patterns.shapes;


import edu.eci.cvds.patterns.shapes.concrete.*;


public interface ShapeFactory {
    static Shape create(RegularShapeType type){
        return switch (type) {
            case Triangle -> new Triangle();
            case Quadrilateral -> new Quadrilateral();
            case Pentagon -> new Pentagon();
            case Hexagon -> new Hexagon();
            default -> null;
        };
    }
}
