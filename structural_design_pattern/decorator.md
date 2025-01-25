---
title: Decorator Design Pattern
date: 20-01-2025
author: Manikanta Mandala
url: https://refactoring.guru/design-patterns/decorator
---

# Decorator Design Pattern

## Introduction

* Structural Design Pattern
* Lets you attach new behaviour to the objects by placing these objects inside
  special wrapper objects that contains the behaviours.

## Problem Statement

* Imagine that have a Notification system that sends message to a list of
  customers about the important events.
* The initial version of the library has only A `Notifier` class that had only
  few fields, a constructor and a `send(message)` method.
* This `message` parameter is the message that will be sent to the list of
  customers.
* This message is sent via SMS.
* After being successful, customers want the library to improve with other
  Notifying methods like sending message via Slack, or by Facebook.
* Now The most common thing is to extend the `Notifier` class and implement the
  other features.
* Lets say the classes are `SlackNotifier` and `FackbookNotifier`.
* But the customers want the Notification system to send both `SlackNotifier` and
  `FackbookNotifier` if enabled.
* Then the brute-force thing to do is implement like `SlackFackbookNotifier` or
  `SMSSlackNotifier` or `SMSFackbookNotifier`.
* But if in future the `Notifier` classes increase the combinations will be hough. 

## Solution

* This is when we use Decorator Design Pattern

## General Structure


   
## Example Code

* [Notification_System_Decorator](../code/designpatterns/src/main/java/code/structural/decorator/notification_system/README.md)
* [Data Source Read and Write with Encryption or Compression](../code/designpatterns/src/main/java/code/structural/decorator/data_source/README.md)

## Applicability

* When you need to be able to assign extra behaviours to objects at runtime
  without breaking the code that uses these objects.
* When it's awkward or not possible to extend an object's behaviour using
  inheritance.

## Pros and Cons

### Pros:

* extend object's behaviour without making a new subclass.
* Add or remove responsibilities from an object at runtime.
* Combine several behaviours by wrapping an object into multiple decorators.
* SRP

### Cons:

* hard to remove a specific wrapper from the wrappers stack
* hard to implement a decorator in such a way that its behaviour doesn't depend
  on the order in the decorators stack
* Initial configuration code of layers might look pretty ugly.

---

END


