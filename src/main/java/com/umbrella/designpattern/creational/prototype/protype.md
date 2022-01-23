# Prototype

### _First of all a prototype is clonable object._

Prototype design pattern is used when the Object creation is a costly affair and requires a **lot** of time and resources,
and you have a similar object already existing.

Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our
needs.

Prototype design pattern uses java cloning to copy the object. But one hic may appear, some object can’t be copied
because of their private attributes can’t be retrieved outside.

The prototype design pattern delegates the cloning process to the objects that are going to be copied.

It declares a common interface for all objects that can be cloned.

This interface allows you to clone an object without coupling your code to the class of this object.

Typically, such an interface contains only one clone method.

The implementation of this method is similar in all classes. It creates an object of the current class and carries over
the values of the attributes of the original object into the new one.

You can also copy private attributes, since most programming languages allow access to object of the same class.

When your objects have dozens of attributes and hundreds of possible configurations, cloning is an alternative to
subclassing.

### They work as follows:

> You create a set of differently configured objects. As soon as you need one of these items, you clone a prototype rather than building a new one.

## Basic implementation

![alt text](../../../../../../resources/img/structure.png "structure")

> The Concrete Prototype class implements the clone method. In addition to copying data from the original object into the clone, this method can handle special cases of the cloning process, such as nested objects, unraveling recursive dependencies, etc.

## Implementing the Prototype Registry

![alt text](../../../../../../resources/img/structure-prototype-cache.png "structure-prototype-cache")

> The Prototype Registry makes it easy to access frequently used prototypes. It stores a set of pre-built objects that have already been copied. The simplest prototype registry is a hash map name → prototype. If you want better search criteria than just a name, build a more robust version of the registry.

## Prototype Design Pattern Example

![alt text](../../../../../../resources/img/prototype-example.png "prototype-example")

> All forms implement the same interface, and the latter provides a method of cloning.
>
> A subclass can call its parent's clone method before copying the values of its own attributes into the object.

[Shape.java](./Shape.java)

[Circle.java](./Circle.java)

[Rectangle.java](./Rectangle.java)

## Advantages and disadvantages

:heavy_check_mark: You can clone objects without coupling them with their concrete classes.

:heavy_check_mark: You clone pre-built prototypes, and you can get rid of redundant initialization code.

:heavy_check_mark: You can create complex objects more easily.

:heavy_check_mark: You get an alternative to inheritance for managing complex object configuration patterns.

:x: Cloner des objets complexes dotés de références circulaires peut se révéler très difficile.

## Relation with other patterns

- The Factory is often used early in the design (less complicated and more personalized thanks to subclasses) and evolves into the abstract Factory, the Prototype, or the Builder (the latter being more flexible, but more complicated).
- Abstract Factory classes are often based on a set of Factories, but you can also use the Prototype to write their methods.
- The Prototype is useful when you want to save copies of Orders in the history.
- Designs that rely heavily on Composite and Decorator benefit from using the Prototype. It allows you to clone complex structures rather than rebuilding them from scratch.
- The Prototype is not based on inheritance, so it does not have its disadvantages. But the prototype requires complicated initialization for the cloned object. The Factory is based on inheritance, but does not need an initialization step.
- Sometimes the Prototype can replace the Memento and offer a simpler solution. This is only possible if the object (the state you want to store in history) is fairly straightforward and doesn't have links to external resources, or the links are easy to recreate.
- Abstract Factories, Assemblers and Prototypes can all be implemented as Singletons.
