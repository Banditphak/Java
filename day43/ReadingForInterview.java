package day43;
public class ReadingForInterview {

//	What's inheritance in java?
//	- It is process where one class can inherit visible properties from another class. Parent child relationship.
//	- we use extends keyword to do inheritance.


//	How many classes one class can extend at the same time?
//	- just one because java supports only single type inheritance.

//	Why java doesn't support multiple type inheritance?
//	- the diamond problem

//	What's the difference between method overloading and method overriding?
//	- overloading is when we have methods with the different type, number, or order of arguments with the same name in the class.
//	- overriding when child class overrides parent class's methods. 
//	Rules for overriding:
//	  1. The same name.
//	  2. The access modifier should be same or more visible.
//	  3. Return type should be the same or covariant.
//	  4. Arguments should be the same.
//	  5. if parent method has exception declared, the child method can have the same or smaller exception, or non.

//	Can you override static methods?
//	- no, we cannot override static method(they will be hidden).

//	What will happen if child class defines the same variable as parent class?
//	- parent class variables get hidden.

//	Can you override constructor?
//	- no  

//	What are the two class that every class will extend from?
//	- there is no two classes. Every class will extend java.lang.Object

//	How to prevent class from being extended?
//	- make class final.

//	How to prevent method from being override?
//	- make method final.

//	How to compare custom object from the same class?
//	1. We will override equals and hashCode methods.
//	2. And use equals for our comparision.
}
