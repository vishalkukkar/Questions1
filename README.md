# Question


#   1. Objective: Algorithm:

Reverses a single list. Need answer with Java code
The Node of the single list as the following:
class Node{
 Node next;
 int value;
}
// TDD

1>null =null (the List is null)
2>1->null =1->null (the list has only one Node with value 1)

// Continue to list as many kinds of test cases as you can imagine here:
JUnit test cases in Java code are welcome but not required here, pseudo code is okay like that 2 cases I list as the example.

public Node reverseList(Node head){
// Give resolution here. Please make sure your resolution covers all above-listed test cases.
// JUnit test cases are not required but you are welcome to provide it to save my time to verify your resolution. 
// It is a good habit for the software engineer to prepare JUnit test cases.


}

#   Answer - under package com.fortinet.example





















#   2. Select one from Singleton，Dynamic Proxy，
  Factory and Interpreter design pattern or the one you like most. 
Assume you are using Java 7+


#   Answer - 

Factory Pattern :
- Creating the object without exposing the creation logic to the client and refer to newly created object using a common interface.

// scenario(s):

-  Suppose a client need to draw an object (Ex. Circle, Rectange, Square). But doesn't know what concret classes will be required at runtime, but just wants to get a class that will do the job.


// Code(s)

#   under package com.fortinet.factorypattern

