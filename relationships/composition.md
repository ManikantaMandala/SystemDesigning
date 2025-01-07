---
title: Composition
date: 26-12-2024
author: Manikanta Mandala
reference-url: https://www.baeldung.com/java-composition-aggregation-association
---

# Composition

## Introduction

Objects have relationship between them in both real-life and also in
programming. Sometimes its difficult to understand the relationship.

So lets understand the one of the 3 relationship apart from Inheritance(is-a)
between objects in Java which is a `Strong has-a` type relationship and has a
ownership between two entities

That is!(As the heading suggestion)

COMPOSITION

## What is Composition?

Composition is a `belongs-to` relationship between two objects. It is also
called `has-a` relationship between two objects.

In a `has-a` relationship, There will be a container and members.

We tell the relationship like, 

```
container 'has-a' member 

or

member 'belongs-to' container
```

Composition is a `Strong has-a` relationship between objects

In Composition, the objects life-cycles are tied to each other meaning that if
we destroy the owner objects, its members also will be destroyed.

With respect to cardinality, **All of the parts need to have exactly one
container**

## UML diagrams

![Composition_Img](https://www.baeldung.com/wp-content/uploads/2019/08/composition.png)

This is how the Composition is represented between both entities. We use a
Diamond symbol with colouring.

![Composition_arrow](https://www.baeldung.com/wp-content/uploads/2019/08/composition-arrow.png)

We can also represent the Composition like this.

![Composition_example](https://www.baeldung.com/wp-content/uploads/2019/08/composition-example.png)

This is how we represent the relationship between `Building` and `Room`

### Explanation of the Example

A `Room` belongs to a `Building`, or in other words a `Building` 'has-a' `Room`.
So basically, If we destroy the `Building`(Container) the `Room`(Member) will also
be destroyed. 

But if we remove the walls of the `Room`(Member) then It won't destroy the
`Building`(Container)

## Source Code

```java
class Building {
    class Room {}   
}
```

We can use Java's implicit referencing between two entities(Here Building, Room)

### What is Implicit Referencing in Java?

Implicit Referencing is it implicitly reference the inner class(`Room`) with the
outer class(`Building`) when creating the objects.

This Implicit Referencing can be only done with `non-static inner class`

```java
class Building{
    String buildingName;
    public Building(String name){
        this.name = name;
    }
    class Room{
        void printBuildingName(){
            System.out.println("The building name: " + Building.this.name);
        }
    }
}

public class Main{
    public static void main(String[] args){
        Building building = new Building("Building-1");
        Building.Room room = building.new Room();
        room.printBuildingName();
    }
}
```
Here, `building` and `room` are implicitly referenced (linked)

---

END
