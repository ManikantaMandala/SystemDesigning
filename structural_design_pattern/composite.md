---
title: Composite Design Pattern
date: 17-01-2025
author: Manikanta Mandala
url: https://refactoring.guru/design-patterns/composite
---

# Composite Design Pattern

## Introduction

* Structural Design Pattern
* lets you compose objects into tree structures 
* then work with these structures as if they were individual objects

## Problem Statement

* For example, You are creating a Cart feature. There are Products, also some
  previous products and group of products in the Cart.
* Now you want to calculate the price of the products in the Cart.
* A Brute Force Solution is go through every products and group of products in
  the Cart and calculate the price.
* But this is a brute force, We should improve this.

## Solution

* To improve this, we can make an interface that should be implemented by both
  Products and also the group of Products
* This will improve the performance of the System.

---



## General Structure

![bridge_general_structure](https://refactoring.guru/images/patterns/diagrams/bridge/structure-en-indexed-2x.png)

## Example Code

[device_remote_bridge](../code/designpatterns/src/main/java/code/bridge/device_remote_bridge/README.md)

## Applicability

* implement tree-like structure
* treat simple and complex elements uniformly

## How to Implement

1. Make sure that the core model of your app can be represented as a tree
   structure. Try to break it down into simple elements and containers. Remember
   that containers must be able to contain both simple elements and other
   containers.

2. Declare the component interface with a list of methods that make sense for
   both simple and complex components.

3. Create a leaf class to represent simple elements. A program may have multiple
   different leaf classes.

4. Create a container class to represent complex elements. In this class,
   provide an array field for storing references to sub-elements. The array must
   be able to store both leaves and containers, so make sure it’s declared with
   the component interface type.

5. While implementing the methods of the component interface, remember that a
   container is supposed to be delegating most of the work to sub-elements.

6. Finally, define the methods for adding and removal of child elements in the
   container.

7. Keep in mind that these operations can be declared in the component
   interface. This would violate the Interface Segregation Principle because the
   methods will be empty in the leaf class. However, the client will be able to
   treat all the elements equally, even when composing the tree.

## Pros and Cons

### Pros:

* You can work with complex tree structures more conveniently: use polymorphism
  and recursion to your advantage.
* Open/Closed Principle. You can introduce new element types into the app
  without breaking the existing code, which now works with the object tree.

### Cons:

* It might be difficult to provide a common interface for classes whose
  functionality differs too much. In certain scenarios, you’d need to
  over generalize the component interface, making it harder to comprehend.

---

END

