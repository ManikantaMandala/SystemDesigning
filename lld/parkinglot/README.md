---
title: Parking Lot Management System
author: Manikanta Mandala
date: 29-01-2025
---

# Problem statement

Design a Parking Lot Management System

# Step 0: Overview

1. Understand the problem statement:
  1. Parking Lot is the area where the Vehicles are parked.
  2. Vehicles can be of different types:
    1. 2 wheeler: Motor Cycle
    2. 4 wheeler: Cars
  3. Parking Lots are used in many places like: Malls, Cricket stadiums, etc..
  4. People who use these Parking lots should pay for the usage
2. Post understanding questions
  1. What should I design Entity or Entire Diagram? Entire Diagram
  2. Who should I persist the data? In Memory
  3. How the user will use this application? Command Line

# Step 1: Requirements Gathering

1. Multiple Floors for Parking Lot
2. Every Floor has multiple no of Slots.
3. These Slots are Vehicle type specific and Only one Vehicle can be in the Spot
4. Every Floor has its Gates
5. Gates are two type: Entry gate, Exit gate
6. Entry gate and Exit gate are different
7. User will enter to the Parking Lot via any Entry gate
8. When they enter the Operator at the Entry gate notes some details like time
   of entry, and Vehicle number etc.. And allocates a Slot to the Vehicle (This
   is optional in a real interview. Make it easy to implement in the interview)
9. When User exits from the Parking Lot then the Operator at the Exit gate will
   calculates the Payment Bill and Provides it to User
10. Cost varies with the duration of the parking of vehicle.
11. Cost per hour:
  1. duration < 1 hour -> 10
  2. duration >= 1 hour -> 20 
  3. duration > 2 hour -> 30
12. User should pay that amount via Cash or Online UPI
13. After payment the User can exit from the Parking Lot

# Step 2: Create UML Diagram

[Parking Lot UML Diagram](parkinglot_uml_diagram.md)

# Step 3: If you want to persist in DB

As it is In Memory, Skipping this step

# Step 4: Work on the Code

[Parking Lot](./)
