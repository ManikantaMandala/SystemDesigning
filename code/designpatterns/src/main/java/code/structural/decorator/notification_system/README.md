---
title: Notification System
date: 24-01-2025
author: Manikanta Mandala
url: https://refactoring.guru/design-patterns/decorator/
---

# Problem statement

The notification library was initially designed for email notifications, but
users now demand support for multiple channels (e.g., SMS, Slack, Facebook) and
the ability to combine them. The current subclass-based approach results in a
combinatorial explosion of classes, making the system hard to scale, maintain,
and use. A new design is needed to support flexible, dynamic multi-channel
notifications without bloating the codebase.

# Solution

[Notification System UML Diagram](./notification_system_uml_diagram.md)

