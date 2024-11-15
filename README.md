# Better Rectangle Program

## Description
This was a school assignment for my Java programming course. The task was to create a subclass of Java's `Rectangle` class called `BetterRectangle`. The standard `java.awt.Rectangle` class does not provide methods to compute the area or perimeter of a rectangle, so `BetterRectangle` was designed to add these functionalities. The program includes the following elements:

- A `getPerimeter` method that calculates the perimeter of the rectangle.
- A `getArea` method that calculates the area of the rectangle.

The `BetterRectangle` class does not add any new instance variables. Instead, it uses the existing functionality of the `Rectangle` class. In the constructor, the program calls `setLocation` and `setSize` methods inherited from `Rectangle` to initialize the rectangle's position and size.

A test program named `BetterRectangleTester` was provided for us to validate the functionality of `BetterRectangle`. We were instructed not to modify the test program when submitted.
