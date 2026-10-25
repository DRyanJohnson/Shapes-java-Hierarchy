Object-Oriented Shape Hierarchy 
An object-oriented Java project demonstrating class inheritance, polymorphism, custom sorting, and creational design patterns.
Built with a focus on code quality, defensive programming, and zero static analysis warnings under strict style guide rules.

Overview 
This project models a geometric shape system designed around clear separation of concerns:

AbstractShape (Abstract Base Class): Defines shared behavior and implements Comparable<AbstractShape> to enable automatic sorting
primarily by shape name and secondarily by calculated area.

Concrete Subclasses (Circle, Square, Triangle, Rectangle): Extend AbstractShape to implement specific area formulas and geometric behavior.

ShapeFactory (Factory Pattern): Handles shape instantiation separately from core shape logic to keep client code modular and decoupled.

ShapeTester (Driver/Controller): Instantiates 20 shape objects (including intentional duplicates) to test factory creation, verify sorting behavior,
and print clean formatted output.

Key Development Practices
Defensive Programming: Validates constructor inputs to ensure dimensions are positive, throwing descriptive IllegalArgumentException errors 
for zero or negative values.

Immutability & Safety: Explicitly uses final across fields, parameters, and classes to prevent unintentional state changes or method overrides.

Code Quality & Analysis: Passes Checkstyle and PMD static analysis with zero warnings, following strict software development standards.

Documentation: Fully documented using standard Javadocs across all classes, fields, and methods
