# Introduction to Kotlin

Xavier Alvarez

05/04/2019

---

# Kintroduction

Xavier Alvarez

05/04/2019

---

## A couple words

@ul
- Developed by [JetBrains](https://www.jetbrains.com/)
- Inspired by Java, C#, JavaScript, Scala and Groovy
- Started on 2010
- 1.0 on 2016
@ulend

---

## Workshop Repository

[https://github.com/xalvarez/introduction-to-kotlin](https://github.com/xalvarez/introduction-to-kotlin)

@img[no-border](assets/img/qr-repo.png)

---

## Classes

---

### Exercise

Create the classes *Square* and *Triangle* which inherit from *Shape* taking into account:

1. Shapes have base and height, which never change, and beauty, which does change
2. We need a method that calculates the area of a shape
3. We need tests!

---

### What have we learned?

@ul
- Constructors, getters and setters are given to us *for free*
- Kotlin prefers default values over method overloading
- Simple methods can be written in one line
- Kotlin dependencies simplify dependency management
@ulend

---

## Nullability

@ul
- [The Billion Dollar Mistake](https://en.wikipedia.org/wiki/Tony_Hoare#Apologies_and_retractions) (Tony Hoare)
- Unless explicitly stated, nothing can be null
- If something can be null, compiler forces devs to deal with it
@ulend

---

### Exercise

Create the class *SquareService* which implements the following methods:

1. **getAreaWithNonNullableSquare**, which receives a non-nullable Square and calculates its area.
2. **getAreaWithNullableSquare**, which receives a nullable Square and calculates its area.

Don't forget to create the corresponding tests!

---

### What have we learned?

@ul
- Kotlin discourages relying on nulls
- Developers always need to be aware of nulls
@ulend