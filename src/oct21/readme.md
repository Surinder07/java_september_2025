## Recap 

### encapsulation 
concept of OOP to wrap the data into single unit
data members and functions 
and we restrict direct to the data 

so the access can be controlled by us. 

getters/setters 

### abstraction 

hiding complex details from the user and showing what is necessary 
not showing the internal implementation of an object 

how to achieve abstraction ? 
1. abstract class 

we do not provide the implementation 
it can be instantiated, i.e you cannot create object of abstract class 




Problem 
1. Bank of canada prime rate : 4.70%,
    prime + base 
  4.70 + 1.99 = 

scotia 
4.70 + 0.99 

TD 
4.70 + 2.99 

PragraBank 
4.70 + .50


## super 
refer to the parent class variable and method also 

## final 
1. variable 
it makes the variable constant 
 final int x = 10;
x = 20; // this is wrong  

2. method as final 

// this method cannot be overriden
public final void test(){

}

3. used for a class
you cannot inherit from that class 






## interfaces 

its a contract a class have to implement from where it inherits


    A 
    |
    B   

interface A {

// contract
// all the  methods in the interface are by default abstract 

}
class B implements A {

// should fulfill all the contract given by class A 
}


















