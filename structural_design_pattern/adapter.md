---
title: Adapter Design Pattern
date: 10-01-2025
url: https://refactoring.guru/design-patterns/adapter/
author: Manikanta Mandala
---

# Adapter Design Pattern

## Introduction

* Structural Design Pattern
* allows the object with incompatible interfaces to collaborate
* There is a adapter between these incompatible interfaces that makes the
  interfaces collaborate.

## Problem Statement

* Imagine that you are creating a Program that uses a particular type of
  dependency.
* At initial point, you only integrated with one dependency.
* But As time passes, your Program wants to integrate external dependency(3rd
  party).
* It will be a costly refactoring of code.

## Solution

* Create a separate interface that acts like an ADAPTOR.
* That acts like a broker in between.
* Here how it works:
  1. The adapter gets an interface that is compatible with one the existing
     objects.
  2. Using this interface the existing object can safely call the adapter's
     methods.
  3. Upon receiving the call, the adapter passes the request to the second
     object, but in a format and order that the second objects expects.
* Sometimes it's possible to create two way adapter that can convert on both the
  directions.

## General Structure

### Object adapter

* Uses object composition principle
* the adapter implements the interface of one object and wraps the other one. 

![Adapter_general_structure](https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter-indexed-2x.png)
   
## Example Code

* [Payment Gate way](../code/designpatterns/src/main/java/code/structural/adapter/README.md)

## Applicability

* Use the Adapter class when you want to use some existing class, but its
  interface isn’t compatible with the rest of your code.
* Use the pattern when you want to reuse several existing subclasses that lack
  some common functionality that can’t be added to the superclass.

## Pros and Cons

### Pros:

* SRP
* OCP

### Cons:

* Complex

---
END

