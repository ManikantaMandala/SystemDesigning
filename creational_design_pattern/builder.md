---
title: Builder Design Pattern
author: Manikanta Mandala
date: 09-01-2025
url: https://refactoring.guru/design-patterns/builder
---

# Builder Design Pattern

## Introduction

* Creational Design Pattern
* Construction of complex objects step by step

## Problem Statement

* Complex object that requires laborious, step by step initialization of many
  fields and nested objects.
* This initialization code is usually buried inside a monstrous constructor with
  lots of parameters.
* Lets take an example, building a car. To build a car, we need to build an
  engine, build the body of the car, and attach parts like doors, windows, tires
  etc...
* These are the basic things that make the Car, car.
* The simple solution is to extend the base Car class and create a set of
  subclasses to cover all combinations of parameters. 
* Problem with this approach is that their will be a lot of subclasses if we
  create these subclasses.
* Or creating a giant constructor or polymorphic constructors is better option
  for this but It will create unnecessary things to handle in the class.

## Solution

* The solution for this is BUILDER DESIGN PATTERN.

### Builder

* This design patterns tells that separate the building process to an other
  class that handles the building stuff.
* This separate class is Builder class
* This builds every part of the Car. Let it be doors, windows, tires, body of
  the car.
* And this Builder class has various steps.
* These steps can be used to build the Car. 
* The important thing is that *you not need to call every step in the Builder
  class*.
* Some of the construction steps might require different implementation when you
  need to build various representations of the product.
* For example, Doors of a Car may be built of Iron, but the Body of the Car can
  be built using different material like stainless-steel.
* Here you can create a set of different implementation of creating the
  Product(Car)
* There is a understanding to this, every time a step is called it will return
  Builder that has the property to the newly added step.

### Director

* This class can be optional, but the Director class tells the Builder class
  what steps to follow and what not to follow.
* This might not the Product

## General Structure

![Builder_Design_Pattern](https://refactoring.guru/images/patterns/diagrams/builder/structure-indexed-2x.png)

## Example code

[Car Builder](../code/designpatterns/src/main/java/code/creational/builder/carbuilder/README.md)
[House Builder](../code/designpatterns/src/main/java/code/creational/builder/housebuilder/README.md)
[User Builder](../code/designpatterns/src/main/java/code/creational/builder/user/README.md)

## Applicability

* TELESCOPE CONSTRUCTOR
* When you want your code to be able to create different representations of some
  product (for example, stone and wooden houses).
* To construct Composite trees or other complex objects.

## Pros and Cons
* You can construct objects step-by-step, defer construction steps or run steps recursively.
* You can reuse the same construction code when building various representations of products.
* SRP
* OCP

---
END
