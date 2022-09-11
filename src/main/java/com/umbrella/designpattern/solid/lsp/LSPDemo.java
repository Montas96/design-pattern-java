package com.umbrella.designpattern.solid.lsp;

/***
 * the Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with objects of its subclasses
 * without breaking the application.
 * In other words, what we want is to have the objects of our subclasses behaving the same way as the objects of our superclass.
 */
class LSPDemo {
    /**
     * Here the calculate method violate LSP because the area value expected for a square shape is wrong,
     * despite the correct values for Rectangles.
     * */
    static void calculate(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + ", got " + rectangle.getArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        calculate(rectangle);

        Rectangle square = new Square(5);
        calculate(square);
    }
}