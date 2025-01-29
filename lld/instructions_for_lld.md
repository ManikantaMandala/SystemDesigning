---
title: Steps to follow in LLD or Machine Coding round
author: Manikanta Mandala
url: https://nahbruh.notion.site/Steps-to-follow-in-LLD-Machine-Coding-round-bdf5a3053e104df98a84f625051b7fb9
---

### Step 0 : Overview

1. Align yourself to the thought process of the interviewer. By seeing the
   problem statement, two cases arises:
   * Already knew about the problem statement:
     * Explain your understanding to the interviewer so that both are aligned in
       same thought process.
     * Don't know the problem statement:
       * Ask the interviewer to give you the overview of the product
       
2. Questions you need to ask post understanding the problem statement:
   * What exactly do you want me to design?
     * Entities
     * Entire Design

   * Do I have to persist the data? - This tells that do we need to use the
     database or not
     * InMemory => use some data structures like HashMap or any other
     * DB => We need to use ORM for this
   
   * How does the user interact with the system?
     * REST API
     * Command Line
     * Hard Coding the values

### Step 1: Requirement Gathering

* Steps to be followed while gathering requirements:
  1. Don't ask for requirement from the interviewer
  2. You are leading the interview
  3. Suggest the ideas with rational
  4. Need to suggest 5 - 8 core features
  5. While suggesting the ideas, try to visualise as a user journey
  6. For every feature think about the edge case and future scope for changes
* Example: Design a Pen - gather requirements
  1. Any physical entity that can write is a pen
  2. Supporting following: Gel Pen, Ball Pen and Fountain Pen
  3. Gel pens and Ball pens have refills, other pens won't. Refills have ink
  4. Different inks will have different color
  5. For every pen, need to store brand name and price
  6. Pens can be closed via cap or a clicker
  7. Refills have nibs. Nibs contain radius/size of nib
  8. Fountain pen itself has a nib
  9. Behaviours:
    1. Pen should be able to write
    2. Open and close Behaviour on a pen
    3. We should be able to refill pen
    4. Include use and throw pens

### Step 2: UML Class Diagram

* Steps to create UML Class Diagram:
  * Visualize the user journey:
    * This way we can create entities for application
    * Entity means, for which we will create class. 99% nouns are entities
  * Find the nouns in the requirements
* Use the above Entities and create the UML diagram that tells about the
  relationship between these Entities

### Step 3: Design Schema

* This is applicable, if we need to persist the data
* Get thorough with SQL concepts like Normalization, Cardinality

### Step 4: E2E Working code

* This is applicable, if it's a machine Coding Round
* Get thorough with Design Patterns. Apply where it's required
