---
title: Polymorphism
date: 25-12-2024
author: Manikanta Mandala
reference-url: https://www.baeldung.com/java-polymorphism
---

# Polymorphism

Lets break the team and understand about it

Polymorphism = Poly + morph + ism

* Poly -> Many,
* Morph -> Forms,
* ism -> phenomenon

---

### Type of Polymorphism:

1. static or compile-time polymorphism
2. dynamic or run-time polymorphism

#### Static or Compile-Time Polymorphism
It is a type of polymorphism that is resolved during the compile-time of the
program execution.

This means that the method to do invoked is determined at compile-time. rather
than at run-time.

```java
public class TextFile extends GenericFile {
    //...

    public String read() {
        return this.getContent()
          .toString();
    }

    public String read(int limit) {
        return this.getContent()
          .toString()
          .substring(0, limit);
    }

    public String read(int start, int stop) {
        return this.getContent()
          .toString()
          .substring(start, stop);
    }
}
```

It differentiates with **method signature**.

#### Dynamic or Run-Time Polymorphism

The Java Virtual Machine(JVM) handles the detection of the appropriate method to
execute when a subclass to its parent form.

```java

class GenericFile {
    private String name;

    //...

    public String getFileInfo() {
        return "Generic File Impl";
    }
}

class ImageFile extends GenericFile {
    private int height;
    private int width;

    //... getters and setters
    
    public String getFileInfo() {
        return "Image File Impl";
    }
}

public class Main{
    public static void main(String[] args) {
        GenericFile genericFile = new ImageFile();
        logger.info("File Info: \n" + genericFile.getFileInfo());
    }
}
```

Output:
```
File Info:
Image File Impl
```

Here the type of `ImageFile` is implicitly type cast by JVM to `GenericFile`
but it also checks if the `ImageFile` has a overridden implementation of
`getFileInfo()`. If it does, Then JVM calls that method else it calls the
Super-class `getFileInfo()`

---

### Other Polymorphism Characteristics in Java

#### Coercion
Polymorphic coercion deals with implicit type conversion done by the compiler to
prevent type errors

```java
String str = “string” + 2;
```
Output:
```
str -> "string2"
```

#### Operator Overloading

Operator or method overloading refers to a polymorphic characteristic of same
symbol or operator having different meanings (forms) depending on the context.

For example, the plus symbol (+) can be used for mathematical addition as well
as String concatenation. In either case, only context (i.e. argument types)
determines the interpretation of the symbol:

```java
String str = "2" + 2;
int sum = 2 + 2;
System.out.printf(" str = %s\n sum = %d\n", str, sum);
```
Output:
```
str = 22
sum = 4
```

#### Polymorphic Parameters
Parametric polymorphism allows a name of a parameter or method in a class to be
associated with different types. We have a typical example below where we define
content as a String and later as an Integer:

```
public class TextFile extends GenericFile {
    private String content;
    
    public String setContentDelimiter() {
        Integer content = 100;
        this.content = this.content + content;
    }
}
```
Output:
```
instanceof this.content -> String
instanceof content -> Integer
```

It’s also important to note that declaration of polymorphic parameters can lead
to a problem known as variable hiding where a local declaration of a parameter
always overrides the global declaration of another parameter with the same name.

To solve this problem, it is often advisable to use global references such as
this keyword to point to global variables within a local context.

#### Polymorphic Subtypes

See the example carefully and understand Polymorphism Subtypes in Java

```java
class GenericFile {
    public void getInfo() {
        System.out.println("Generic File Info");
    }
    public void getContent() {
        System.out.println("The content of the Generic file");
    }
}

class ImageFile extends GenericFile {
    public void getInfo() {
        System.out.println("Image File Info");
    }

    public void getResolution() {
        System.out.println("Resolution: 1920x1080");
    }
}

public class Main {
    public static void main(String[] args) {
        // Line 1: Create an ImageFile object
        ImageFile imageFile = new ImageFile();

        // Line 2: Upcast to GenericFile
        GenericFile file = imageFile;

        // Line 3: Downcast back to ImageFile
        ImageFile castedImageFile = (ImageFile) file;

        // Test behavior
        file.getInfo(); // Calls the overridden method in ImageFile
        file.getContent(); // Calls the original method in GenericFile
        // file.getResolution(); // can't access the method
        castedImageFile.getResolution(); // Accesses ImageFile-specific method
    }
}
```
Output:
```
Image File Info
The content of the Generic file
Resolution: 1920x1080
```

---

### Problems With Polymorphism

#### Type Identification During Down-casting

```java
GenericFile file = new GenericFile();
ImageFile imageFile = (ImageFile) file;
System.out.println(imageFile.getHeight());
```

We notice that the compiler allows a downcast of a GenericFile into an
ImageFile, even though the class actually is a GenericFile and not an ImageFile.

Consequently, if we try to invoke the getHeight() method on the imageFile class,
we get a ClassCastException as GenericFile does not define getHeight() method:

```console
Exception in thread "main" java.lang.ClassCastException:
GenericFile cannot be cast to ImageFile
```

To solve this problem, the JVM performs a Run-Time Type Information (RTTI)
check. We can also attempt an explicit type identification by using the
instanceof keyword just like this:

To solve this problem, Java has two operators to check the type at Run-Time
(RTTI)
1. instanceof
2. getClass()

```java
ImageFile imageFile;
if (file instanceof ImageFile) {
  imageFile = file;
}
```

***RTTI check is expensive***

#### Fragile Base Case Problem


```java
class GenericFile {
    private String content;

    void writeContent(String content) {
        this.content = content;
    }
    void toString(String str) {
        str.toString();
    }
}
class TextFile extends GenericFile {
    @Override
    void writeContent(String content) {
        toString(content);
    }
}
```
modification of GenericFile:
```
class GenericFile {
    //...

    void toString(String str) {
        writeContent(str);
    }
}
```

We observe that the above modification leaves `TextFile` in an infinite recursion
in the `writeContent()` method, which eventually results in a stack overflow.

To address a fragile base class problem, we can use the `final` keyword to
prevent subclasses from overriding the `writeContent()` method. Proper
documentation can also help. And last but not least, the composition should
generally be preferred over inheritance.

---

END
