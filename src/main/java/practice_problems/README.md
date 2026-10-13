# Practice Problems — Week 10: Abstraction and Interfaces

This folder contains Java solutions for the five Category C coding problems.

## Part B — Quiz answer key

1. **C** — Abstraction hides implementation details and shows what an operation does.
2. **C** — An abstract class cannot be instantiated directly.
3. **B** — A concrete subclass must implement inherited abstract methods, or it must also be abstract.
4. **C** — An abstract method cannot be private because a subclass must be able to implement/override it.
5. **C** — Interface fields are implicitly public, static, and final.
6. **C** — A class can implement any number of interfaces.
7. **D** — Implemented interface methods must be public.
8. **C** — Java avoids multiple inheritance of classes; interfaces provide multiple-type contracts without inheriting multiple class instance states. Interfaces can have default methods, so conflicts may still require an explicit override.
9. **D** — If two unrelated interfaces provide the same default method, the implementing class must resolve the conflict by overriding it.
10. **B** — An abstract class can have a constructor that runs as part of constructing a subclass object.

## Part C — Concept answers

### 1. Abstraction and a real-life example
Abstraction exposes the operations a user needs while hiding the internal steps. For example, a food delivery app lets a customer select a meal, pay, and track an order; the customer does not need to see the internal database queries, payment-processing steps, or dispatch algorithm.

### 2. Abstraction versus encapsulation
Abstraction focuses on **what** an object does and hides implementation complexity. Encapsulation groups data and methods together and restricts direct access to internal state. A class can expose simple public methods while keeping fields private and validating changes inside those methods.

### 3. Constructor in an abstract class
An abstract class cannot be instantiated directly, but it can define a constructor to initialize shared fields. That constructor executes when a concrete subclass object is created, as part of the superclass-constructor chain.

### 4. Why abstract methods cannot be private, static, or final
- **private:** a subclass cannot access and implement/override a private method.
- **static:** static methods belong to the class and are not overridden polymorphically as instance methods.
- **final:** a final method cannot be overridden, which contradicts the requirement that a concrete subclass provide the implementation.

### 5. Diamond problem
The diamond problem occurs in multiple inheritance when a class inherits the same method or state through two parent paths and it is ambiguous which implementation should apply. Java allows a class to extend only one class, avoiding multiple inheritance of class state. A class can implement multiple interfaces, but if unrelated interfaces provide conflicting default methods, the class must explicitly override the method to resolve the conflict.
