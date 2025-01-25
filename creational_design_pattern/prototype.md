---
title: Prototype Design Pattern
author: Manikanta Mandala
date: 09-01-2025
url: https://refactoring.guru/design-patterns/builder
---

# Prototype Design Pattern

## Introduction

* Creational Design Pattern
* Lets you copy existing objects without making your code dependent on their
  classes

## Problem Statement

* You have an object, you want to create an exact copy of the object without
  strong coupling them. 

## Solution

* The solution to this problem is Prototype Design Pattern
* It lets the object's class to implement a clone method that creates the exact
  copy of that object.
* There are just two things to this:
  1. Create an Interface that has clone() method. Implement to the classes that
     will be cloned.
  2. Create a parameter constructor to those classes which implement this
     interface. And the parameter should the same type of the class that
     implements it.

## General Structure

![prototype_general_structure](https://refactoring.guru/images/patterns/diagrams/prototype/structure-indexed-2x.png)

## Example code

[Shape Prototype](../code/designpatterns/src/main/java/code/creational/prototype/README.md)

## Applicability

1. No dependence on concrete classes that need to be copied
2. Reduce the number of subclasses that only differ in the way they initialize
   their respective objects


## Pros and Cons

### Pros

* You can clone objects without coupling to their concrete classes.
* You can get rid of repeated initialization code in favor of cloning pre-built
  prototypes.
* You can produce complex objects more conveniently.
* You get an alternative to inheritance when dealing with configuration presets
  for complex objects.

### Cons

* Cloning complex objects that have circular references might be very tricky.

---

END
