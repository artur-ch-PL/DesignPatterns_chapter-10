# DesignPatterns_chapter-10
State Pattern:
Allow an object to alter its behavior when its internal state changes.
The object will appear to change its class.

Design principle
==================================================================================================
A class should have only one reason to change


In short
==================================================================================================
* The State Pattern allows an object to have many different behaviors that are based on its internal state.
* Unlike procedural state machine, the State Pattern represents state as a full blown class.
* The Context gets its behavior by delegating to the current state object it is composed with.
* By encapsulating each state in a class, we localize any changes that will need to be made.
* The State and Strategy patterns have the same class diagram, but they differ in intent.
* Strategy Pattern typically configures Context classes with a behavior or algorithm
* State Pattern allows a Context to change its behavior as the state of the Context changes. 
* State transitions can be controlled by by the State classes or by Context classes.
* Using the State Pattern will typically result in a greater number of classes in your design.
* State classes may be shared among Context instances. 
