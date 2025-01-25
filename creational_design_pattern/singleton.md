---
title: Singleton Design Pattern
date: 15-01-2025
author: Manikanta Mandala
url: https://refactoring.guru/design-patterns/singleton
---

# Singleton Design Pattern

## Introduction

* Creational Design Pattern
* This ensures that the class have only one instance
* while providing the global access point to this instance

## Problem Statement

If you want to have a class that
1. Ensure the instance of the class have only single instance
2. Provide a global access point to that instance

Why need like this type of properties:
1. First for file resource things
2. Second for Database connections
3. Heavy to instantiate an object

## Solution

Singleton Design Pattern will solve this type of problem

### Steps to create Singleton Design Pattern

1. Make the class constructor private
2. Create a private static variable that is same as that class
3. Create a public static function that returns same as that class
4. For Multithread environment, make the instance variable `volatile` and add
   synchronize body or keyword to that block or method

## General Structure

![singleton_general_structure](https://refactoring.guru/images/patterns/diagrams/singleton/structure-en-indexed-2x.png)

## Example code

[Singleton](../code/designpatterns/src/main/java/code/creational/singleton/README.md)

## Applicability

* When the class should have only one instance
* When you need stricter control on the global variables

## Pros and Cons

### Pros

* sure that only a single instance will be created.
* Gain global access point to that instance.
* Singleton object is initialled only when it's requested for the first time

### Cons

* Violates SRP
* The Singleton pattern can mask bad design, for instance, when the components
  of the program know too much about each other.
* The pattern requires special treatment in a multithreaded environment so that
  multiple threads won’t create a singleton object several times.
* Testing the Singleton class will be difficult

---

END
