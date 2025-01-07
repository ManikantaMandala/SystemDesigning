---
title: Factory Method Design Pattern
author: Manikanta Mandala
date: 02-01-2025
url: https://refactoring.guru/design-patterns/factory-method
---

# Factory Method

## Introduction

* Creational Design Pattern
* Provides an interface to create an object in a superclass
* But also, allows the subclasses to alter the type of the Object

---

* As an example, seen the [Vehicle Rental System](../code/factory_method/README.md)
* In this example, Rental is the superclass.
* CarRental, BikeRental, TruckRental are subclasses
* Vehicle is the interface
* We use Inheritance here in both cases, superclass(creator)[Rental] and its subclasses
* and also in the Interface(product)[Vehicle] which has its subclasses(Bike,
  Car, Truck)

## Problem Statement

If there is a way you can create different types of an Entity. And you only
attached one or a countable different type by directly extending and using it
everywhere then we get an other type to be added then The refactoring will be
very costly. As It is used in many places.

From the above example, At the starting Vehicle Rental System only rents Cars.
And you used it everywhere directly with an interface. And then your Vehicle
Rental System boomed up. Now you want to extend your rental service to Bike and
Truck too. Here, Is where you have to refactor a lot. 

## Solution

To avide this situation, you need to use factory-method Design Pattern.

It is suggest that if you replace the direct creation with new operator. with a
special *Factory Method* which creates the specific type of product you wanted.

like this,

![Factory-Method-Flow-Card](https://refactoring.guru/images/patterns/diagrams/factory-method/structure-indexed.png)

1. The Product declares the interface, which is common to all objects that can
   be produced by the creator and its subclasses.

2. Concrete Products are different implementations of the product interface.

3. The Creator class declares the factory method that returns new product
   objects. It’s important that the return type of this method matches the
   product interface.
   
   You can declare the factory method as abstract to force all subclasses to
   implement their own versions of the method. As an alternative, the base
   factory method can return some default product type.
   
   Note, despite its name, product creation is not the primary responsibility of
   the creator. Usually, the creator class already has some core business logic
   related to products. The factory method helps to decouple this logic from the
   concrete product classes. Here is an analogy: a large software development
   company can have a training department for programmers. However, the primary
   function of the company as a whole is still writing code, not producing
   programmers.

4. **Concrete Creators** override the base factory method so it returns a
   different type of product. 
   
   Note that the factory method doesn’t have to create new instances all the
   time. It can also return existing objects from a cache, an object pool, or
   another source.
   
## Example Code

1. [Vehicle Rental System](../code/factory_method/README.md)
2. [UI Dialog](https://refactoring.guru/design-patterns/factory-method)

## Applicability

*  you don’t know beforehand the exact types and dependencies of the objects
   your code should work with
*  you want to provide users of your library or framework with a way to extend
   its internal components.
*  you want to save system resources by reusing existing objects instead of
   rebuilding them each time.
## Pros and Cons

Pros:
* You avoid tight coupling
* Single responsibility principle is followed
* Open-close principle is followed

Cons:
* Can have complicated classes
---
END
