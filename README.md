# AbstractFactoryPattern

Note
--------------
The Abstract Factory design pattern is similar to the Factory Method design pattern just discussed. Both solve the problem of how to create objects that conform to an abstract interface in a way that moves the responsibility for creating the objects outside of the client. The client decides when the objects are created but another class outside of the client decides what classes are created.

What distinguishes the Abstract Factory design pattern from the Factory Method design pattern is that the Abstract Factory design pattern is designed to create families of related objects. The key word here is family. Factory Method is designed to create one type of object. Abstract Factory is designed to create a family of related products.

Diagrams
--------------
- Base class diagram

![alt text](https://github.com/vudph/AbstractFactoryPattern/blob/master/resources/abstract-factory-uml.gif "Base Diagram")

- With 2 concrete factories for 2 product families

![alt text](https://github.com/vudph/AbstractFactoryPattern/blob/master/resources/AbstractFactoryDiagram.png "Class Diagram")
