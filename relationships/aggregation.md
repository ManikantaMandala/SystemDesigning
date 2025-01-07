---
title: Aggregation
date: 26-12-2024
author: Manikanta Mandala
reference-url: https://www.baeldung.com/java-composition-aggregation-association
---

# Aggregation

## Introduction

Objects have relationship between them in both real-life and also in
programming. Sometimes its difficult to understand the relationship.

So lets understand the one of the 3 relationship apart from Inheritance(is-a)
between objects in Java which is `Lose has-a` relationship.

That is!(As the heading suggestion)

AGGREGATION

## Aggregation

This is also a `has-a` relationship. What different with the Composition is the
owning.

In Aggregation, it doesn't involve owning. Two entities life-cycles aren't tied
up. They can exist without having relationship between each other too.

A member doesn't need to be tied to only one container.

## UML Diagram

![Aggregation](https://www.baeldung.com/wp-content/uploads/2019/08/aggregation.png)

Aggregation is similar to Composition but As it is a `Weak has-a` Relationship.
We just represent with only diamond symbol without colouring it.

![Aggregation_Example](https://www.baeldung.com/wp-content/uploads/2019/08/aggregation-example.png)

### Explanation of Example

A `Car` and its `Wheel`s. **We can take of the `Wheel`s, and they'll still
exist**. We can mount other (pre-existing) `Wheel`s, or install these to another
car and everything will work just fine.

Of course, a `Car` without `Wheel`s or a detached `Wheel` won't be as useful as
a `Car` with its `Wheel`s on. But that's why this relationship existed in the
first place: to **assemble the parts to a bigger construct, which is capable of
more things than its parts**.

## Source Code

```java 
class Wheel {}

class Car {
    List<Wheel> wheels;
}
```
This will create only uni-direction relationship between `Wheel` and `Car`

or

```java
class Car {
    List<Wheel> wheels;
    static class Wheel {}
}
```
This will not create an implicit reference to the enclosing class(`Car`). So,
It's specify [Aggregation](#Aggregation)

Java will create an *implicit reference* only in `non-static inner classes`.

or

```java
class Wheel{
    Car car;
}

class Car{
    List<Wheel> wheels;
}
```
This will create bi-directional relationship between `Wheel` and `Car`. So that
we can say `Wheel` belongs to `Car` and `Car` has a `Wheel`
