---
title: Abstraction
date: 26-12-2024
author: Manikanta Mandala
reference-url: https://www.geeksforgeeks.org/abstraction-in-java-2/
---

# Abstraction

Abstraction is a fundamental concept in object-oriented programming that allows
us to model real-world entities as classes and objects. It is the process of
hiding unnecessary details and exposing only essential features of an object or
class.

* Abstraction can be achieved in Java through interfaces and abstract classes.
* Abstract classes:
  - An abstract class is a class that cannot be instantiated and serves as a
    blueprint for subclasses.
  - Abstract classes can have abstract methods (methods without a body) as well
    as concrete methods (methods with a body).
  - Abstract methods are declared without an implementation in the abstract
    class and must be implemented by the concrete subclasses.
  - An abstract class can have constructors, fields, and non-abstract methods.
  - A class can extend only one abstract class.
  - Example:
  
    ```java
      abstract class Shape {
        protected String color;

        public Shape(String color) {
            this.color = color;
        }

        public abstract double area(); // abstract method

        public void displayColor() {
            System.out.println("Color: " + color);
        }
    }

    class Circle extends Shape {
        private double radius;

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(String color, double length, double width) {
            super(color);
            this.length = length;
            this.width = width;
        }

        @Override
        public double area() {
            return length * width;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Shape circle = new Circle("Red", 5.0);
            Shape rectangle = new Rectangle("Blue", 4.0, 3.0);

            System.out.println("Circle Area: " + circle.area());
            System.out.println("Rectangle Area: " + rectangle.area());

            circle.displayColor();
            rectangle.displayColor();
        }
    }

    ```
* **Interfaces**:
  - An interface is a collection of abstract methods (methods without a body)
    and constants (variables with `final` and `static` modifiers) that define a
    contract for the classes that implement it.
  - An interface provides a way to achieve full abstraction by allowing a class
    to inherit from multiple interfaces.
  - All the methods in an interface are implicitly `public` and `abstract`.
  - Interfaces can also include `default` and `static` methods with method
    bodies starting from Java 8.
  - Both default and static can’t be used in one method.
  - An interface cannot be instantiated directly; it can only be implemented by
    a class using the `implements` keyword.
  - By implementing an interface, a class agrees to provide an implementation
    for all the methods defined in the interface.
  - Multiple interfaces can be implemented by a single class, allowing for
    multiple inheritance of types.
  - Example:
    ```java
    interface Animal {
        void sound(); // abstract method
        default void eat() {
            System.out.println("Animal eats");
        }
    }

    class Dog implements Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    class Cat implements Animal {
        @Override
        public void sound() {
            System.out.println("Cat meows");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal dog = new Dog();
            Animal cat = new Cat();

            dog.sound(); // Output: Dog barks
            cat.sound(); // Output: Cat meows

            dog.eat(); // Output: Animal eats
            cat.eat(); // Output: Animal eats
        }
    }

    ```
* **Relationship between Abstraction, Interfaces, and Abstract Classes**:
    * Abstraction is the concept of hiding implementation details and
      exposing only essential features.
    * Interfaces and abstract classes are the mechanisms provided by Java to
      achieve abstraction.
    * Interfaces are used to achieve full abstraction by declaring a contract
      that the implementing classes must follow.
    * Abstract classes can have both abstract and concrete methods, providing
      a partial implementation of a class.
    * Abstract classes can also define abstract methods that must be
      implemented by the concrete subclasses.
    * Interfaces are useful when we want to provide common behaviour for
      unrelated classes, while abstract classes are useful when we want to
      provide common behaviour for closely related classes.
* **Methods in Interfaces and Abstract Classes**:
    * Interfaces can have `public`, `default`, and `static` methods starting from Java 8.
        * `public` methods: Must be implemented by the implementing classes.
        * `default` methods: Provide a default implementation in the interface itself. Implementing classes can choose to override them or use the default implementation.
        * `static` methods: Belong to the interface itself and can be called using the interface name. They cannot be overridden by implementing classes.
    * Abstract classes can have `public`, `protected`, and `package-private` (default) methods.
        * `public` and `protected` methods: Can be directly accessed by the implementing classes.
        * `package-private` methods: Can only be accessed by classes within the same package.
        * `private` methods: Cannot be defined in an interface or an abstract class as they are not inherited by the implementing classes.
  
---

END
