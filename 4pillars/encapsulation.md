---
title: Encapsulation
date: 26-12-2024
author: Manikanta Mandala
reference-url: 
---

# Encapsulation

Encapsulation is a fundamental concept in object-oriented programming that
combines data and methods into a single unit called a class. It involves the
bundling of related data and behaviours together and controlling access to them
through the use of access modifiers.

* Encapsulation provides data hiding, which means that the internal details of
  an object are hidden from the outside world. Only the methods defined within
  the class can access and modify the internal state of the object.
* Encapsulation promotes modularity and code reusability by organizing related
  data and behaviors into a single entity.
* The internal state of an object is accessed and modified through public
  methods, also known as getters and setters, which provide controlled access
  to the data.
* This concept helps in maintaining the integrity and consistency of the
  object's state by preventing direct access to its internal data from outside
  the class.

Example:
```java
public class Car {
    private String color;
    private int speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setSpeed(60);

        System.out.println("Color: " + car.getColor()); // Output: Color: Red
        System.out.println("Speed: " + car.getSpeed()); // Output: Speed: 60

        car.setSpeed(-10); // Trying to set negative speed
        System.out.println("Speed: " + car.getSpeed()); // Output: Speed: 60 (No change)
    }
}

```

In the above example, the `Car` class encapsulates the `color` and `speed`
properties by making them private. The access to these properties is controlled
through public getter and setter methods. The setter method for `speed`
validates the input and sets the speed only if it is non-negative. This ensures
that the internal state of the `Car` object remains consistent and valid.

Encapsulation provides several benefits, including data protection, code
maintainability, and flexibility. It allows for easy modification of internal
implementation details without affecting the code that uses the class. It also
helps in achieving code re-usability by hiding the internal complexities of the
class and providing a simple interface for interacting with the object.
