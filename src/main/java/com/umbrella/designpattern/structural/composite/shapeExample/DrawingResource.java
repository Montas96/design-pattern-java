package com.umbrella.designpattern.structural.composite.shapeExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/composite")
public class DrawingResource {

    @GetMapping("/shape")
    public void draw() {
        Shape triangle = new Triangle();
        Shape triangle1 = new Triangle();
        Shape circle = new Circle();
        Drawing drawing = new Drawing();
        drawing.add(triangle1);
        drawing.add(triangle1);
        drawing.add(circle);
        drawing.draw("Red");
        drawing.clear();
        drawing.add(triangle);
        drawing.add(circle);
        drawing.draw("Green");
    }
}
