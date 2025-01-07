---
title: Inheritance
date: 25-12-2024
author: Manikanta Mandala
reference-url: https://www.baeldung.com/java-inheritance
---

# Inheritance

This is a principle of OOPs paradigm which enables us to reuse `existing code or 
extend the existing type`.

Why need Inheritance?
* It makes sense to `create a basic design and extend it to create their specialized
versions`

### Class Inheritance

* Classes in Java support **`single inheritance`**

```java
public class Car{
    int wheels;
    String model;
    void start(){
        // implementation of start method
    }
}

// sub-type of the Car
public class ArmoredCar extends Car{
    int bulletProofWindows;
    void remoteStartCar(){
      // The vehicle can start remotely
    }
}
```

Here the ArmoredCar class has all the properties and behaviour of Car and it has 
extra properties and behaviour too like `bulletProofWindows`, `remoteStartCar()`.

##### Access Modifiers:

1. `private`                  Won't inherit to the sub-classes, can't access outside the class
2. `default(package-private)` Will inherit only to the package classes, can't access outside the package
3. `protected`                Will inherit to its sub-classes only, can't access outside its sub-types
4. `public`                   Will inherit the properties to its sub-classes, can access everywhere

### Interface Inheritance

* Interface in Java support `multiple inheritance`.

```java
interface Floatable {
    void floatOnWater();
}

interface Flyable {
    void fly();
}

public class ArmoredCar extends Car implements Floatable, Flyable {
    void floatOnWater(){
        System.out.println("I can float!");
    }
    void fly(){
        System.out.println("I can fly!");
    }
}
```

### Issues with Multiple Interfaces

* Java allows multiple inheritance using interfaces

From Java 8, Interfaces could choose to define default implementation for its 
methods

**Java disallows inheritance of multiple implementations of the same methods 
signature, defined in separate interfaces.**

```java
interface Floatable {
    default void repair() {
    	System.out.println("Repairing Floatable object");	
    }
}

interface Flyable {
    default void repair() {
    	System.out.println("Repairing Flyable object");	
    }
}

class ArmoredCar extends Car implements Floatable, Flyable {
    // this won't compile
}
```

If we do want to implement both interfaces, we'll have to override the repair() 
method

Same with variables

```java
interface Floatable {
    int duration = 10;
}

interface Flyable {
    int duration = 20;
}

class ArmoredCar extends Car implements Floatable, Flyable {
 
    public void aMethod() {
    	System.out.println(duration); // won't compile
    	System.out.println(Floatable.duration); // outputs 10
    	System.out.println(Flyable.duration); // outputs 20
    }
}
```

### Interfaces Extending Other Interfaces

An interface can extend multiple interfaces

```java
interface Floatable {
    void floatOnWater();
}

interface Flyable {
    void fly();
}

public interface SpaceTraveller extends Floatable, Flyable {
    void remoteControl();
}
```

### Inheriting Type

When a class inherits another class or interface. Apart from inheriting the 
members, it also ***inherits their type***

```java
public class Employee {
    private String name;
    private Car car;
    
    // standard constructor
    public Employee(String name, Car car){
        this.name = name;
        this.car = car;
    }
}

Employee e1 = new Employee("Chandu", new ArmoredCar());
Employee e2 = new Employee("Uday", new SpaceCar());
Employee e3 = new Employee("Vijay", new BMW());
```

### Hidden Class Members

#### Hidden Instance Members

What happens if both the superclass and subclass define a variable or method
with the same name? Don’t worry; we can still access both of them. However, we
must make our intent clear to Java, by prefixing the variable or method with
the keywords this or super.

```java
public class ArmoredCar extends Car {
    private String model;
    public String getAValue() {
    	return super.model;   // returns value of model defined in base class Car
    	// return this.model;   // will return value of model defined in ArmoredCar
    	// return model;   // will return value of model defined in ArmoredCar
    }
}
```

#### Hidden Static Members
 
Super class static methods calling
```java
class Car {
    public static String msg() {
        return "Car";
    }
}
class ArmoredCar extends Car {
    public static String msg() {
        // return super.msg(); // this won't compile.
        return Car.msg();
    }
}
```

Output:
``` 
Car 
```

----

```java
class Car {
    public static String msg() {
        return "Car";
    }
}
class ArmoredCar extends Car {
    public static String msg() {
        return "ArmoredCar";
    }
}
public class Main{
    public static void main(String[] args){
        Car first = new Car();
        ArmoredCar second = new ArmoredCar();
        
        System.out.println(Car.msg());
        System.out.println(ArmoredCar.msg());
        
        System.out.println(first.msg());
        System.out.println(second.msg());
    }
}
```

Output:
```
Car
ArmoredCar

Car
ArmoredCar
```
---
END
