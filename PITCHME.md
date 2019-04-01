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

Create the classes *Square* and *Triangle* which inherit from *Polygon* taking into account:

1. Polygons have base and height, which never change, and beauty, which does change
2. We need a method that calculates the area of a polygon
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

---

## Extension methods

@ul
- They allow us to extend a class' behaviour without inheriting from it
- Original motivation: writing util methods without having to implements tons of methods (e.g. StringUtils)
@ulend

---

### Exercise

Create a method *describe* in *SquareService* which receives a variable amount of Squares and for each of them does the
following:

1. Print the fhe following message: "A square with base = `<base of the square>` has an area
equal to `<area of the square>`"
2. The message is printed using a an extension method from the class List

---

### What have we learned?

@ul
- *vararg* is the Kotlin modifier for a variable amount of parameters
- String interpolation behaves just like in Javascript
- Extension methods can potentially reduce boilerplate code
@ulend

---

## Data classes

@ul
- Equivalent to Java POJOs
- Provides typical *equals()*, *hashCode()* and *toString()* methods
- Provides convenience method *copy()*
@ulend

---

### Exercise

Given a new data class *Line* which has the attributes colour and weight:

1. Create a *LineService* class containing a method *newWithDoubleWeight()*
2. *newWithDoubleWeight()* has a *Line* parameter and returns a new Line with double the weight of the previous one

---

### What have we learned?

@ul
- data classes are the way to go for Entities / "POJOs"
- They behave similar to Lombok's data classes
@ulend

---

## Kotlin Standard Library

---

### Idioms

---

#### apply

```
fun <T> T.apply(block: T.() -> Unit): T
```

_"Do something with an object and return the same object"_

Typical use case: instantiate an object with default values and set only the ones you need

Reference: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/apply.html

---

#### use

```
fun <T : Closeable?, R> T.use(block: (T) -> R): R
```
_"Do something with a resource, close it and return a result"_

Typical use case: reading or writing from a closeable stream (equivalent to Java's
try-with-resources)

Reference: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.io/use.html