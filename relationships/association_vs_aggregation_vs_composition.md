---
title: Association Vs Aggregation Vs Composition
date: 26-12-2024
author: Manikanta Mandala
reference-url: https://www.baeldung.com/java-composition-aggregation-association
---

# Association Vs Aggregation vs Composition

## Introduction

Objects have relationship between them in both real-life and also in
programming. Sometimes its difficult to understand the relationship.

Object Oriented Programming Paradigm mainly has 4 types of relationships

1. [Association](./association.md)
2. [Aggregation](./aggregation.md)
3. [Composition](./composition.md)

Just go through these relationships and come here to implement the knowledge

## Table

| Relationships | Condition-1   | Condition-2    |
| :-----------  | :-----------: | -------------: |
| Composition   | No            | Yes            |
| Aggregation   | Yes           | Yes            |
| Association   | Yes           | No             |

> * Condition-1: Are the Entities are independent?
>    * Can a entity be replaced?
> * Condition-2: Are the Either of the entities are part of or member of another?

## Assignment

### Problem Statement

Make a model of University, which has its departments. Professors work in each
departments, who also has friends among each other. And also these Professors
can be a part of different departments.

### Explanation

Will the `Department`s exist after we close the `University`? Of course not,
therefore `Department` and `University` have ***Composition*** relationship.

But the `Professors` will still exist(hopefully). 
Next, we have to decide which is more logical: 
1. if we consider `Professor`s as parts of the `Department`s or not. (Or) are they members of the `Department`s or not?
Yes, they are the members of the `Department`. So, it's an **Aggregation**
relationship
On top of that, a `Professor` can work in multiple `Department`s.

The relationship between `Professor`s is association because it doesn't make any
sense to say that a `Professor` is part of another one.

### UML Diagram:

![University_Design](https://www.baeldung.com/wp-content/uploads/2019/08/complex-example.png)

### Code

```java

class University{
    List<Department> departments;
}

class Department{
    List<Professor> Professors;
}

class Professor{
    List<Department> departments;
    List<Professor> friends;
}

```

## Conclusion

If we **rely on the terms "has-a", "belongs-to", "member-of", "part-of",** and
so on, we can more easily identify the relationships between our entities;
