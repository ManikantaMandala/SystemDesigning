---
title: Bridge Design Pattern
date: 15-01-2025
author: Manikanta Mandala
url: https://refactoring.guru/design-patterns/bridge
---

# Bridge Design Pattern

## Introduction

* Structural Design Pattern
* lets you split a large class or a set of closely related classes into two
  separate hierarchies 
* `abstraction` and `implementation` - which can be developed independently of each
  other

## Problem Statement

* Lets imagine you have to write a program that has 3D shapes. These 3D shapes
  have a property Colour. If every 3D shape has Different colour then we should
  create every combination of the color and shape. 
* Lets say Shape has two types: Sphere and Cuboid. And the colors are two red
  and blue
* That means 4 combinations:
  1. RedSphere
  2. RedCuboid
  3. BlueSphere
  4. BlueCuboid
* If any new shape or color is introduced then there should be multiple
  classes to implement.

## Solution

* Use Abstraction(Interface) and Implementation(Platform) and Composition(has-a
  relationship)
* Lets understand by above example
* There should be a Abstraction, here it is Shape
* Sphere and Cuboid are the Shape
* The Composition will be between Abstraction and the Implementation, here Color
* The implementations, Color would be Red, Blue

---

* Here is the UML diagram for it

![bridge_shape_color_uml](https://refactoring.guru/images/patterns/diagrams/bridge/solution-en-2x.png)

## General Structure

![bridge_general_structure](https://refactoring.guru/images/patterns/diagrams/bridge/structure-en-indexed-2x.png)

## Example Code

[shape_color_bridge](../code/designpatterns/src/main/java/code/bridge/shape_color/README.md)
[device_remote_bridge](../code/designpatterns/src/main/java/code/bridge/device_remote_bridge/README.md)


## Applicability

* Use the Bridge pattern when you want to divide and organize a monolithic class
  that has several variants of some functionality (for example, if the class can
  work with various database servers).
* Use the pattern when you need to extend a class in several orthogonal
  (independent) dimensions.
* Use the Bridge if you need to be able to switch implementations at runtime.

## How to Implement
* Identify the orthogonal dimensions in your classes. These independent concepts
  could be: abstraction/platform, domain/infrastructure, front-end/back-end, or
  interface/implementation.
 
* See what operations the client needs and define them in the base abstraction
  class.
 
* Determine the operations available on all platforms. Declare the ones that the
  abstraction needs in the general implementation interface.
 
* For all platforms in your domain create concrete implementation classes, but
  make sure they all follow the implementation interface.
 
* Inside the abstraction class, add a reference field for the implementation
  type. The abstraction delegates most of the work to the implementation object
  that’s referenced in that field.
 
* If you have several variants of high-level logic, create refined abstractions
  for each variant by extending the base abstraction class.
 
* The client code should pass an implementation object to the abstraction’s
  constructor to associate one with the other. After that, the client can forget
  about the implementation and work only with the abstraction object.

## Pros and Cons

### Pros:

* You can create platform-independent classes and apps.
* The client code works with high-level abstractions. It isn’t exposed to the
  platform details.
* Open/Closed Principle. You can introduce new abstractions and implementations
  independently from each other.
* Single Responsibility Principle. You can focus on high-level logic in the
  abstraction and on platform details in the implementation.

### Cons:

* You might make the code more complicated by applying the pattern to a highly
  cohesive class.


---

END

