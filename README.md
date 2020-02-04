# assignment-scala


Q1. Question on Ordered trait:

Define a class named Person and mix it with Ordered Trait to do the comparison.
First check if the name parameter of both object is equal. If yes, then do the comparison according to age.
If name is not equal then do the comparison based on name length.
class Person(val name: String, val age: Int) extends Ordered[Person]{
}

For example:

Input: personOne = new Person("Test", 24) and personTwo = new Person("Test", 25) 
personOne < personOne
Output: true

Input: personOne = new Person("TestAgain", 24) and personTwo = new Person("Test", 25) 
personOne < personOne
Output: false


Q2. Question on Value Class:

Define three Value classes namely: FirstName, LastName and Age
Define a method like - displayDetails which may take these three value classes as inputs and returns a string as: 
Output: Prashant Goel is of 24 years.

Q3. Question on Trait and packages:

Make a trait Queue which performs two functions of enqueue and dequque.
Two classes: DoubleQueue and SquareQueue mix in this trait.
You may use List for the implementation and keep both the classes in the same file with proper packaging.

DoubleQueue enqueues the element after doubling them
SquareQueue enqueues the element after squaring them
dequeue method will remove the first element from the queue(having concrete definition in trait Queue).

